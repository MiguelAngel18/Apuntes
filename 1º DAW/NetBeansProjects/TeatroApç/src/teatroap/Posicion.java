/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teatroap;

/**
 * @author Miguel Ángel
 */
public class Posicion 
{
    private int fila,asiento;

    public Posicion(int fila, int asiento) 
    {
        this.fila = fila;
        this.asiento = asiento;
    }

    @Override
    public String toString() 
    {
        return "Posicion{" + "fila=" + fila + ", asiento=" + asiento + '}';
    }

    public int getFila()
    {
        return fila;
    }

    public int getAsiento()
    {
        return asiento;
    }
}
