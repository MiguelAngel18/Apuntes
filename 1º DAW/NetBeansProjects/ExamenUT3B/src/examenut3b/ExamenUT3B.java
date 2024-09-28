/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenut3b;

/**
 * @author Miguel Ángel
 */
public class ExamenUT3B
{
    public static void main(String[] args)
    {
        // TODO code application logic here

        Pelicula p = new Pelicula("Los herederos", "La vida", 3, 10);
        
        p.setCalificacion(9);
        System.out.println(p.esBuenaPeli());
        System.out.println(p.getValorPeli());
        System.out.println(p.toString());
    }
}
