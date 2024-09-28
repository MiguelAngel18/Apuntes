/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionarioap;

import java.util.Random;

/**
 *
 * @author Mariajo
 */
public class CocheDeportivo extends Coche{

    public CocheDeportivo(String conductor, String tipo, String color) {
        super(conductor, tipo, color, new Punto(0,200));
    }

    @Override
    public void avanza() {
        Random generador=new Random();
        if (generador.nextFloat()>=0.7)
        
            getPosicion().desplaza(50, 0);
        
        else
             super.getPosicion().desplaza(30, 0);
            
    }
   
    
    
}
