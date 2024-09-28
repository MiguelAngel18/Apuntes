/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenut4;

/**
 * @author Miguel Ángel
 */
public class ExamenUT4
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        Persona p = new Persona("Miguel Angel",2,"18-05-2005");
        System.out.println(p.toString());
        p.setFecha(18, 5,2005);
        
        System.out.println(p.toString());
    }
}
