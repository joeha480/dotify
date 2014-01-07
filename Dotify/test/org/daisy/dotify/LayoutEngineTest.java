package org.daisy.dotify;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.transform.stream.StreamSource;

import org.daisy.braille.pef.PEFFileCompare;
import org.daisy.braille.pef.PEFFileCompareException;
import org.daisy.dotify.api.engine.FormatterEngine;
import org.daisy.dotify.api.engine.LayoutEngineException;
import org.daisy.dotify.api.translator.BrailleTranslatorFactory;
import org.daisy.dotify.api.writer.MediaTypes;
import org.daisy.dotify.api.writer.PagedMediaWriterConfigurationException;
import org.daisy.dotify.consumer.engine.FormatterEngineMaker;
import org.daisy.dotify.consumer.writer.PagedMediaWriterFactoryMaker;
import org.daisy.dotify.writer.TextMediaWriter;
import org.junit.Test;
public class LayoutEngineTest {
	
	@Test
	public void testLayoutEnginge() throws LayoutEngineException, IOException {
		//set line separator for this test, as text media writer result is dependent on its value
		System.setProperty("line.separator", "\r\n");
		FormatterEngine engine = FormatterEngineMaker.newInstance().newFormatterEngine("en",
				BrailleTranslatorFactory.MODE_BYPASS,
				new TextMediaWriter("utf-8"));
		File res = File.createTempFile("TestResult", ".tmp");
		res.deleteOnExit();
		
		engine.convert(this.getClass().getResourceAsStream("resource-files/obfl-input.obfl"), new FileOutputStream(res));
		
		try {
			int ret = compareBinary(this.getClass().getResourceAsStream("resource-files/obfl-expected.txt"), new FileInputStream(res));
			assertEquals("Binary compare is equal", -1, ret);
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		} finally {
			if (!res.delete()) {
				System.err.println("Delete failed.");
			}
		}
	}

	@Test
	public void testLayoutEngingeDLS() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		FormatterEngine engine = FormatterEngineMaker.newInstance().newFormatterEngine("sv-SE",
				BrailleTranslatorFactory.MODE_UNCONTRACTED, 
				PagedMediaWriterFactoryMaker.newInstance().newPagedMediaWriter(MediaTypes.PEF_MEDIA_TYPE));

		File res = File.createTempFile("TestResult", ".tmp");
		res.deleteOnExit();

		engine.convert(this.getClass().getResourceAsStream("resource-files/obfl-input-dls.obfl"), new FileOutputStream(res));

		try {
			PEFFileCompare cmp = new PEFFileCompare();
			cmp.compare(new StreamSource(this.getClass().getResourceAsStream("resource-files/obfl-dls-expected.pef")), new StreamSource(new FileInputStream(res)));
			assertEquals("Binary compare is equal", -1, cmp.getPos());
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		} catch (PEFFileCompareException e) {
			e.printStackTrace();
			fail();
		} finally {
			if (!res.delete()) {
				System.err.println("Delete failed.");
			}
			if (res.isFile()) {
				System.out.println(res.getAbsolutePath());
			}
		}
	}

	public int compareBinary(InputStream f1, InputStream f2) throws IOException {
		InputStream bf1 = new BufferedInputStream(f1);
		InputStream bf2 = new BufferedInputStream(f2);
		int pos = 0;
		try {
			int b1;
			int b2;
			while ((b1 = bf1.read()) != -1 & b1 == (b2 = bf2.read())) {
				pos++;
				// continue
			}
			if (b1 != -1 || b2 != -1) {
				return pos;
			}
			return -1;
		} finally {
			bf1.close();
			bf2.close();
		}
	}
}