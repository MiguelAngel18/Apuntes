/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Profesor
 */
public class S24GridLayout {
    
    public static void main(String[] args){
        MarcoGridLayout marco=new MarcoGridLayout();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);        
    }
}

class MarcoGridLayout extends JFrame{
    
    public MarcoGridLayout(){
        setTitle("Prueba de GridLayout");
        setBounds(750,300,500,300);
        LaminaGridLayout miLamina=new LaminaGridLayout();
        add(miLamina);
        //pack();
    }  
}

class LaminaGridLayout extends JPanel{    
    private JButton botonAzul;
    private JButton botonRojo;
    private JButton botonAmarillo;
    private JButton botonNaranja;
    private JButton botonBlanco;
    private JButton botonVerde;
    private JButton botonNegro;
    private JButton botonGris;
    
    public LaminaGridLayout()
    {
        //setLayout(new GridLayout());
        //setLayout(new GridLayout(2,4));
        setLayout(new GridLayout(4,2,10,5));
        botonAzul=new JButton("Azul");
        add(botonAzul);
        botonRojo=new JButton("Rojo");
        add(botonRojo);
        botonAmarillo=new JButton("Amarillo");
        add(botonAmarillo);
        botonNegro=new JButton("Negro");
        add(botonNegro);
        botonNaranja=new JButton("Naranja");
        add(botonNaranja);
        botonBlanco=new JButton("Blanco");
        add(botonBlanco);
        botonVerde=new JButton("Verde");
        add(botonVerde);
        botonGris=new JButton("Gris");
        add(botonGris);
    }
}
