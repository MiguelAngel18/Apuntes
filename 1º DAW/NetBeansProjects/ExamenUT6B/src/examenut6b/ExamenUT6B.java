/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut6b;

/**
 * @author Miguel Ángel
 */

public class ExamenUT6B
{
    public static void main(String[] args)
    {
        Coche c = new Coche("000000", Color.AMARILLO, 1.00, 80);
        
        c.aniadirExtra("Nitro");
        c.aniadirExtra("Parrilla");
        c.aniadirExtra("Parras");
        c.aniadirExtra("Puros");
        c.aniadirExtra("Parras");


        
        System.out.println(c.toString());
        System.out.println("_______________________________________________");

        
        Concesionario co = new Concesionario("Mercedes","1234567890","Mi casa");
        
        co.aniadirCoche(c);
        
        System.out.println(co.toString());
    }
}