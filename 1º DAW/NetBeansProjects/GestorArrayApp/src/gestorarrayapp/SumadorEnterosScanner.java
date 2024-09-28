/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorarrayapp;

import java.util.Scanner;

/**
 *
 * @author Mariajo
 */
public class SumadorEnterosScanner {
    private Scanner sc;

    public SumadorEnterosScanner(String nombre) {
        
        sc=new Scanner(nombre);
        
    }
    
    public int sumar()
    {
        int suma=0;
        String sum="";
        while(sc.hasNext())
            
             sum=sc.next();
        return suma;
    }
    
}
