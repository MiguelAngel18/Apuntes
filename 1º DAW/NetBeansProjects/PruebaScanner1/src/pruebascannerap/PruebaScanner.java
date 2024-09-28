/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebascannerap;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class PruebaScanner
{
    
    private Scanner fnotas;
    private ArrayList<Alumno> alumnos;
    private PrintWriter fmedias;

    public PruebaScanner(String entrada, String salida) 
    {
        try
        {
            fnotas=new Scanner(new File(entrada));
            fmedias=new PrintWriter(new BufferedWriter(new FileWriter(salida)));
            alumnos=new ArrayList<Alumno>();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("El fichero de notas no existe");
        }
        catch (IOException e)
        {
            System.out.println("Probelema al abrir os ficheros");
        }
        catch (Exception e)
        {
            System.out.println("Probelema detectado");
        }
    }
    
    public void cargarDeFichero()
    {
        String linea;
        String[] datos;
        
        while(fnotas.hasNext())
        {
            linea=fnotas.nextLine();
            datos=linea.split("@");
            alumnos.add(new Alumno(datos[0],Integer.parseInt(datos[1]), Integer.parseInt(datos[2]), 
            Integer.parseInt(datos[3])));
        }
        fnotas.close();
        
    }
    
    public void generarMedias()
    {
        for(Alumno a: alumnos)
            fmedias.write(a.getNombre() + "@" + a.getMedia());
        fmedias.close();
    }    
}
