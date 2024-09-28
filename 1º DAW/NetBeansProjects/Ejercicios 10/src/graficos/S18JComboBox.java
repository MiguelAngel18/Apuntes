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
public class S18JComboBox {
    
    public static void main(String[] args){
        MarcoJComboBox marco=new MarcoJComboBox();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);        
    }
}
    
class MarcoJComboBox extends JFrame{
    
    public MarcoJComboBox(){
        setTitle("Prueba de ComboBox");
        setBounds(750,300,468,300);
        LaminaJComboBox miLamina=new LaminaJComboBox();
        add(miLamina);
    }  
}

class LaminaJComboBox extends JPanel{
    private JLabel texto;
    private JComboBox miCombo;
    private String[] vec={"Serif","Sans-Serif","Monospaced","Dialog"};
    
    public LaminaJComboBox(){
           texto=new JLabel("En un lugar de la mancha de cuyo nombre...");
           texto.setFont(new Font("Serif", Font.PLAIN, 20));
           add(texto);
           //miCombo=new JComboBox(vec);
           miCombo=new JComboBox();
           miCombo.addItem("Serif");
           miCombo.addItem("Sans-Serif");
           miCombo.addItem("Monospaced");
           miCombo.addItem("Dialog");
           miCombo.addActionListener(new EventoJComboBox());
           add(miCombo);
    }
    
    private class EventoJComboBox implements ActionListener{
    
        public void actionPerformed(ActionEvent e){
            texto.setFont(new Font((String)miCombo.getSelectedItem(), Font.PLAIN,20));
        }
    }
}