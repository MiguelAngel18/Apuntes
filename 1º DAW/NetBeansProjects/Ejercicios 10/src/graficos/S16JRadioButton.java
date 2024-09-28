package graficos;


import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguelhernandezrodriguez
 */
public class S16JRadioButton {
    
    public static void main(String[] args){
        MarcoJRadioButton marco=new MarcoJRadioButton();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);        
    }
}
    
class MarcoJRadioButton extends JFrame{
    
    public MarcoJRadioButton(){
        setTitle("Marco con Botones de Radio");
        setBounds(600,300,250,250);
        LaminaJRadioButton miLamina=new LaminaJRadioButton();
        add(miLamina);
    }   
}

class LaminaJRadioButton extends JPanel{
    private JRadioButton radio1,radio2,radio3,radio4,radio5;
    private ButtonGroup miGrupo1,miGrupo2;
    
    public LaminaJRadioButton(){
        miGrupo1=new ButtonGroup();
        radio1=new JRadioButton("Azul", false); 
        radio2=new JRadioButton("Rojo", true);
        radio3=new JRadioButton("Verde", false);
        miGrupo1.add(radio1);
        miGrupo1.add(radio2);
        miGrupo1.add(radio3);
        add(radio1);
        add(radio2);
        add(radio3);
        
        miGrupo2=new ButtonGroup();
        radio4=new JRadioButton("Masculino", false); 
        radio5=new JRadioButton("Femenino", false);
        miGrupo2.add(radio4);
        miGrupo2.add(radio5);
        add(radio4);
        add(radio5);        
    }
}
