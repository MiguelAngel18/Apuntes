/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maximoap;

/**
 * @author Miguel Ángel
 */
public class MaximoAp 
{
    public static void main(String[] args) 
    {
        Maximo maximo = new Maximo();
        
        try
        {
            System.out.println("El maximo es" + maximo.maximoSinExcepciones());
        }
    }    
}
