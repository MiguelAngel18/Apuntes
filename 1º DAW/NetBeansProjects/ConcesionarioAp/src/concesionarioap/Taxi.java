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
public class Taxi extends Coche{
    
    private int numPalzas;

    public Taxi(int numPalzas, String conductor, String tipo, String color) {
        super(conductor, tipo, color, new Punto(0,0));
        this.numPalzas = numPalzas;
    }

    @Override
    public void avanza() {
        Random generador=new Random();
        if (generador.nextFloat()>=0.33)
        
            super.getPosicion().desplaza(35, 0);
        
        else
             super.getPosicion().desplaza(15, 0);
    }

    @Override
    public String toString() {
        return "Taxi{"+ super.toString()  + "numPalzas=" + numPalzas + '}';
    }
    
    
    
    
    
}
