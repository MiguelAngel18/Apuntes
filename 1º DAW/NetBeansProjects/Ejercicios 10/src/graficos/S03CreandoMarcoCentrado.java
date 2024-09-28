/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author miguelhernandezrodriguez
 */
public class S03CreandoMarcoCentrado
{

    public static void main(String[] args)
    {        
        MarcoCentrado marco=new MarcoCentrado();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }    
}

class MarcoCentrado extends JFrame
{
    
    public MarcoCentrado(){        
        Toolkit mipantalla=Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla=mipantalla.getScreenSize();
        int alturaPantalla=tamanoPantalla.height;
        int anchoPantalla=tamanoPantalla.width;
        setSize(anchoPantalla/2,alturaPantalla/2);//va a depender del ordenador, de la resolucion. Se puede detectar y adaptar el tamaño, pero es mas coñazo
        setLocation(anchoPantalla/4,alturaPantalla/4);
        setTitle("Mi ventana centrada");
        
        Image miIcono=mipantalla.getImage("src/graficos/batmanicono.png");
        setIconImage(miIcono);      
        //pack();
    }
}