/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut9b;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

/**
 * @author Miguel Ángel
 */
public class GestorFichero
{
    private BufferedReader entrada;
    private ObjectOutputStream salida;
    private PrintWriter errores;
    
    public GestorFichero()
    {
        try
        {
            entrada = new BufferedReader(new FileReader("libros.txt")); // Lector del archivo libros.txt en formato texto
            salida = new ObjectOutputStream(new FileOutputStream("nuevo.txt")); // Escritor del archivo nuevo.txt en formato binario
            errores = new PrintWriter(new BufferedWriter(new FileWriter("errores.txt"))); // Escritor del archivo errores.txt en formato texto
        
            convertirFichero();
        }
        catch(FileNotFoundException e)
        {
            System.err.println("Fichero no encontrado");
        }
        catch(IOException e)
        {
            System.err.println("Error durante el proceso de escritura");
        }
    }
    
    public void convertirFichero()
    {
        try // Primer try - Declaración de las variables
        {
            String linea;
            String[] datos;
            Libro libro;
            
            linea = entrada.readLine();
                
            while(linea!=null) // Lectura, introducción de datos y creación de objetos
            {
                datos=linea.split("-");
                
                try // Segundo try - Comprobación del formato del código y la creación de objetos
                {
                    if(!esCorrecto(datos[2]))
                    {
                        throw new ISBNIncorrectoException();
                    }
                    else
                    {
                        libro = new Libro(datos[0],datos[1],datos[2],Integer.parseInt(datos[3]),Double.parseDouble(datos[4]));
                        
                        if(libro.getFechaPublicacion()<1950)
                        {
                            libro.setPrecio(libro.getPrecio() + libro.getPrecio()*0.10);
                        }
                        else if(libro.getFechaPublicacion()<2000)
                        {
                            libro.setPrecio(libro.getPrecio() - libro.getPrecio()*0.05);
                        }
                        salida.writeObject(libro);
                    }
                }
                catch(ISBNIncorrectoException e) // Catch interno - Recoge la excepción emitida en caso de un ISBN incorrecto
                {
                    errores.println(datos[2] + "@" + datos[0]);
                }
                
                linea=entrada.readLine();
            }
            entrada.close();
            salida.close();
            errores.close();
        }
        catch(IOException e) // Catch externo - Recoge en caso de que se emita, una excepción provocada por algo externo al código
        {
            System.err.println("Error durante la lectura");
        }
    }
    
    private boolean esCorrecto(String ISBN)
    {
        boolean correcto=false;
        
        if(ISBN.length()==13 && ISBN.charAt(0)==9)
        {
            correcto=true;
        }
        
        return correcto;
    }

    public void verErrores()
    {
        try
        {
            int cont=0;
            BufferedReader errores = new BufferedReader(new FileReader("errores.txt"));
            String linea = errores.readLine();
            
            while(linea!=null)
            {
                cont++;
                System.out.println(linea);
                linea = errores.readLine();
            }
            errores.close();
            System.out.println("Errores:" + cont);
            if(cont==10)
            {
                System.out.println("Todos estan mal");
            }
        }
        catch(FileNotFoundException e)
        {
            System.err.println("Fichero no encotrado");
        }
        catch(IOException e)
        {
            System.err.println("Error en la lectura");
        }
    }
    
    public void mostrarNuevoFichero() // Muestra el fichero nuevo.txt, que contiene los empleados del fichero empleados.txt, pero con los valores actualizados
    {
        try
        {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("nuevo.txt"));
            
            Libro libro = (Libro) lector.readObject();
            while(libro!=null)
            {
                System.out.println(libro.toString());
                libro = (Libro) lector.readObject();
            }
            lector.close();
        }
        catch(ClassNotFoundException e)
        {
            System.err.println("Formato del fichero invalido");
        }
        catch(FileNotFoundException e)
        {
            System.err.println("Formato del fichero invalido");
        }
        catch(IOException e)
        {
            System.err.println("Error en la lectura");
        }
    }
}








