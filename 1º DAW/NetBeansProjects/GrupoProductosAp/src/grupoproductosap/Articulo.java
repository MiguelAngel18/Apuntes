/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupoproductosap;

/**
 *
 * @author Mariajo
 */
public class Articulo implements Producto {
    private String descripcion;
private double precioUnitario;

public Articulo(String descripcion, double precio)
{
    this.descripcion = descripcion;
    precioUnitario = precio;
}
    @Override
  public double getPrecio()
{
return precioUnitario;
}
public String getDescripcion()
{
return descripcion;
}
public void setPrecio(double precio)
{
precioUnitario = precio;
}

public String toString()
{
    return descripcion + ":" + precioUnitario;
}
}
