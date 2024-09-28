/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebascannerap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class sumadorEnterosScanner
{
    private Scanner sc;

    public sumadorEnterosScanner(String fichero) throws FileNotFoundException 
    {
        BufferedReader linea = new BufferedReader(new FileReader(fichero));
    }
    
    public int sumar()
    {
        int suma=0;
        while(sc.hasNextInt())
        {
            suma+=sc.nextInt();
        }
        sc.close();
        return suma;
    }
    
    public int sumarV2()
    {
        int suma=0;
        while(sc.hasNext())
        {
            suma+=Integer.parseInt(sc.next());
        }
        sc.close();
        return suma;
    }
}