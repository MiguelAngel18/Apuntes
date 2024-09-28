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
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author miguelhernandezrodriguez
 */
public class S07PruebaEventos2 {
    
    public static void main(String[] args) // Creación del marco
    {
        MarcoBotones2 marco=new MarcoBotones2();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);        
    }
}
    
class MarcoBotones2 extends JFrame // Introducción de los atributos del marco y los objetos dentro de él
{
    
    public MarcoBotones2(){
        setTitle("Botones y Eventos 2");
        setBounds(750,300,500,300);
        LaminaBotones2 miLamina=new LaminaBotones2(); // Lamina que se encuentra dentro del marco
        add(miLamina);
    }   
}

class LaminaBotones2 extends JPanel
{
    private JButton botonAzul;
    private JButton botonRojo;
    private JButton botonAmarillo;
    private JLabel etiqueta;
    
    public LaminaBotones2()
    {
        botonAzul=new JButton("Azul");
        add(botonAzul);
        botonAzul.addActionListener(new ColorFondoAzul(this));
        botonRojo=new JButton("Rojo");
        add(botonRojo);
        botonRojo.addActionListener(new ColorFondoRojo(this));
        botonAmarillo=new JButton("Amarillo");
        add(botonAmarillo);
        botonAmarillo.addActionListener(new ColorFondoAmarillo(this));                
    }
}  
class ColorFondoAzul implements ActionListener
{    
    private Color colorDeFondo;
    private JPanel panelito;

    public ColorFondoAzul(JPanel p){
        colorDeFondo=Color.BLUE;
        panelito=p;
    }

    public void actionPerformed(ActionEvent e){
        panelito.setBackground(colorDeFondo);    
    }
}

class ColorFondoRojo implements ActionListener{    
    private Color colorDeFondo;
    private JPanel panelito;

    public ColorFondoRojo(JPanel p){
        colorDeFondo=Color.RED;
        panelito=p;
    }

    public void actionPerformed(ActionEvent e){
        panelito.setBackground(colorDeFondo);    
    }
}

class ColorFondoAmarillo implements ActionListener
{
    private Color colorDeFondo;
    private JPanel panelito;

    public ColorFondoAmarillo(JPanel p){
        colorDeFondo=Color.BLUE;
        panelito=p;
    }

    public void actionPerformed(ActionEvent e){
        panelito.setBackground(colorDeFondo);    
    }
}

/*class LaminaBotones2 extends JPanel{    
    private JButton botonAzul;
    private JButton botonRojo;
    private JButton botonAmarillo;    
    
    public LaminaBotones2(){
        botonAzul=new JButton("Azul");
        add(botonAzul);
        botonAzul.addActionListener(new ColorFondo(Color.BLUE,this));
        botonRojo=new JButton("Rojo");
        add(botonRojo);
        botonRojo.addActionListener(new ColorFondo(Color.RED,this));
        botonAmarillo=new JButton("Amarillo");
        add(botonAmarillo);
        botonAmarillo.addActionListener(new ColorFondo(Color.YELLOW,this));                
    }
}  
class ColorFondo implements ActionListener{    
    private Color colorDeFondo;
    private JPanel panelito;

    public ColorFondo(Color c, JPanel p){
        colorDeFondo=c;
        panelito=p;
    }

    public void actionPerformed(ActionEvent e){
        panelito.setBackground(colorDeFondo);    
    }
}*/
