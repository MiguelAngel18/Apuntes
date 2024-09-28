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
 * @author Profesor
 */
public class S10PruebaEventos5{
    
    public static void main(String[] args){
        MarcoBotones5 marco=new MarcoBotones5();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);        
    }
}
    
class MarcoBotones5 extends JFrame{
    
    public MarcoBotones5(){
        setTitle("Botones y Eventos 5");
        setBounds(750,300,500,300);
        LaminaBotones5 miLamina=new LaminaBotones5();
        add(miLamina);
    }   
}

class LaminaBotones5 extends JPanel{    
    private JButton botonAzul;
    private JButton botonRojo;
    private JButton botonAmarillo;  
    
    public LaminaBotones5(){
        botonAzul=new JButton("Azul");
        add(botonAzul);
        botonAzul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                setBackground(Color.BLUE);
            }
        });  
        botonRojo=new JButton("Rojo");
        add(botonRojo);
        botonRojo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                setBackground(Color.RED);
            }
        });
        botonAmarillo=new JButton("Amarillo");
        add(botonAmarillo);
        botonAmarillo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                setBackground(Color.YELLOW);
            }
        });
    }
}
