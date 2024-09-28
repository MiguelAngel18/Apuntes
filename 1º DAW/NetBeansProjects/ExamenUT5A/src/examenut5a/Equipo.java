/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut5a;

import java.util.Iterator;

/**
 * @author Miguel Ángel
 */
public class Equipo
{
    private Jugador[] equipo;
    private int siguiente;

    private int numeroJugadores=15;
    public Equipo()
    {
        equipo = new Jugador[numeroJugadores];
        siguiente=0;
    }
    
    public boolean addJugador(Jugador j)
    {
        boolean esAniadido=false;
        
        if(j!=null && siguiente<equipo.length && !estaEnElEquipo(j))
        {
            equipo[siguiente]= j;
            siguiente++;
            esAniadido=true;
        }
        
        return esAniadido;
    }
    
    private boolean estaEnElEquipo(Jugador jugador)
    {
        boolean esta=false;
        int i=0;
        while(jugador!=null && i<siguiente)
        {
            if(equipo[i].getNombre().equals(jugador.getNombre()))
            {
                esta=true;
                equipo[i]=jugador;
            }
            else
            {
                i++;
            }
        }
        return esta;
    }
    
    public void mostrarEquipo()
    {
        System.out.println("Fugadores: ");
        
        for(Jugador j: equipo)
        {
            System.out.print(j.toString() + " ");
        }
    }
    
    public Jugador[] mostrarPorPuesto(Puesto p)
    {
        System.out.println("Jugadores cuya posicion es: " + p);
        
        Jugador[] jugadoresPuesto = new Jugador[numeroJugadores];
                
        int i=0;
        for(Jugador j : equipo)
        {
            if(j.getPuesto().equals(p)) // j.getPuesto()== p; Así creo que es mejor
            {
                jugadoresPuesto[i]=j;
                i++;
            }
        }
        return jugadoresPuesto;
    }


    public Jugador getCapitanEquipo()
    {
        Jugador capitan = null;
        int maxEdad=0;
        int dorsal=0;
                
        int i=0;
        for(Jugador j : equipo)
        {
            if(j.getEdad()>maxEdad)
            {
                maxEdad=j.getEdad();
                capitan=j;
            }
        }
        return capitan;
    }
    
    public Jugador borrarJugador(String nombre) // NO SE PUEDE USAR EL ITERADOR CON LOS ARRAY'S
    {
        Jugador borrarJugador=null;
        boolean esta=false;
        int i=0;
        
        while(equipo[i]!=null && i<siguiente)
        {
            if(equipo[i].getNombre().equals(nombre))
            {
                esta=true;
                borrarJugador=equipo[i];
            }
            else
            {
                i++;
            }
            
            
            if(esta)
            {
                for(int j=0;j<numeroJugadores-1;j++) // Se recorre el vector pasando 
                {
                    equipo[j]=equipo[j+1];
                }
                equipo[numeroJugadores-1]=null;
                numeroJugadores--;
            }
        }
        return borrarJugador;
    }

 






}