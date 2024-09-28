/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea;

import com.sun.tools.javac.Main;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Miguel Ángel
 */
    public class Tarea extends JFrame 
    {
    public Tarea() 
    {
        JLabel lblSaludo = new JLabel("Hola Mundo. Creando mi primer ejemplo");
        add(lblSaludo);
        this.setSize(400, 200);
        this.setTitle("JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    
    public static void main(String[] args) 
    {
        Tarea mitarea = new Tarea();
       
    }
}