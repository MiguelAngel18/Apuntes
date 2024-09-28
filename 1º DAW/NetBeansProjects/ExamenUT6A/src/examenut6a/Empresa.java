/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut6a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Miguel Ángel
 */
public class Empresa
{
    private String nombre,nif,direccion;
    
    private ArrayList<Electrodomestico> electrodomesticos;

    public Empresa(String nif,String nombre, String direccion)
    {
        this.nombre = nombre;
        this.nif = nif;
        this.direccion = direccion;
        
        electrodomesticos = new ArrayList();
    }
    
    public void aniadirElectrodomestico(Electrodomestico nuevo)
    {
        if(!estaElectro(nuevo))
        {
            electrodomesticos.add(nuevo);
        }
    }
    
    public boolean estaElectro(Electrodomestico nuevo)
    {
        int i=0;
        boolean encontrado=false;
        while(!encontrado && i<electrodomesticos.size())
        {
            if(electrodomesticos.get(i).getCodigo().equalsIgnoreCase(nuevo.getCodigo()))
            {
                encontrado=true;
            }
            else
            {
                i++;
            }
        }
        return encontrado;
    }

    public void cuantasCaracteristicas(String caracteristica)
    {
        int i=0;
        int cont=0;
        
        for(Electrodomestico e: electrodomesticos)
        {
            cont++;
        }
    }

    public HashSet<Electrodomestico> borrarColor(Color color)
    {
        HashSet<Electrodomestico> salida = new HashSet<>();
        Electrodomestico uno;
        
        Iterator<Electrodomestico> it = electrodomesticos.iterator();
        while(it.hasNext())
        {
            uno=it.next();
            if(uno.getColor()==color)
            {
                salida.add(uno);
                it.remove();
            }
        }
        
        return salida;
    }
    
    public void cuantosConsumo()
    {
        int[] contadores= new int[5];
        
        for(Electrodomestico e: electrodomesticos)
        {
            switch(e.getConsumo())
            {
                case 'A': contadores[0]++; break;
                case 'B': contadores[0]++; break;
                case 'C': contadores[0]++; break;
                case 'D': contadores[0]++; break;
                case 'E': contadores[0]++; break;
            }
        }
        System.out.println("Contador de A: " + contadores[0]);
        System.out.println("Contador de B: " + contadores[1]);
        System.out.println("Contador de C: " + contadores[2]);
        System.out.println("Contador de D: " + contadores[3]);
        System.out.println("Contador de E: " + contadores[4]);
    }

    @Override
    public String toString() // Hacerlo con el StringBuilder
    {
        StringBuilder salida = new StringBuilder();
        
        salida.append(nif).append("-").append(nombre).append("-").append(direccion).append(":\n\n");
        
        for(Electrodomestico e: electrodomesticos)
        {
            salida.append(e);
        }
        
        return salida.toString();
    }



    













}