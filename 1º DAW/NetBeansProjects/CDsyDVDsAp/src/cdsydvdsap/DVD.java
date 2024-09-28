/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cdsydvdsap;

/**
 *
 * @author Mariajo
 */
public class DVD extends Articulo{
    
    private String director;

    public DVD(String director, String titulo, int duracion) {
        super(titulo, duracion);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    public double getPrecio()
    {
        return 20 + 20*0.01;
    }
    @Override
    public String toString()
    {
        return super.toString() + " Director:" + director;
    }
    
    @Override
    public boolean equals(Object o)
    {
        DVD dvd;
        if(!(o instanceof DVD))
            return false;
        else
        {
            dvd=(DVD)o;
            if(director.equals(dvd.getDirector() )&& (super.getTitulo().equals(dvd.getTitulo())))
                return true;
            else
                return false;
        }
            
       
    }
    
}
