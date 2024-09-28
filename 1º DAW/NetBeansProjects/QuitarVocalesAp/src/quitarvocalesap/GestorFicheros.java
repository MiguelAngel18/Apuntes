/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quitarvocalesap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Mariajo
 */
public class GestorFicheros
{
    private FileReader fentrada;
    private FileWriter fsalida;
    
    public void quitarVocales(String FileEntrada, String FileSalida)
    {
        int valor;
        char letra;
        try // Primer try, su  contenido puede causar FileNotFoundException, IOException.
        {
            fentrada=new FileReader(FileEntrada);
            fsalida= new FileWriter(FileSalida);
            valor=fentrada.read(); // no se llama line aporque va de caracter en caracter. Devuelver un -1 al acabar de leer el fichero.
            while(valor!=-1)
            {
                letra=(char) valor;
                try // Segundo try, al ser una estructura repetitiva el contenido puede dar algún error durante la lectura.
                {
                    esDigito(letra); // Método privado para saber si este carcter se trata de un número, con el fin de lanzar una excepción. Atrapada en el método público
                    if(!esVocal(letra)) // Método privado para saber si esta letra es una vocal, con el objetivo de no escribirla.
                            fsalida.write(letra);
                }
                catch(NumeroException e)
                {
                    System.out.println("Formato incorrecto. Número encontrado");
                }
                valor=fentrada.read();
            }
            fentrada.close();
            fsalida.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("El Fichero origen no existe");
        }
        catch (IOException e)
        {
            System.out.println("Error durante la escritua del archivo");
        }
    }
    
    
    private boolean esVocal(char caracter)
    {
        char[] vocales={'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i','o','u'};
        
        boolean encontrado=false;
        int i=0;
        
        while(i<vocales.length && !encontrado)
            if(vocales[i]==caracter)
                encontrado=true;
            else
                i++;
        return encontrado;        
    }
    
    
    private void esDigito(char caracter) throws NumeroException
    {
        if (Character.isDigit(caracter)) // Si es un número, entonces lanza una excepción 
            throw new NumeroException(); // Se crea una nueva clase de excepción a la que tendremos que crearle una clase propia.
    }
}