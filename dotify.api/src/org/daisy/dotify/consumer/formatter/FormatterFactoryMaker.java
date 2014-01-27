package org.daisy.dotify.consumer.formatter;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.spi.ServiceRegistry;

import org.daisy.dotify.api.formatter.Formatter;
import org.daisy.dotify.api.formatter.FormatterConfigurationException;
import org.daisy.dotify.api.formatter.FormatterFactory;
import org.daisy.dotify.api.obfl.ExpressionFactory;
import org.daisy.dotify.api.translator.BrailleTranslatorFactoryMakerService;
import org.daisy.dotify.consumer.obfl.ExpressionFactoryMaker;
import org.daisy.dotify.consumer.translator.BrailleTranslatorFactoryMaker;

/**
 * Provides a factory for formatters. The factory will instantiate 
 * the first Formatter it encounters when querying the services API. 
 * 
 * @author Joel Håkansson
 */
public class FormatterFactoryMaker {
	private final FormatterFactory proxy;
	
	public FormatterFactoryMaker() {
		//Gets the first formatter (assumes there is at least one).
		proxy = ServiceRegistry.lookupProviders(FormatterFactory.class).next();
		try {
			proxy.setReference(BrailleTranslatorFactoryMakerService.class, BrailleTranslatorFactoryMaker.newInstance());
		} catch (FormatterConfigurationException e) {
			Logger.getLogger(this.getClass().getCanonicalName()).log(Level.WARNING, "Failed to set reference.", e);
		}
		try {
			proxy.setReference(ExpressionFactory.class, ExpressionFactoryMaker.newInstance().getFactory());
		} catch (FormatterConfigurationException e) {
			Logger.getLogger(this.getClass().getCanonicalName()).log(Level.WARNING, "Failed to set reference.", e);
		}
	}

	public static FormatterFactoryMaker newInstance() {
		return new FormatterFactoryMaker();
	}
	
	public FormatterFactory getFactory() {
		return proxy;
	}
	
	public Formatter newFormatter(String locale, String mode) {
		return proxy.newFormatter(locale, mode);
	}
}
