/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso_bucles;

import java.util.Scanner;

/**
 * @author miguel
 */
public class Escalera_de_asteriscos_inversa 
{
    
	public static void main(String[] args) 
        {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir el número de filas: ");
        int numFilas = scanner.nextInt();
 
        for(int i=1; i<=numFilas; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        scanner.close();
    }
}

