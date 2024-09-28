/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos.S32Vista;

import javax.swing.JFrame;

/**
 *
 * @author Profesor
 */
public class MarcoMVC extends JFrame{
    
    public MarcoMVC(){
        setTitle("Copia de archivo");
        setBounds(600,300,400,350);
        LaminaMVC miLamina=new LaminaMVC();
        add(miLamina);
    }   
}
