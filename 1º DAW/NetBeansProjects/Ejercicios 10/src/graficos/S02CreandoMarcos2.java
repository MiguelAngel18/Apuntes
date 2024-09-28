/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import javax.swing.JFrame;

/**
 *
 * @author miguelhernandezrodriguez
 */
public class S02CreandoMarcos2
{
    
    public static void main(String[] args)
    {        
        MiMarco2 marco=new MiMarco2();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }    
}

class MiMarco2 extends JFrame
{
    
    public MiMarco2()
    {        
        //setSize(500,300);//va a depender del ordenador, de la resolucion. Se puede detectar y adaptar el tamaño, pero es mas coñazo
        //setLocation(500,300);
        setBounds(500,300,250,250);
        //setExtendedState(Frame.MAXIMIZED_BOTH);
        //setResizable(false);
        //setExtendedState(JFrame.ICONIFIED);
        setTitle("Mi ventana con título");        
    }
}
