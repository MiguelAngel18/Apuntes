/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorarrayapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Mariajo
 */
public class VisualizadorEnteros {
    
    
    public void mostrarEnteros(String nombre)
    {
        String linea;
        int cont=0;
        try{
            
            BufferedReader fichero=new BufferedReader(new FileReader( new File(nombre)));
            linea=fichero.readLine();
            System.out.println("HOLA");
            while(linea!=null)
            {
                if(cont==10)
                {
                        System.out.println("");
                        cont=0;
                }
                else
                {
                    try{
                        System.out.print(Integer.parseInt(linea) + "\t");
                    }
                    catch(NumberFormatException e)
                    {
                        System.out.print("***" + "\t");
                    }
                    finally
                    {
                        linea=fichero.readLine();
                        cont++;
                    }
                }
                
            }
            
            
        }
        
        catch(FileNotFoundException e)
        {
            System.out.println("FIchero NO existe");
        }
        catch (IOException e)
        {
            System.out.println("Error de lectura");
        }
        
        
    }
    
}
