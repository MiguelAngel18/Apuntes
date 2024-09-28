/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenficherosrecu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author Miguel Ángel
 */
public class BD
{
    private HashMap<String,String> codigos;

    public BD()
    {
        codigos = new HashMap<>();
    }
    
    public void lectorFicheroCodigos(String fichero)
    {
        String linea;
        String[] cod;
        String aux;
        
        try
        {
            BufferedReader fentrada= new BufferedReader(new FileReader(fichero));
            linea=fentrada.readLine();
            
            while(linea!=null)
            {
                cod=linea.split("-");
                System.out.println(cod[0] + " : " + cod[1]);
                linea=fentrada.readLine();
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Fichero no encontrado.");
        }
        catch(IOException e)
        {
            System.out.println("Error detectado.");
        }
    }
    
    
    
    
}
