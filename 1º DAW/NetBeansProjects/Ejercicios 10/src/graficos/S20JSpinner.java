/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author miguelhernandezrodriguez
 */
public class S20JSpinner {
    
    public static void main(String[] args){
        MarcoJSpinner marco=new MarcoJSpinner();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);        
    }
}
    
class MarcoJSpinner extends JFrame{
    
    public MarcoJSpinner(){
        setTitle("Prueba de Spinner");
        setBounds(750,300,500,300);
        LaminaJSpinner miLamina=new LaminaJSpinner();
        add(miLamina);
    }
   
}

class LaminaJSpinner extends JPanel{    
    private JSpinner control;
    private JLabel texto;
    
    public LaminaJSpinner(){
        //control=new JSpinner();
        //control=new JSpinner(new SpinnerDateModel());
        //control=new JSpinner(new SpinnerListModel());
        String[] lista={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        control=new JSpinner(new SpinnerListModel(lista));
        control.setPreferredSize(new Dimension(100,20));
        //control=new JSpinner(new SpinnerNumberModel(5,0,10,1));
        //control=new JSpinner(new SpinnerNumberModel(5,0,10,2));
        //control.setPreferredSize(new Dimension(150,20));

        add(control);
    }
    
    /*public LaminaJSpinner(){
        String[] lista=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        control=new JSpinner(new SpinnerListModel(lista));
        control.setPreferredSize(new Dimension(250,20));
        add(control);
        control.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                texto.setFont(new Font((String)control.getValue(),Font.PLAIN,20));
            }         
        });
        texto=new JLabel("En un lugar de la mancha de cuyo nombre...");
        texto.setFont(new Font("Abadi MT Condensed Extra Bold", Font.PLAIN, 20));
        add(texto);
    }*/
    
    /*public LaminaJSpinner(){           
        control=new JSpinner(new miSpinnerModel());
        control.setPreferredSize(new Dimension(50,20));
        add(control);
    }
    
    private class miSpinnerModel extends SpinnerNumberModel{
        
        public miSpinnerModel(){
            super(5,0,10,1); //por ejemplo
        }
        
        public Object getNextValue(){
            return super.getPreviousValue();
        }
        
        public Object getPreviousValue(){
            return super.getNextValue();
        }
    }*/
}