/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author miguelhernandezrodriguez
 */
public class S22FlowLayout {
    
    public static void main(String[] args){
        MarcoFlowLayout marco=new MarcoFlowLayout();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);        
    }
}
    
class MarcoFlowLayout extends JFrame{
    
    public MarcoFlowLayout(){
        setTitle("Prueba de FlowLayout");
        setBounds(750,300,500,300);
        LaminaFlowLayout miLamina=new LaminaFlowLayout();
        add(miLamina);
    }  
}

class LaminaFlowLayout extends JPanel{    
    private JButton botonAzul;
    private JButton botonRojo;
    private JButton botonAmarillo;
    
    public LaminaFlowLayout(){
        setLayout(new FlowLayout());
        //setLayout(new FlowLayout(FlowLayout.LEFT));
        //setLayout(new FlowLayout(FlowLayout.RIGHT));
        //setLayout(new FlowLayout(FlowLayout.CENTER));
        //setLayout(new FlowLayout(FlowLayout.CENTER,175,100));
        botonAzul=new JButton("Azul");
        add(botonAzul);
        botonRojo=new JButton("Rojo");
        add(botonRojo);
        botonAmarillo=new JButton("Amarillo");
        add(botonAmarillo);
    }
}