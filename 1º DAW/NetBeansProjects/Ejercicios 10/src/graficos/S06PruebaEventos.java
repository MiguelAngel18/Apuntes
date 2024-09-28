/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author miguelhernandezrodriguez
 */
public class S06PruebaEventos {
    
    public static void main(String[] args){
        MarcoBotones marco=new MarcoBotones();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);        
    }
}
    
class MarcoBotones extends JFrame{
    
    public MarcoBotones(){
        setTitle("Botones y Eventos");
        setBounds(750,300,500,300);
        LaminaBotones miLamina=new LaminaBotones();
        add(miLamina);
    }
   
}

class LaminaBotones extends JPanel implements ActionListener{    
    private JButton botonAzul;
    private JButton botonRojo;
    private JButton botonAmarillo;
    
    public LaminaBotones(){
        botonAzul=new JButton("Azul");
        add(botonAzul);
        botonAzul.addActionListener(this);
        botonRojo=new JButton("Rojo");
        add(botonRojo);
        botonRojo.addActionListener(this);
        botonAmarillo=new JButton("Amarillo");
        add(botonAmarillo);
        botonAmarillo.addActionListener(this);                
    }
    
    public void actionPerformed(ActionEvent e){
        Object botonPulsado=e.getSource();
        if(botonPulsado==botonAzul)
            setBackground(Color.BLUE);
        else if(botonPulsado==botonRojo)setBackground(Color.RED);
        else setBackground(Color.YELLOW);        
    }
}