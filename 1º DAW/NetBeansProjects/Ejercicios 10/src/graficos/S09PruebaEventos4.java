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
public class S09PruebaEventos4{
    
    public static void main(String[] args){
        MarcoBotones4 marco=new MarcoBotones4();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);        
    }
}
    
class MarcoBotones4 extends JFrame{
    
    public MarcoBotones4(){
        setTitle("Botones y Eventos 4");
        setBounds(750,300,500,300);
        LaminaBotones4 miLamina=new LaminaBotones4();
        add(miLamina);
    }   
}

class LaminaBotones4 extends JPanel{    
    private JButton botonAzul;
    private JButton botonRojo;
    private JButton botonAmarillo;  
    private Color colorDeFondo;
    
    public LaminaBotones4(){
        ActionListener color=new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                Object o=e.getSource();
                if(o==botonAzul)colorDeFondo=Color.BLUE;
                else if(o==botonRojo)colorDeFondo=Color.RED;
                else colorDeFondo=Color.YELLOW;
                setBackground(colorDeFondo);
            }
        };
        botonAzul=new JButton("Azul");
        add(botonAzul);
        botonAzul.addActionListener(color);
        botonRojo=new JButton("Rojo");
        add(botonRojo);
        botonRojo.addActionListener(color);
        botonAmarillo=new JButton("Amarillo");
        add(botonAmarillo);
        botonAmarillo.addActionListener(color);                
    }
}
