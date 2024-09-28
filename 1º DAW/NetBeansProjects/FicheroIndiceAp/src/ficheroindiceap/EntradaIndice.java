/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheroindiceap;

import java.util.ArrayList;

/**
 *
 * @author Miguel Ángel
 */
public class EntradaIndice implements Comparable<EntradaIndice>
{
    private String palabra;
    private ArrayList<Integer> listaNumeros;

    public EntradaIndice(String palabra)
    {
        this.palabra = palabra;
        listaNumeros = new ArrayList<Integer>();
    }
    
    public void add(int numero)
    {
        if(!listaNumeros.contains(numero))
        {
            listaNumeros.add(numero);
        }
    }
    
    public String getPalabra()
    {
        return palabra;
    }

    @Override
    public String toString()
    {
        return "EntredaIndice{" + "palabra=" + palabra + ", listaNumeros=" + listaNumeros + '}';
    }

    @Override
    public int compareTo(EntradaIndice o) 
    {
        return palabra.compareTo(o.getPalabra());
    }   
}