/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut7a;

/**
 * @author Miguel Ángel
 */
public class ExamenUT7A
{
    public static void main(String[] args)
    {
        Deportiva d = new Deportiva("RUNNER", false,"A3054X", "Negro", "Nike", 'M', 999.99, 48);
        Mocasin m = new Mocasin("Cuero", "A3055X", "Azul Marino", "Springfield", 'M', 999.9, 44);
        Sandalia s = new Sandalia(1,true, "A3056X", "Azul Marino", "Adidas", 'M', 999,43);
        
        
        System.out.println(d.toString());
        System.out.println(m.toString());
        System.out.println(s.toString());
    }
}