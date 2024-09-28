/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut6b;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author Miguel Ángel
 */
public class Concesionario
{
    private String nombre, NIF,direccion;
    private List<Coche> coches;

    public Concesionario(String nombre, String NIF, String direccion)
    {
        this.nombre = nombre;
        this.NIF = NIF;
        this.direccion = direccion;
        coches = new ArrayList<>();
    }
    
    public void aniadirCoche(Coche c)
    {
        boolean esta=false;
        
        for(int i=0;i<coches.size();i++)
        {
            if(coches.get(i)==null)
            {
                coches.add(c);
            }
        }
    }


    public int cuantosDeExtra(String extra)
    {
        int cont=0;
        
        for(Coche c : coches)
        {
            if(extra.equalsIgnoreCase(c.getExtras().toString()))
            {
                cont++;
            }
        }
        return cont;
    }

    public HashSet borrarDeColor(Color color)
    {
        HashSet borrados = new HashSet();
        
        for(Coche c : coches)
        {
            if(c.getColor()==color)
            {
                borrados.add(c);
                coches.remove(c);
            }
        }
        return borrados;
    }
    
    public void cuantosPorPotencia()
    {
        int de60=0,de80=0,de100=0,de120=0,de125=0;
        
        StringBuilder salida = new StringBuilder();
        
        for(Coche c : coches)
        {
            switch(c.getPotenciaMinima())
            {
                case 60: de60++; break;
                case 80: de80++; break;
                case 100: de100++; break;
                case 120: de120++; break;
                case 125: de125++; break;
            }
        }
        
        salida.append("Potencia: 60:").append(de60);
        salida.append("Potencia: 80:").append(de80);
        salida.append("Potencia: 100:").append(de100);
        salida.append("Potencia: 120:").append(de120);
        salida.append("Potencia: 125:").append(de125);
    }
    
    
    public String toString()
    {
        StringBuilder salida = new StringBuilder();
        
        salida.append("Concesionario: ").append(nombre).append(" ");
        salida.append("NIF: ").append(NIF).append(" ");
        salida.append("Concesionario: ").append(nombre).append("\n\nCoches:\t\n\n");
        
        for(Coche c: coches)
        {
            salida.append(c.toString());
        }
        
        return salida.toString();
    }
}









