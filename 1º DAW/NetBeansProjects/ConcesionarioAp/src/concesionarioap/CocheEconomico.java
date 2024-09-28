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
public class CocheEconomico extends Coche{

    public CocheEconomico(String conductor, String tipo, String color) {
        super(conductor, tipo, color, new Punto(0,0));
    }

    @Override
    public void avanza() {
        Random generador=new Random();
        if (generador.nextFloat()>=0.5)
        
            super.getPosicion().desplaza(20, 0);
        
        else
             super.getPosicion().desplaza(25, 0);
    }
    
}
