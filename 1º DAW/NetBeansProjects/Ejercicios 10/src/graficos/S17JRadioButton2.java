/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author miguelhernandezrodriguez
 */
public class S17JRadioButton2 {
    
    public static void main(String[] args){
        MarcoJRadioButton2 marco=new MarcoJRadioButton2();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);        
    }
}
    
class MarcoJRadioButton2 extends JFrame{
    
    public MarcoJRadioButton2(){
        setTitle("Marco con Botones de Radio");
        setBounds(600,300,600,350);
        LaminaJRadioButton2 miLamina=new LaminaJRadioButton2();
        add(miLamina);
    }   
}

class LaminaJRadioButton2 extends JPanel{
    private ButtonGroup miGrupo;
    private JLabel texto;
    
    public LaminaJRadioButton2(){
        texto=new JLabel("En un lugar dela mancha de cuyo nombre no quiero acordarme...");
        texto.setFont(new Font("Serif", Font.PLAIN,15));
        add(texto);
        miGrupo=new ButtonGroup();
        
        colocarBotones("Pequeño", false,10);
        colocarBotones("Mediano",true,15);
        colocarBotones("Grande", false,20);
        colocarBotones("Muy Grande",false,25);
    }
    
    public void colocarBotones(String nombre, boolean seleccionado, int tamano){
        JRadioButton boton=new JRadioButton(nombre, seleccionado);
        miGrupo.add(boton);
        add(boton);
        ActionListener miEvento=new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                texto.setFont(new Font("Serif", Font.PLAIN, tamano));
            }
        };
        boton.addActionListener(miEvento);
    }
}