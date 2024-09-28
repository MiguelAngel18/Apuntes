/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Miguel Hernandez
 */
public class S31EventosFoco {
    
    public static void main(String[] args){
        MarcoFoco marco=new MarcoFoco();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true); 
    }
}
class MarcoFoco extends JFrame{
    
    public MarcoFoco(){
        setTitle("Evento de foco");
        setBounds(300,300,500,300);
        add(new LaminaFoco());
    }
}

class LaminaFoco extends JPanel{    
    private JTextField campo1, campo2;
    
    public LaminaFoco(){
        setLayout(null);
        campo1=new JTextField(20);
        campo2=new JTextField(20);
        campo1.setBounds(120,10,150,20);
        campo2.setBounds(120,50,150,20);
        add(campo1);
        add(campo2);
        campo1.addFocusListener(new MiFoco());
        campo2.addFocusListener(new MiFoco());        
    }
    
    private class MiFoco implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
            JTextField j=(JTextField)e.getSource();
            j.setText("Tengo el foco");
        }

        @Override
        public void focusLost(FocusEvent e) {
             JTextField j=(JTextField)e.getSource();
            j.setText("Ya no tengo el foco");
        }    
    }
}
