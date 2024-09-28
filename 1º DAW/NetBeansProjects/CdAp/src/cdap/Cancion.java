/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cdap;

/**
 *
 * @author Mariajo
 */
public class Cancion implements Comparable<Cancion>{
     private String titulo;
    private String interprete;
    private float duracion;
    
    public Cancion(String titulo, String interprete, float duracion) 
    {
        this.titulo=titulo;
        this.interprete=interprete;
        this.duracion=duracion;
        
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getInterprete(){
        return interprete;
    }
    
    public float getDuracion(){
        return duracion;
    }
    
    public String toString()
    {
        return titulo + "  " + interprete +  " " + duracion; 
    }

    @Override
    public int compareTo(Cancion o) {
        if(duracion== o.getDuracion())
            return 0;
        else if(duracion<o.getDuracion())
            return -1;
        else
            return 1;
    }
    
    public boolean equals(Object o)
    {
        Cancion otro;
        if(o instanceof Cancion)
        {
            otro=(Cancion) o;
            return titulo.equals(otro.getTitulo()) && interprete.equals(otro.getInterprete());
        }
        return false;
    }
}
