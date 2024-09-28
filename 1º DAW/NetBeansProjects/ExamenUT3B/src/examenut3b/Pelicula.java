/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut3b;

/**
 * @author Miguel Ángel
 */
public class Pelicula
{
    private String nombre,director;
    private final int ACCION=1,COMEDIA=2,DRAMA=3,FANTASIA=4,SUSPENSE=5;
    
    private int duracion,anio,genero;
    private double calificacion; // 1 al 10

    public Pelicula(String nombre, String director, int genero, int duracion)
    {
        this.nombre = nombre;
        
        this.director = director;
        
        if(genero>0 && genero<5)
        {
            this.genero = genero;
        }
        else
        {
            this.genero = 1;
        }
        
        this.duracion = duracion;
        
        calificacion=0;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDirector()
    {
        return director;
    }

    public void setDirector(String director)
    {
        this.director = director;
    }

    public int getDuracion()
    {
        return duracion;
    }

    public void setDuracion(int duracion)
    {
        this.duracion = duracion;
    }

    public int getAnio()
    {
        return anio;
    }

    public void setAnio(int anio)
    {
        this.anio = anio;
    }

    public int getGenero()
    {
        return genero;
    }

    public void setGenero(int genero)
    {
        this.genero = genero;
    }

    public double getCalificacion()
    {
        return calificacion;
    }

    public void setCalificacion(double calificacion)
    {
        if(calificacion>=0 && calificacion<=10)
        {
            this.calificacion = calificacion;
        }
    }
    
    
    public boolean esBuenaPeli()
    {
        return (calificacion>8);
    }
    
    public double getValorPeli()
    {
        double valor=0;
        int antiguedad=2024-anio;
        
        
        if(anio==2023)
        {
            valor=4500*calificacion;
        }
        if(antiguedad>1 && antiguedad<5)
        {
            valor=3000*calificacion;
        }
        if(antiguedad>5 && antiguedad<10)
        {
            valor=2000*calificacion;
        }
        else
        {
            valor=1500*calificacion;
        }
        
        return valor;
    }
    
    
    public String generoToString()
    {
        String generoEscrito;
        switch(genero)
        {
            case ACCION: generoEscrito="ACCION"; break;
            case COMEDIA: generoEscrito="COMEDIA"; break;
            case DRAMA: generoEscrito="DRAMA"; break;
            case FANTASIA: generoEscrito="FANTASIA"; break;
            case SUSPENSE: generoEscrito="SUSPENSE"; break;
            default: generoEscrito="INEXISTENTE"; break;
        }
            
        return generoEscrito;
    }

    @Override
    public String toString()
    {
        StringBuilder salida = new StringBuilder();
        
        salida.append("Nombre: ").append(nombre).append("\n");
        salida.append("Director: ").append(director).append("\n");
        salida.append("Anio de estreno: ").append(anio).append(" anios").append("\n");
        salida.append("Genero: ").append(generoToString()).append("\n");
        salida.append("Calificacion: ").append(calificacion).append("\n");
        
        return salida.toString();
    }
    
    public void imprimir()
    {
        System.out.println(toString());
    }
}