/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Profesor
 */
public class S05MarcoConBotones
{
    
    public static void main(String[] args)
    {        
        MarcoConBoton marco=new MarcoConBoton();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
}

class MarcoConBoton extends JFrame{
    
    public MarcoConBoton()
    {        
        setTitle("Mi ventana con botón");
        setBounds(200,200,500,300);       
        MiPanelConBoton panel=new MiPanelConBoton();
        add(panel);
        //pack();
    }
}

class MiPanelConBoton extends JPanel implements ActionListener
{
    private JButton boton;
    private JLabel etiqueta;
    
    public MiPanelConBoton()
    {
        boton = new JButton("Pulsar");
        boton.addActionListener(this);
        add(boton);
        etiqueta=new JLabel();
        add(etiqueta);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
         etiqueta.setText("boton pulsado");
    } 
}