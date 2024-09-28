/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productosap;

/**
 *
 * @author Mariajo
 */
public class Producto {
    private String id;
    private double precioBase;

    public Producto(String id, double precioBase) {
        this.id = id;
        this.precioBase = precioBase;
    }

    public String getId() {
        return id;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", precioBase=" + precioBase + '}';
    }
    
    
}
