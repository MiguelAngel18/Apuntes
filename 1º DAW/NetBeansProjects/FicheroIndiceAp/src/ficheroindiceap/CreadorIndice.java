/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheroindiceap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Miguel Ángel
 */
public class CreadorIndice
{
    private BufferedReader fentrada;
    private PrintWriter fsalida;
    private IndiceDocumento indice;

    public CreadorIndice(File f)
    {
        indice=new IndiceDocumento();
        try
        {
            leerFichero(f);
            guardarEnFichero();
        }
        catch(IOException e)
        {
            System.out.println("Error a la hora de abrir el fichero");
        }
    }
    
    public void leerFichero(File f) throws IOException
    {
        fentrada=new BufferedReader(new FileReader(f));
        String linea;
        String[] palabras;
            
        int numLinea=1;
        linea=fentrada.readLine();
        while(linea!=null)
        {
            palabras=linea.split(" ");
            for(int i=0;i<palabras.length;i++)
            {
                indice.addPalabra(palabras[i], numLinea);
            }
            linea=fentrada.readLine();
            numLinea++;
        }
    }
    
    public void guardarEnFichero() throws IOException
    {
        fsalida=new PrintWriter(new BufferedWriter(new FileWriter("indice.txt")));
        fsalida.write(indice.toString());
    }   
}