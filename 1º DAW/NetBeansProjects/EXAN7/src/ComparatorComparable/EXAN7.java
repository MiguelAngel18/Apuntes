/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Miguel Ángel
 */
public class EXAN7 
{
    public static void main(String[] args) 
    {
        Coche coche1 = new Coche("d",1);
        Coche coche2 = new Coche("c",12);
        Coche coche3 = new Coche("b",123);
        Coche coche4 = new Coche("a",1234);
        
        List<Coche> lista = new ArrayList<Coche>();
        
        System.out.println("Sin ordenar:");
                
        lista.add(coche1);
        lista.add(coche3);
        lista.add(coche4);
        lista.add(coche2);

        System.out.println(lista.toString());
        
        System.out.println("_______________________________________________________\nOrdenado por la velocidad:");

        Collections.sort(lista);
        
        System.out.println(lista.toString());
        
        System.out.println("_______________________________________________________\nOrdenado por la velocidad:");

        Collections.sort(lista, new ComparacionVelocidadMenorAMayor());
        
        System.out.println(lista.toString());
        
                      

        
    }
    
}
