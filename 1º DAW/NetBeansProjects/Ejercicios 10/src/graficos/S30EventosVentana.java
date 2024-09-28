/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import javax.swing.*;

/**
 *
 * @author miguelhernandezrodriguez
 */
public class S30EventosVentana {
    
    public static void main(String[] args){
        MarcoVentana marco1=new MarcoVentana();
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.setVisible(true); 
        
        MarcoVentana marco2=new MarcoVentana();
        marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        marco2.setTitle("Marco 2");
        marco2.setBounds(900,300,500,300);
        marco2.setVisible(true);              
    }    
}

class MarcoVentana extends JFrame{
    
    public MarcoVentana(){
        setTitle("Eventos de Ventana");
        setBounds(300,300,500,300);
        addWindowListener(new MiVentana());
        addWindowStateListener(new MiVentana());
        addWindowFocusListener(new MiVentana());
    }
}

class MiVentana implements WindowListener, WindowStateListener, WindowFocusListener{
//class MiVentana extends WindowAdapter{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana abierta");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Ventana cerrandose");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana cerrada");//solo se podrá ver cuando haya más de una ventana
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana normalizada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana desactivada");
    }
    
    @Override
    public void windowStateChanged(WindowEvent e) {
        String aux="";
        switch(e.getNewState()){
            case JFrame.NORMAL: aux="Normal";break;
            case JFrame.MAXIMIZED_BOTH: aux="Maximizada completa";break;
            case JFrame.ICONIFIED: aux="Minimizada";break;            
        }
        System.out.println("La ventana ha cambiado al estado "+aux);
    }
    
    @Override
    public void windowGainedFocus(WindowEvent e) {
        JFrame jf=(JFrame)e.getSource(); 
        jf.setTitle("Tengo el foco");
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        JFrame jf=(JFrame)e.getSource(); 
        jf.setTitle("");
    }
}