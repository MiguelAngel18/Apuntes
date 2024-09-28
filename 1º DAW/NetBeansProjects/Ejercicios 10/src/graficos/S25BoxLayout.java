/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Profesor
 */
public class S25BoxLayout{
    
    public static void main(String[] args){
        MarcoBoxLayout marco=new MarcoBoxLayout();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);        
    }
}

class MarcoBoxLayout extends JFrame{
    
    public MarcoBoxLayout(){
        setTitle("Prueba de BoxLayout");
        setBounds(750,300,500,300);
        LaminaBoxLayout miLamina=new LaminaBoxLayout();
        add(miLamina);
        //pack();
    }  
}

class LaminaBoxLayout extends JPanel{    
    private JButton botonAzul;
    private JButton botonRojo;
    private JButton botonAmarillo;
    private JButton botonNaranja;
    private JButton botonBlanco;
    private JButton botonVerde;
    private JButton botonNegro;
    private JButton botonGris;
    
    public LaminaBoxLayout(){
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        //setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
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
