package org.daisy.dotify.devtools;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import org.daisy.braille.table.BrailleConverter;
import org.daisy.braille.table.Table;
import org.daisy.braille.table.TableCatalog;
import org.daisy.dotify.text.FilterLocale;
import org.daisy.dotify.translator.BrailleTranslator;
import org.daisy.dotify.translator.BrailleTranslatorFactory;
import org.daisy.dotify.translator.BrailleTranslatorFactoryMaker;
import org.daisy.dotify.translator.BrailleTranslatorResult;
import org.daisy.dotify.translator.UnsupportedSpecificationException;


public class TranslatorDemo extends javax.swing.JFrame {
	final JTextArea textPanel;
	final JTextArea braillePanel;
	final JTextArea braille2Panel;
	final JComboBox tableSelect;
	final JCheckBox hyphenate;
	private BrailleConverter conv;
	private BrailleTranslator t;
	private int limit;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3237476094594239863L;

	public TranslatorDemo() {
		this.textPanel = new JTextArea(5, 40);
		this.braillePanel = new JTextArea(10, 40);
		this.braille2Panel = new JTextArea(10, 40);
		this.tableSelect = new JComboBox();
		this.hyphenate = new JCheckBox("Hyphenate");
		this.limit = 30;
		try {
			initComponents();
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    private void initComponents() throws FontFormatException, IOException {
        //Create and set up the window.
        setTitle("Translator demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        textPanel.setLineWrap(true);
        braillePanel.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        
        InputStream fs = this.getClass().getResourceAsStream("resource-files/odt2braille6.ttf");
        Font f = Font.createFont(Font.TRUETYPE_FONT, fs);
        fs.close();
        braille2Panel.setFont(f.deriveFont(24f));
        
		try {
			t = BrailleTranslatorFactoryMaker.newInstance().newBrailleTranslator(FilterLocale.parse("sv-SE"), BrailleTranslatorFactory.MODE_UNCONTRACTED);
		} catch (UnsupportedSpecificationException e) {
			throw new RuntimeException("Cannot translate");
		}
		TableCatalog tc = TableCatalog.newInstance();
		Collection<Table> list = tc.list();
		for (Table t : list) {
			tableSelect.addItem(new TableWrapper(t));
		}
		tableSelect.addActionListener(new TableSelectActionListener());
		tableSelect.setSelectedIndex(0);
        //conv = TableCatalog.newInstance().get("se_tpb.CXTableProvider.TableType.SV_SE_CX").newBrailleConverter();
		hyphenate.addActionListener(new HyphenateActionListener());
		hyphenate.setSelected(true);

        KeyListener kl = new InputKeyListener();
        textPanel.addKeyListener(kl);
        
        braille2Panel.setEditable(false);
        Color c = new Color(250,250,255);
        braille2Panel.setBackground(c);
        braillePanel.setEditable(false);
        braillePanel.setBackground(c);

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(mainLayout);
        getContentPane().setBackground(Color.BLACK);
        mainLayout.setAutoCreateGaps(true);
        mainLayout.setAutoCreateContainerGaps(true);
        JLabel textLabel = new JLabel("Text Input");
        textLabel.setForeground(Color.GRAY);
        JLabel brailleLabel = new JLabel("Braille (CX)");
        brailleLabel.setForeground(Color.GRAY);
        
        JLabel braille2Label = new JLabel("Braille (Unicode)");
        braille2Label.setForeground(Color.GRAY);
        
        GroupLayout.SequentialGroup h2Group = mainLayout.createSequentialGroup();
        h2Group.addGroup(mainLayout.createParallelGroup()
        		.addComponent(textLabel)
        		.addComponent(textPanel)
        		.addComponent(hyphenate)
        		.addComponent(braille2Label)
        		.addComponent(braille2Panel)
        		.addComponent(tableSelect)
        		.addComponent(brailleLabel)
        		.addComponent(braillePanel)
        		);
        mainLayout.setHorizontalGroup(h2Group);
        
        GroupLayout.SequentialGroup v2Group = mainLayout.createSequentialGroup();
        v2Group
    	.addComponent(textLabel)
    	.addComponent(textPanel)
    	.addComponent(hyphenate)
    	.addComponent(braille2Label)
    	.addComponent(braille2Panel)
    	.addComponent(tableSelect)
        .addComponent(brailleLabel)
    	.addComponent(braillePanel);
        mainLayout.setVerticalGroup(v2Group);
        
        //Display the window.
        pack();
        setLocationRelativeTo(null);
    }
    
    public void updateHyphenating() {
    	t.setHyphenating(hyphenate.isSelected());
    	updateTranslation();
    }
    
    public void updateConverter() {
    	String id = ((TableWrapper)tableSelect.getSelectedItem()).t.getIdentifier();
    	conv = TableCatalog.newInstance().get(id).newBrailleConverter();
    	updateTranslation();
    }
    
    public void updateTranslation() {
		BrailleTranslatorResult btr = t.translate(textPanel.getText());
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		while (btr.hasNext()) {
			String braille = btr.nextTranslatedRow(limit, true);
			sb2.append(braille+"\n");
			sb.append(conv.toText(braille)+"\n");
		}
		braille2Panel.setText(sb2.toString());
		braillePanel.setText(sb.toString());
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TranslatorDemo().setVisible(true);
            }
        });
    }
    
    private class TableWrapper {
    	private final Table t;
    	public TableWrapper(Table t) {
    		this.t = t;
    	}
		@Override
		public String toString() {
			return t.getDisplayName();
		}
    	
    }
    
    public class TableSelectActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			updateConverter();
		}
    	
    }
    
    public class HyphenateActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			updateHyphenating();
		}
    	
    }
    
    public class InputKeyListener implements KeyListener {

    	public InputKeyListener() { }

		@Override
		public void keyPressed(KeyEvent e) { }

		@Override
		public void keyReleased(KeyEvent e) { updateTranslation(); }

		@Override
		public void keyTyped(KeyEvent e) { }
    	
    }
    
}
