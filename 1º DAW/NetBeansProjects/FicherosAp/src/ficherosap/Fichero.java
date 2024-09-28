/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficherosap;

/**
 *
 * @author Mariajo
 */
public abstract class Fichero implements Comparable<Fichero>{
    
    private String titulo;
    private int tamanio;

    public Fichero(String titulo, int tamanio) {
        this.titulo = titulo;
        this.tamanio = tamanio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    public String toString()
    {
        return  titulo + ":" + tamanio;
    }
    public void display()
    {
        System.out.println(toString());
    }
    
    public int compareTo(Fichero otro)
    {
        if(this.tamanio==otro.getTamanio())
            return 0;
        else if (this.tamanio<otro.getTamanio())
            return -1;
        else
            return 1;
        
    }
    
}
