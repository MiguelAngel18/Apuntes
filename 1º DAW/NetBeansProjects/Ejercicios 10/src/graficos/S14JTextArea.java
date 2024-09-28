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
public class S14JTextArea {
    
    public static void main(String[] args){
        MarcoJTextArea marco=new MarcoJTextArea();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);        
    }
}
    
class MarcoJTextArea extends JFrame{
    
    public MarcoJTextArea(){
        setTitle("Marco con Areas de Texto");
        setBounds(600,300,600,350);
        LaminaJTextArea miLamina=new LaminaJTextArea();
        add(miLamina);
    }   
}

class LaminaJTextArea extends JPanel{
    private JTextArea area;
    private JButton miBoton;
    private JScrollPane laminaScroll;
    
    public LaminaJTextArea(){        
        area=new JTextArea(8,20);
        //area.setLineWrap(true);
        add(area);
        
        //laminaScroll=new JScrollPane(area);
        //add(laminaScroll);
        
        miBoton=new JButton("Pulsar");
        add(miBoton);
        miBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                area.append("\nAcaba aquí");
                System.out.println(area.getText());
            }   
        });
    }
}
