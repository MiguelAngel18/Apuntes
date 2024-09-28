/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author miguelhernandezrodriguez
 */
public class S19JSlider {
    
    public static void main(String[] args){
        MarcoJSlider marco=new MarcoJSlider();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);        
    }
}
    
class MarcoJSlider extends JFrame{
    
    public MarcoJSlider(){
        setTitle("Prueba de Slider");
        setBounds(750,300,250,300);
        LaminaJSlider miLamina=new LaminaJSlider();
        add(miLamina);
    }
   
}

class LaminaJSlider extends JPanel{
    private JLabel texto;
    private JSlider control;
    
    public LaminaJSlider(){
           control=new JSlider();
           //control=new JSlider(0,100,50); //igual que el por defecto
           //control=new JSlider(20,100,25);
           //control=new JSlider(JSlider.VERTICAL);
           //control=new JSlider(JSlider.VERTICAL,20,100,35);
           //control.setOrientation(JSlider.VERTICAL);
           
           control.setMajorTickSpacing(25);
           control.setMinorTickSpacing(5);
           control.setPaintTicks(true); //sin esta instruccion no se ven las marcas
           
           control.setPaintLabels(true);
           control.setFont(new Font("Serif",Font.ITALIC,12));
           //control.setSnapToTicks(true);
           control.addChangeListener(new EventoJSlider());
           add(control);
           texto=new JLabel("En un lugar de la mancha de cuyo nombre...");
           texto.setFont(new Font("Serif", Font.PLAIN, 12));
           add(texto);           
    }
    
    private class EventoJSlider implements ChangeListener{
    
        public void stateChanged(ChangeEvent e) {
            texto.setFont(new Font("Serif",Font.PLAIN,control.getValue()));
        }
    }
}