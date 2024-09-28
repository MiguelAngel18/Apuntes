/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenut3;

/**
 * @author Miguel Ángel
 */
public class ExamenUT3
{
    public static void main(String[] args)
    {
        Nomina n1 = new Nomina("Miguel",18,3,20);
        n1.setEdad(12);
        n1.getCategoria('A');
        n1.esMenorDe25();
        System.out.println( n1.toString());
        System.out.println("__________________________________________________");
        System.out.println(n1.importePorTrienio());
    }    
}
