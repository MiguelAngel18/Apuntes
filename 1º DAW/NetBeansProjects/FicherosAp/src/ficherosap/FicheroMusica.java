/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficherosap;

/**
 *
 * @author Mariajo
 */
public class FicheroMusica extends Fichero{
    
    private int duracion;

    public FicheroMusica(int duracion, String titulo, int tamanio) {
        super(titulo, tamanio);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }
    public String toString()
    {
        int m=duracion/60;
        int s=duracion%60;
        return super.toString() + " duracion:" + m + "min " + s + " seg"; 
    }
    public void display()
    {
        System.out.println(toString());
    }
}
