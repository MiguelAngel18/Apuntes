/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cdsydvdsap;

/**
 *
 * @author Mariajo
 */
public abstract class Articulo implements Comparable<Articulo>{
    private String titulo;
    private int duracion;
    private boolean loTengo;
    private String comentario;

    public Articulo(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
        loTengo=false;
        comentario="";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isLoTengo() {
        return loTengo;
    }

    public void setLoTengo(boolean loTengo) {
        this.loTengo = loTengo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    @Override
    public String toString()
    {
        return "Titulo:" + titulo + " Duracion:" + duracion + "Lo tengo:" + loTengo + " Comentario:" + comentario;
    }
    
    public abstract double getPrecio();
    
    public int compareTo(Articulo otro)
    {
        if(duracion==otro.getDuracion())
            return 0;
        if(duracion<otro.getDuracion())
            return -1;
        return 1;
            
    }
    
}
