/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author miguelhernandezrodriguez
 */
public class S23BorderLayout {
    
    public static void main(String[] args){
        MarcoBorderLayout marco1=new MarcoBorderLayout();
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.setVisible(true);        
    }
}
    
class MarcoBorderLayout extends JFrame{
    
    public MarcoBorderLayout(){
        setTitle("Prueba de BorderLayout");
        setBounds(750,300,500,300);
        LaminaBorderLayout miLamina=new LaminaBorderLayout();
        add(miLamina);
    }  
}

class LaminaBorderLayout extends JPanel{    
    private JButton botonNaranja;
    private JButton botonBlanco;
    private JButton botonVerde;
    private JButton botonNegro;
    private LaminaFlowLayout2 panel;
    
    public LaminaBorderLayout(){
        setLayout(new BorderLayout());
        //setLayout(new BorderLayout(10,10));
        
        botonNegro=new JButton("Negro");
        add(botonNegro,BorderLayout.NORTH);
        botonNaranja=new JButton("Naranja");
        add(botonNaranja,BorderLayout.SOUTH);
        botonBlanco=new JButton("Blanco");
        add(botonBlanco,BorderLayout.WEST);
        botonVerde=new JButton("Verde");
        add(botonVerde,BorderLayout.EAST);
        panel=new LaminaFlowLayout2();
        add(panel,BorderLayout.CENTER);        
    }
}

class LaminaFlowLayout2 extends JPanel{    
    private JButton botonAzul;
    private JButton botonRojo;
    private JButton botonAmarillo;
    
    public LaminaFlowLayout2(){
        setLayout(new FlowLayout());
        botonAzul=new JButton("Azul");
        add(botonAzul);
        botonRojo=new JButton("Rojo");
        add(botonRojo);
        botonAmarillo=new JButton("Amarillo");
        add(botonAmarillo);
    }
}