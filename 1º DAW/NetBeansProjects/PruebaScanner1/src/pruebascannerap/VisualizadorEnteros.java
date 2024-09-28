/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebascannerap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Miguel Ángel
 */
public class VisualizadorEnteros 
{
    public void mostrarEnteros(String nombre) throws FileNotFoundException 
    {
        String linea;
        int cont=0;
        try
        {
            BufferedReader fichero = new BufferedReader(new FileReader(nombre));
            linea=fichero.readLine();
        
            while(linea!=null)
            {
                if(cont==10)
                {
                    System.out.println("");
                    cont=0;
                }
                try
                {
                    System.out.println(Integer.parseInt(linea));
                }
                catch (NumberFormatException e)
                {
                    System.out.print("*** ");
                }
                cont++;
                linea=fichero.readLine();
            }
        }
         catch (FileNotFoundException e)
        {
            System.out.println("Fichero no encontrado");
        }
        catch (IOException e)
        {
            System.out.println("Error al abrir el fichero");
        }
    }
}












