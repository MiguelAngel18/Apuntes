/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut9;

import java.io.PrintWriter; // Versión mejorada de la escritura (Capa 1)
import java.io.BufferedWriter; // Versión mejorada de la escritura (Capa 2)
import java.io.FileWriter; // Versión más simplificada de la escrituta (Capa 3)

import java.io.File; // Creación de un fichero


// Ejemplo: fsalida=new PrintWriter(new BufferedWriter(new FileWriter("documento.txt")));

import java.io.BufferedReader; // Versión mejorada de la lectura (Capa 1)
import java.io.FileReader; // Versión mejorada de la lectura (Capa 2)

import java.io.FileNotFoundException; // Error de la búsqueda de archivos

import java.io.IOException; // Error de problemas en la IO

import java.io.UTFDataFormatException; // Error de la lectura debido al formato del texto dentro del documento leído

/**
 * @author Miguel Ángel
 */
public class UT9
{
    public static void main(String[] args) throws IOException
    {
        int linea=0;
        PrintWriter fsalida=new PrintWriter(new BufferedWriter(new FileWriter("documento.txt")));
        while(linea!=-1)
        {
            
        }
        System.out.println(fsalida.toString());
    }
    
}
