/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupoproductosap;

/**
 *
 * @author Mariajo
 */
public class Paquete implements Producto{
    
    private int cuantos;
    private Producto producto;

    public Paquete(int cuantos, Producto producto) {
        this.cuantos = cuantos;
        this.producto = producto;
    }

    @Override
    public double getPrecio() {
        return producto.getPrecio()*cuantos;
    }
        
    public String toString()
    {
        return cuantos + ":" +  producto.toString() + "Precio Total:" + getPrecio();
    }
    
    
}
