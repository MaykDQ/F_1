/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author oo
 */
public class UI extends JFrame implements ActionListener {
    
    private JButton btn_boton;
    private JTextField txt_text;
    private JLabel lbl_label;
    private JLabel lbl_label_show;
    
    public  UI () {
        super( "Otero" );
        
        this.makeWindow();
        
        //this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(600,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void makeWindow() {
        this.setLayout(new FlowLayout());
        btn_boton = new JButton("Enviar");
        txt_text = new JTextField(20);
        lbl_label = new JLabel("Escribe un Texto");
        lbl_label_show = new JLabel();
        
        this.add(lbl_label);
        this.add(txt_text);
        this.add(btn_boton);
        this.add(lbl_label_show);
        
        btn_boton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getSource() == btn_boton ) {
            lbl_label_show.setText( txt_text.getText() );
            JOptionPane.showMessageDialog(null, txt_text.getText());
        }
    }
    
}
