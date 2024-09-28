/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficherosap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Mariajo
 */
public class ReproductorMP3 {
    
    private List<Fichero> ficheros;
    private int capacidad;
    private int tamActual;

    public ReproductorMP3(int capacidad) {
        this.capacidad = capacidad;
        ficheros=new ArrayList<Fichero>();
        
        addFichero(new FicheroMusica(500, "cancion1", 200));
      
        addFichero(new FicheroMusica(750, "cancion2", 150));
        
        
        
    }
    
    public void addFichero(Fichero f)
    {
        if(f!=null && capacidad>=(tamActual + f.getTamanio()))
        {
            ficheros.add(f);
            tamActual+=f.getTamanio();
        }
        
    }
    
    /**
     *  muestra todos los datos de los ficheros de
música que hay en el MP3 con la duración de cada uno en minutos y
segundos. Al final se muestra el total de horas, minutos y segindos
de música que hay.
     */
    public void mostrarCanciones()
    {
        int tam=0;
        for (Fichero f: ficheros)
        {
            
            if(f instanceof FicheroMusica)
            {
                f.display();
               
                tam+= ((FicheroMusica) f).getDuracion();
           }
        }
        
        System.out.println("Duracion total:");
        int h=tam/3600;
        int m= (tam - h*3600)/60;
        int s=(tam - h*3600 - m*60);
        
        System.out.println( h + ":" + m +":" + s);
    }
    
    /**
     * 
     */
    public void mostrarTodo()
    {
        for (Fichero f: ficheros)
        {
            f.display();
        }
    }
    
    /**
     *  - dado un título busca un fichero de imagen y lo borra. 
     * Devuelve true o false dependiendo de si se ha encontrado o no.
     */
    
   public boolean borrarFicheroImagen(String titulo)
   {
       Iterator<Fichero> it=ficheros.iterator();
       Fichero f;
       while(it.hasNext())
       {
           f=it.next();
           if (f instanceof FicheroImagen && f.getTitulo().equals(titulo))
           {
               it.remove();
               return true;
           }
       }
       return false;
       
   }
   
   /**
    * reset() - borra todos los ficheros y pone el tamaño actual a 0.
    */
   
   public void reset()
   {
       ficheros.clear();
       tamActual=0;
   }
   
   /**
    * ordenar() - ordena la lista de ficheros
    */
   
   public void ordenar()
   {
       Collections.sort(ficheros);
   }
   
   
   /**
    *  ordena aleatoriamente la lista de ficheros 
    * (utiliza shuffle() de la clase Collections).
    */
   public void reordenar() 
   {
       Collections.shuffle(ficheros);
   }
   
   public void ordenarPorTitulo()
   {
       Collections.sort(ficheros, new ComparadorTitulo());
   }
}
