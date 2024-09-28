/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author miguelhernandezrodriguez
 */
public class S29EventosTeclado {
    
    public static void main(String[] args){
        MarcoTeclado marco1=new MarcoTeclado();
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.setVisible(true); 
    }    
}

class MarcoTeclado extends JFrame{
    
    public MarcoTeclado(){
        setTitle("Evento de teclado");
        setBounds(300,300,500,300);
        addKeyListener(new MiTeclado());
        //addKeyListener(new MiTeclado2());
    }
}

class MiTeclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        char letra=e.getKeyChar();
        System.out.println(letra);
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int codigo=e.getKeyCode();
        System.out.println(codigo);
        System.out.println(Character.getName(codigo));
    }

    @Override
    public void keyReleased(KeyEvent e) {
    
    }
}

class MiTeclado2 extends KeyAdapter{

    @Override
    public void keyPressed(KeyEvent e) {
        int codigo=e.getKeyCode();
        System.out.println(codigo);
    }

}