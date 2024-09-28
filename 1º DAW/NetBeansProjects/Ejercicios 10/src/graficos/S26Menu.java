/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 *
 * @author Profesor
 */
public class S26Menu {
    
    public static void main(String[] args){
        
        MarcoMenu marco=new MarcoMenu();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
}

class MarcoMenu extends JFrame{
    private LaminaMenu panel;
    
    public MarcoMenu(){        
        setTitle("Mi ventana con menú");
        setBounds(200,200,500,300);   
        panel=new LaminaMenu();
        add(panel);
        setJMenuBar(new MenuBar());
    }
    
    public JFrame getVentana(){
        return this;
    }
    
    public LaminaMenu getPanel(){
        return panel;
    }
    
    private class LaminaMenu extends JPanel{
        private JLabel etiqueta;
        
        public LaminaMenu(){
            etiqueta=new JLabel();
            add(etiqueta);
        }
        
        public JLabel getEtiqueta(){
            return etiqueta;
        }        
    }
    
    private class MenuBar extends JMenuBar implements ActionListener, MenuListener{
        private JMenu menu1, menu2, menu3, menu4;
	private JMenuItem menuItem31, menuItem32, menuItem41, menuItem42;
        
        public MenuBar(){
            menu1=new JMenu("Opciones");
            menu2=new JMenu("Sobre la app...");
            menu3=new JMenu("Tamaño de la ventana");
            menu4=new JMenu("Color de fondo");
            menuItem31=new JMenuItem("640*480");
            menuItem32=new JMenuItem("1024*768");
            menuItem41=new JMenuItem("Rojo");
            menuItem42=new JMenuItem("Verde");
				
            add(menu1);
            add(menu2);
            
            menu1.add(menu3);
            menu1.add(menu4);
            
            menu3.add(menuItem31);
            menu3.add(menuItem32);
            menu4.add(menuItem41);
            menu4.add(menuItem42);
            
            menu1.addMenuListener(this);
            menu2.addMenuListener(this);
            
            menuItem31.addActionListener(this);
            menuItem32.addActionListener(this);
            menuItem41.addActionListener(this);
            menuItem42.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==menuItem31) getVentana().setSize(640,480);
            if (e.getSource()==menuItem32) getVentana().setSize(1024,768);
            if (e.getSource()==menuItem41) getPanel().setBackground(new Color(255,0,0));
            if (e.getSource()==menuItem42) getPanel().setBackground(new Color(0,255,0));
        } 
        
        @Override
        public void menuSelected(MenuEvent e) {
            if (e.getSource()==menu1) getPanel().getEtiqueta().setText("Has elegido Opciones");
            if (e.getSource()==menu2) getPanel().getEtiqueta().setText("Has elegido Sobre la app...");
        }

        @Override
        public void menuDeselected(MenuEvent e) {}

        @Override
        public void menuCanceled(MenuEvent e) {}
    }
}