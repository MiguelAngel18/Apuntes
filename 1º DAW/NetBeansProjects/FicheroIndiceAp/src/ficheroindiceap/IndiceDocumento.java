/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheroindiceap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Miguel Ángel
 */
public class IndiceDocumento 
{
    private List<EntradaIndice> entradas;

    public IndiceDocumento()
    {
        entradas = new ArrayList<>();
    }
    
    public void addPalabra(String palabra, int num)
    {
        EntradaIndice entrada;
        int pos=estaPalabra(palabra);
        if(pos!=-1)
        {
            entrada=entradas.get(num);
        }
        else
        {
            entrada=new EntradaIndice(palabra.toUpperCase());
            insertar(entrada);
        }
    }
    
    public int estaPalabra(String palabra)
    {
        int izquierda=0,derecha=0,mitad=0,pos=-1;
        
        while(izquierda<=derecha && pos==-1)
        {
            mitad=(izquierda+derecha)/2;

            if(entradas.get(mitad).getPalabra().equals(palabra.toUpperCase()))
            {
                pos=mitad;
            }
            else
            {
                if(entradas.get(mitad).getPalabra().compareToIgnoreCase(palabra)>0)
                {
                    derecha=mitad-1;
                }
                else
                {
                    izquierda=mitad+1;
                }
            }
        }
        return pos;
    }
    
    public void insertar(EntradaIndice e)
    {
        entradas.add(e);
        Collections.sort(entradas);
    }

    @Override
    public String toString() 
    {
        StringBuilder salida = new StringBuilder();
        
        for(EntradaIndice entrada:entradas)
        {
            salida.append(entrada.toString());
        }
        
        return salida.toString();
    }
    
    
    public void listarIndiceDocumento()
    {
        System.out.println(toString());
    }
}