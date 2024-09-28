/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficherosap;

/**
 *
 * @author Mariajo
 */
public class FicheroJPG extends FicheroImagen{
    
    private Compresion compresion;

    public FicheroJPG(Compresion compresion, String titulo, int tamanio) {
        super(titulo, tamanio);
        this.compresion = compresion;
    }
    
    public String toString()
    {
        return super.toString() + "Compresion:" + compresion.toString();
    }
    
/*    public void display()
    {
        System.out.println(toString());
        
    }*/
}
