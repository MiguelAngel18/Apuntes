/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;
import javax.swing.*;

/**
 *
 * @author miguelhernandezrodriguez
 */
public class S01CreandoMarcos
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
