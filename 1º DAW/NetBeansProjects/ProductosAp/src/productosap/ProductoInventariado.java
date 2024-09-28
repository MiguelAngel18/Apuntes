/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productosap;

/**
 *
 * @author Mariajo
 */
public class ProductoInventariado extends Producto {
    private int cantidad;
    private  float beneficio;

    public ProductoInventariado(int cantidad, float beneficio, String id, double precioBase) {
        super(id, precioBase);
        this.cantidad = cantidad;
        this.beneficio = beneficio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getBeneficio() {
        return beneficio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setBeneficio(float beneficio) {
        this.beneficio = beneficio;
    }
    
    public String toString()
    {
        return super.toString() + " Cantidad:" + cantidad + " Beneficio: " + beneficio;
    }
    
    
    public double calcularPrecioFinal()
    {
        return super.getPrecioBase()+ super.getPrecioBase()*beneficio/100;
    }
}
