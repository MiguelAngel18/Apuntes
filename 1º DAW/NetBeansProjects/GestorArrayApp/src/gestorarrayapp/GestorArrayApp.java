/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorarrayapp;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Mariajo
 */
public class GestorArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            GestorArray miGestor=new GestorArray(5,"num.txt");
            miGestor.cargarArray();
            miGestor.duplicarArray();
            miGestor.volcarArray();
            
            miGestor.demoFile("prueba");
          /* SumadorEnterosScanner sumador=new SumadorEnterosScanner("prueba.txt");
            System.out.println("La suma es" + sumador.sumar());*/
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ArgumentoIncorrectoException e)
        {
            System.out.println(e.getMessage());
        }
        
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("No caben todos los numeros del fichero en el vector");
        }
        
        
       
        
/*
  
  VisualizadorEnteros miVisualizador=new VisualizadorEnteros();
  miVisualizador.mostrarEnteros("numeros.txt");*/
        
    }
    
}
