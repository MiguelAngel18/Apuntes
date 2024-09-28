/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quitarvocalesap;

/**
 *
 * @author Mariajo
 */
public class QuitarVocalesAp
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        GestorFicheros quitar=new GestorFicheros();
        
        quitar.quitarVocales("entrada.txt", "salida.txt");   
    }
}
