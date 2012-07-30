package org.daisy.dotify.devtools.views;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;

import org.daisy.dotify.devtools.converters.BrailleNotationConverter;


public class BrailleConvertPanel extends JPanel {
	JLabel label;
	JTextField input;
	final StringFormatterResult tr;
	
	public BrailleConvertPanel(StringFormatterResult tr) {
		this.tr = tr;
        label = new JLabel();
        label.setText("Braille (p-notation)");
        input = new JTextField(30);
        input.addKeyListener(new KeyAdapter(){
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode()==10) {
					buttonActionPerformed();
				}
			}
			});
        JButton button = new JButton();
        button.setText("To Code Points ↓");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed();
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        setLayout(layout);
        //getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
      
        // The sequential group in turn contains two parallel groups.
        // One parallel group contains the labels, the other the text fields.
        // Putting the labels in a parallel group along the horizontal axis
        // positions them at the same x location.
        //
        // Variable indentation is used to reinforce the level of grouping.
        hGroup.addGroup(layout.createParallelGroup().
                 addComponent(label));
        hGroup.addGroup(layout.createParallelGroup().
                 addComponent(input).addComponent(button));
        layout.setHorizontalGroup(hGroup);
        
        // Create a sequential group for the vertical axis.
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
      
        // The sequential group contains two parallel groups that align
        // the contents along the baseline. The first parallel group contains
        // the first label and text field, and the second parallel group contains
        // the second label and text field. By using a sequential group
        // the labels and text fields are positioned vertically after one another.
        vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).
                 addComponent(label).addComponent(input));
        vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).
                 addComponent(button));
        layout.setVerticalGroup(vGroup);
	}
	
    private void buttonActionPerformed() {
    	tr.setResult(BrailleNotationConverter.parsePNotation(input.getText()));
    }

}