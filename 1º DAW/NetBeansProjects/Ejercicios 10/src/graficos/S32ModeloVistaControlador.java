/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import javax.swing.JFrame;
import graficos.S32Vista.MarcoMVC;

/**
 *
 * @author Profesor
 */
public class S32ModeloVistaControlador {
    
    public static void main(String[] args){
        MarcoMVC marco=new MarcoMVC();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}