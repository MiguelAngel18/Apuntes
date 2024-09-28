/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maximoap;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author Miguel Ángel
 */
public class Maximo 
{
    public class maximoSinExcepciones() throws FileNotFoundException, IOException, numberFormatException
    {
        BufferedReader fEntrada = new BufferedReader(new FileReader("numeros"));
        
        String linea;
        linea-fEntrada.readLine();
        int maximo=0;
        
        while(linea!=null)
        {
            try
            {
                if(maximo<Integer.parseInt(linea))
                {
                    maximo=Integer.parseInt(linea);
                }   
            }
            catch
            {
                System.out.println("");
            }
        }
        
        throw FileNotFoundException();
        
    }
}
