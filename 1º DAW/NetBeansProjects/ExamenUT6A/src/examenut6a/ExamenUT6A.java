/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut6a;

/**
 * @author Miguel Ángel
 */
public class ExamenUT6A 
{
    public static void main(String[] args)
    {
        Empresa empresa1 = new Empresa("123456789","Mediamark","Las Arenas");
        
        Electrodomestico e1 = new Electrodomestico("111111",499.99,5.7,'E');
        Electrodomestico e2 = new Electrodomestico();
        Electrodomestico e3 = new Electrodomestico();
        
        empresa1.aniadirElectrodomestico(e1);
        empresa1.aniadirElectrodomestico(e2);
        empresa1.aniadirElectrodomestico(e3); // Si pones dos aniadirElectrodomestico() del mismo tipo no lo escribe porque dice que ya está en el ArrayList
        System.out.println(empresa1.toString());
    }
}
