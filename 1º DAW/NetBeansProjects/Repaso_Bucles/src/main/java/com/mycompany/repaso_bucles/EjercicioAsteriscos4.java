/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso_bucles;

import java.util.Scanner;

/**
 *
 * @author migue
 */

public class EjercicioAsteriscos4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir el número de filas: ");
        int numFilas = scanner.nextInt();
         
        for(int i = 1, j=numFilas-1; i<=numFilas; i++, j--){
        escribirCaracter(' ', j);
        escribirCaracter('*', i);
        System.out.println();
    }
    scanner.close();
    
     
    private static void escribirCaracter(char c, int cont)
    {
        for(int i = 0; i<cont; i++)
        {
            System.out.print(c);
        }
    }
}
