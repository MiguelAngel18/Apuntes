/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut7b;

/**
 * @author Miguel Ángel
 */
public class Producto
{
    private String codigo,nombre,fechaCaducidad,paisOrigen;
    private double precio;
    
    private static int numProductos=0;
    private int idProducto;

    public Producto(String codigo, String nombre, String fechaCaducidad, String paisOrigen, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.paisOrigen = paisOrigen;
        this.precio = precio;
        
        numProductos++;
        idProducto=numProductos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getId() {
        return idProducto;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("codigo=").append(codigo);
        sb.append(", nombre=").append(nombre);
        sb.append(", fechaCaducidad=").append(fechaCaducidad);
        sb.append(", paisOrigen=").append(paisOrigen);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
   

    public boolean equals(Object o)
    {
        Producto p;
        
        if(o instanceof Producto)
        {
            p = (Producto) o;
            return codigo.equals(p.getCodigo());
        }
        else
        {
            return false;
        }
    }
}
