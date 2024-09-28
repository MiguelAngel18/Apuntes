/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gridlayoutap;

import Vista.Marco;
import javax.swing.JFrame;

/**
 *
 * @author Miguel Ángel
 */
public class GridLayOut
{
    
    public static void main(String[] args)
    {        
        MiMarco marco=new MiMarco();
        marco.setLocation(100,100);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);             
    }    
}

class MiMarco extends JFrame
{
    
    public MiMarco()
    {
        setSize(500,300);//va a depender del ordenador, de la resolucion. Se puede detectar y adaptar el tamaño, pero es mas coñazo
    }
}