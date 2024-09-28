/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionarioap;

/**
 *
 * @author Mariajo
 */
public abstract class Coche {
    private String conductor;
    private String tipo;
    private String color;
    private Punto posicion;

    public Coche(String conductor, String tipo, String color, Punto posicion) {
        this.conductor = conductor;
        this.tipo = tipo;
        this.color = color;
        this.posicion = posicion;
    }

    public String getConductor() {
        return conductor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public Punto getPosicion() {
        return posicion;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPosicion(Punto posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Coche{" + "conductor=" + conductor + ", tipo=" + tipo + ", color=" + color + ", posicion=" + posicion.toString() + '}';
    }
    
    
    public abstract void avanza();
    
    
    @Override
    public boolean equals(Object o)
    {
        Coche otro;
        if(o instanceof Coche)
        {
            otro=(Coche) o;
            
            return color.equals(otro.getColor()) && tipo.equals(otro.getTipo()) && conductor.equals(otro.getConductor());
        }
        else
            return false;
    }
    
    
    
}
