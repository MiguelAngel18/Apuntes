/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author miguelhernandezrodriguez
 */
public class S11JTextField {
    
    public static void main(String[] args){
        MarcoJTextField marco=new MarcoJTextField();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);        
    }
}
    
class MarcoJTextField extends JFrame{
    
    public MarcoJTextField(){
        setTitle("Marco con Cuadros de Texto");
        setBounds(600,300,600,350);
        LaminaJTextField miLamina=new LaminaJTextField();
        add(miLamina);
    }   
}
class LaminaJTextField extends JPanel{    
    private JTextField campo;
    private JButton boton;
    
    public LaminaJTextField(){
        campo=new JTextField(20);
        //campo=new JTextField("Texto por defecto");
        //campo=new JTextField("Texto por defecto",20);
        //campo=new JTextField();
        add(campo);
        boton=new JButton("Pulsar");
        add(boton);
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(campo.getText());
            }   
        });
    }
}