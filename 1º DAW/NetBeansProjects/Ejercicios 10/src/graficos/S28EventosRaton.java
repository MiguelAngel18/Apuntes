/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JFrame;

/**
 *
 * @author miguelhernandezrodriguez
 */
public class S28EventosRaton {
    
    public static void main(String[] args){
        MarcoRaton marco=new MarcoRaton();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true); 
    }   
}

class MarcoRaton extends JFrame{
    
    public MarcoRaton(){
        setTitle("Eventos de raton");
        setBounds(300,300,500,300);
        addMouseListener(new MiRaton());
        addMouseMotionListener(new MiRaton());
        addMouseWheelListener(new MiRaton());
    }
}

class MiRaton implements MouseListener, MouseMotionListener, MouseWheelListener{
//class MiRaton extends MouseAdapter{
    
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has hecho click en ("+e.getX()+","+e.getY()+")");
        //System.out.println("Y has clickado "+e.getClickCount()+" veces");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Has soltado");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Has entrado");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Has salido");
    }
    
    @Override
    public void mousePressed(MouseEvent e){
        System.out.print("Has pulsado con: ");
        switch(e.getModifiersEx()){
            case MouseEvent.BUTTON1_DOWN_MASK: System.out.println("Botón izquierdo");break;
            case MouseEvent.BUTTON2_DOWN_MASK: System.out.println("Botón de la rueda");break;
            case MouseEvent.BUTTON3_DOWN_MASK: System.out.println("Botón derecho");break;
        }    
    }
    
    public void mouseMoved(MouseEvent e) {
        System.out.println("Has movido el raton");
    }
    
    public void mouseDragged(MouseEvent e) {
        System.out.println("Has arrastrado el raton");
    }
    
    public void mouseWheelMoved(MouseWheelEvent e){
        System.out.println("Har movidola rueda "+e.getScrollAmount()+" unidades");
    }
}