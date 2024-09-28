/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author miguelhernandezrodriguez
 */
public class S15JCheckBox {
    
    public static void main(String[] args){
        MarcoJCheckBox marco=new MarcoJCheckBox();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);        
    }
}
    
class MarcoJCheckBox extends JFrame{
    
    public MarcoJCheckBox(){
        setTitle("Marco con Casillas de Verificación");
        setBounds(600,300,500,200);
        LaminaJCheckBox miLamina=new LaminaJCheckBox();
        add(miLamina);
    }   
}

class LaminaJCheckBox extends JPanel{
    private JCheckBox check1, check2;
    private JLabel texto;
    private Font miLetra;
    
    public LaminaJCheckBox(){
        texto=new JLabel("En un lugar dela mancha de cuyo nombre...");
        miLetra=new Font("Serif", Font.PLAIN,24); //PLAIN es una constante con valor 0
        texto.setFont(miLetra);
        add(texto);
        check1=new JCheckBox("Negrita");
        add(check1);
        check2=new JCheckBox("Cursiva");
        add(check2);
        check1.addActionListener(new ManejaChecks());
        check2.addActionListener(new ManejaChecks());
    }
    
    private class ManejaChecks implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            int tipo=0; //aprovechamos que Font.PLAIN=0
            if(check1.isSelected()) tipo+=Font.BOLD;
            if(check2.isSelected()) tipo+=Font.ITALIC;
            texto.setFont(new Font("Serif", tipo, 24));
        } 
    }
}