/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cdap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Mariajo
 */
public class CD {
     private List<Cancion> canciones;
    
    public CD()
    {
        canciones=new ArrayList<Cancion>();
    }
    
    
    public void addCancion(Cancion c)
    {
        if(c!=null && !canciones.contains(c))
            canciones.add(c);
    }
    
    public boolean borrarCancion(String titulo)
    {
         boolean encontrado = false;
                int i = 0;
                while (!encontrado && i < canciones.size())
                {
                        Cancion c = canciones.get(i);
                        if (c.getTitulo().equals(titulo))
                        {                canciones.remove(i);
                                        encontrado = true;
                                }
                        else
                                i++;
                }
                return encontrado;
                
        }
    
    public boolean borrarCancionV2(String titulo)
    {
        Iterator<Cancion>it=canciones.iterator();
        boolean encontrado=false;
        while(it.hasNext() && !encontrado)
        {
            Cancion c=it.next();
            if(c.getTitulo().equals(titulo))
            {
                encontrado=true;
                it.remove();
            }
        }
        return encontrado;
    }
    
    public void listarPorDuracion()
    {
        Collections.sort(canciones);
    }
    public void listarPorTitulo()
    {
        Collections.sort(canciones, new ComparadorTitulo());
    }
    
    public void listarPorInterprete()
    {
        Collections.sort(canciones, new ComparadorInterprete());
    }
    public float getDuracionTotal()
    {
        float total=0;
        for(Cancion c: canciones)
            total+=c.getDuracion();
        return total;
    }
    
    public String toString()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("Duracion total:");
        sb.append(getDuracionTotal());
        sb.append("\n");
        for(Cancion c: canciones){
            sb.append(c.toString());
            sb.append("\n");
        }
        return sb.toString();
            
        
        
    }
}
