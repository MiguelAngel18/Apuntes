/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionarioap;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mariajo
 */
public class Concesionario {
    private String nombre;
    private ArrayList<Coche> coches;

    public Concesionario(String nombre) {
        this.nombre = nombre;
        coches=new ArrayList<Coche>();
        
    }

    public String getNombre() {
        return nombre;
    }
    
    /**
     *  – añade un coche comprobando previamente que no hay otro igual
     */
    
    public void añadir(Coche c)
    {
        if(c!=null)
            if(!coches.contains(c))
                coches.add(c);
            
        
    }
    
    /**
     *  – elimina los coches de un conductor determinado
     */
    
    public void borrarDeConductor(String quien)
    {
        Iterator<Coche> it=coches.iterator();
        while(it.hasNext())
        {
            if(it.next().getConductor().equals(quien))
                it.remove();
        }
    }
    
    /**
     *  -borra todos los taxis
     */
    
    public void borrarTaxis()
    {
         Iterator<Coche> it=coches.iterator();
        while(it.hasNext())
        {
            if(it.next() instanceof Taxi)
                it.remove();
        }
        
    }
    
    /**
     * - hace avanzar todos los coches
     */
    public void avanzarTodos() 
    {
        for(Coche c: coches)
            c.avanza();
    }
    
    /**
     * - muestra todos los coches
     */
    public void listarCoches() 
    {
        for(Coche c: coches)
            System.out.println(c.toString());
    }
}
