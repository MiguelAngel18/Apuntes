/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javax.swing.JFrame;

/**
 * @author Miguel Ángel
 */
public class Ventana extends JFrame
{
    public Ventana()
    {
        this.setTitle("Ejercicio Adicional 2");
        this.setBounds(750,300,750,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel p = new Panel();
        add(p);
    }
}