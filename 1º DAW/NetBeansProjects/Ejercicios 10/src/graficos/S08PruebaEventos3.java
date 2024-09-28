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
public class S08PruebaEventos3
{
    
    public static void main(String[] args)
    {
        MarcoBotones3 marco=new MarcoBotones3();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);        
    }
}
    
class MarcoBotones3 extends JFrame
{
    
    public MarcoBotones3()
    {
        setTitle("Botones y Eventos 3");
        setBounds(750,300,500,300);
        LaminaBotones3 miLamina=new LaminaBotones3();
        add(miLamina);
    }   
}

class LaminaBotones3 extends JPanel
{
    private JButton botonAzul;
    private JButton botonRojo;
    private JButton botonAmarillo;    
    
    public LaminaBotones3()
    {
        botonAzul=new JButton("Azul");
        add(botonAzul);
        botonAzul.addActionListener(new ColorFondo3());
        botonRojo=new JButton("Rojo");
        add(botonRojo);
        botonRojo.addActionListener(new ColorFondo3());
        botonAmarillo=new JButton("Amarillo");
        add(botonAmarillo);
        botonAmarillo.addActionListener(new ColorFondo3());                
    }
    
    private class ColorFondo3 implements ActionListener
    {
        private Color colorDeFondo;

        public void actionPerformed(ActionEvent e)
        {
            Object o=e.getSource();
            if(o==botonAzul)colorDeFondo=Color.BLUE;
            else if(o==botonRojo)colorDeFondo=Color.RED;
            else colorDeFondo=Color.YELLOW;
            setBackground(colorDeFondo);    
        }
    }
}
