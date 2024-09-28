/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut9a;

/**
 * @author Miguel Ángel
 */
public class ExamenUT9A
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        GestorFichero miGestor=new GestorFichero();
        System.out.println("AQUI");
        miGestor.mostrarErrores();
        miGestor.mostrarNuevoFichero();
        
    }
}

/**
 * El fichero empleados.txt es el siguiente:
 * 
 * 42853434G,Pedro Herrera Torres,45,Administrativo,1200
 * 94385674T,Marta Yanez Ferrera,40,Administrativo,1000
 * 43223942H,Carlos Gonzalez Teruel,53,Informatico,1460
 * 67666765R, Eva Quevedo Lopez, 32, Economista, 1200
 * 94385674T,Marta Barreto Quintana,47,Administrativo,1300
 * 9435563Y,Pedro Gonzalez Diaz,56,CEO,3500
 * 56477851E,Cristina Gonzalez Pacheco,50,Directora RHH,2000
 * 428546765,Paula Gonzalez Baez,46,Directora Operaciones,2250
 * 43443235T,Ruben Melian Suarez,38,Jefe de Almacen,1400
 * 78955323C,Luis Santana Guerra,32,Informatico,1500
 */