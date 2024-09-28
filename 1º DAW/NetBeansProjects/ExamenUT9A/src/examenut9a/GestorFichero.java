/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut9a;

import java.io.Serializable;

// Leer y escribir ficheros tipo texto

// Lectura
    import java.io.BufferedReader;
    import java.io.FileReader;

// Escritura
    import java.io.PrintWriter;
    import java.io.BufferedWriter;
    import java.io.FileWriter;

// Leer y escribir ficheros del tipo Binario
    
import java.io.FileOutputStream;
import java.io.FileInputStream;

import java.io.ObjectOutputStream; // Ecritura
import java.io.ObjectInputStream; // Lectura


// Exceptions
import java.io.IOException;
import java.io.FileNotFoundException;


/**
 * @author Miguel Ángel
 */
public class GestorFichero implements Serializable
{
    private BufferedReader entrada; // Flujo de Lectura
    private ObjectOutputStream salida; // Flujo de Escritura
    private PrintWriter errores; // Flujo de escritura de errores

    public GestorFichero()
    {
        try
        {
            // Se abre el flujo entrada para el fichero "empleados.txt" 
            entrada = new BufferedReader (new FileReader("empleados.txt"));
            
            // Se abre el flujo salida para el fichero "nuevo.txt"
            salida = new ObjectOutputStream(new FileOutputStream("nuevo.txt"));
            
            // Se abre el flujo salida para el fichero "errores.txt" que muestra los datos erróneos del fichero "empleados.txt"
            errores = new PrintWriter(new BufferedWriter(new FileWriter("errores.txt")));
            convertirFichero();
        }
        catch(FileNotFoundException e)
        {
            System.err.println("Fichero inexistente");
        }
        catch(IOException e)
        {
            System.err.println("Error al escribir");
        }
    }
    
    public void convertirFichero()
    {
        try
        {
            String linea;
            String[] datos;
            Empleado empleado;
            double sueldo;
            linea = entrada.readLine();
        
            while(linea!=null)
            {
                datos=linea.split(",");
                
                try
                {                    
                    if(!esCorrectoDNI(datos[0]))
                    {
                        throw new DniIncorrectoException(); // Excepción propia
                    }
                    else
                    {
                        empleado = new Empleado(datos[0],datos[1],Integer.parseInt(datos[2]),datos[3],Double.parseDouble(datos[4]));
                         
                        if(empleado.getCargo().equalsIgnoreCase("Administrativo"))
                        {
                            sueldo = empleado.getSueldo() + empleado.getSueldo()*0.10;
                            empleado.setSueldo(sueldo);
                        }
                        
                        if(empleado.getCargo().equalsIgnoreCase("Informatico"))
                        {
                            sueldo = empleado.getSueldo() + empleado.getSueldo()*0.15;
                            empleado.setSueldo(sueldo);
                        }             
                        salida.writeObject(empleado); // Escribe el objeto empleado, con los nuevos datos, en binario
                    }
                }
                catch(DniIncorrectoException exception)
                {
                    errores.println(datos[0] + "@" + datos[1]);
                }                
                linea=entrada.readLine();
            }
            entrada.close();
            salida.close();
            errores.close();
        }
        catch(IOException e)
        {
            System.err.println("Error al leer el fichero");
        }
    }
    
    private boolean esCorrectoDNI(String dni)
    {
        boolean correcto=false;
        
        if(dni.length()==9) // Si no tiene 9 dígitos devuelve false
        {
            for(int i=0;i<dni.length()-1;i++)
            {
                if((Character.isDigit(dni.charAt(i))))
                {
                    correcto=true; // Si sus 8 primeros caracteres son números devuelve true
                }
            }
            
            if(correcto==true)
            {
                if((!Character.isDigit(dni.charAt(dni.length()-1))))
                {
                    correcto=true; // Si sus 8 primeros caracteres son números y su último caracter es una letra devuelve true
                }
            }
        }
        return correcto;
    }
    
    public void mostrarErrores() // Imprimer el contenido del fichero errores
    {
        int cont=0;
        
        try
        {
            BufferedReader errores = new BufferedReader (new FileReader("errores.txt"));
            String linea = errores.readLine(); // Lee los errores
            while(linea!=null)
            {
                System.out.println(linea); // Los imprime
                cont++; // Los suma
                linea= errores.readLine(); // Pasa al siguiente
            }
            errores.close(); // Cuando no hay más cierra el flujo de lectura
            System.out.println("Errores"+ cont); // Imprime la cantidad de errores
        }
        catch(FileNotFoundException e)
        {
            System.err.println("Fichero no encontrado");
        }
        catch(IOException e)
        {
            System.err.println("Error al leer el fichero 'errores.txt'");
        }
    }
    
    public void mostrarNuevoFichero() // Muestra el contenido del fichero nuevo.txt, que contiene la info de los empleados de empleados.txt
    {
        Empleado empleado; // Se crea una instancia de la clase Empleado
        try
        {
            // Se crea un flujo de lectura del tipo ObjectInputStream
            ObjectInputStream fleer = new ObjectInputStream(new FileInputStream("nuevo.txt"));
            
            // Introduce los valores del flujo a la varible de la clase Empleado
            empleado = (Empleado) fleer.readObject();
            while(empleado!=null)
            {
                System.out.println(empleado.toString());
                empleado=(Empleado) fleer.readObject(); // Siguiente empleado
            }
            fleer.close(); // Se cierra el flujo
        }
        catch(ClassNotFoundException e)
        {
            System.err.println("Formato del fichero invalido");
        }
        catch(FileNotFoundException e)
        {
            System.err.println("Fichero nuevo no existe");
        }
        catch(IOException e)
        {
            System.err.println("Error al leer");
        }
    }
}