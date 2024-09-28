/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut7a;

/**
 * @author Miguel Ángel
 */
public class Deportiva extends Zapato
{
    private String descripcion;
    private boolean impermeable;

    public Deportiva(String descripcion, boolean impermeable, String codigo, String color, String marca, char sexo, double precio, int talla)
    {
        super(codigo, color, marca, sexo, precio, talla);
        this.descripcion = descripcion;
        this.impermeable = impermeable;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public boolean isImpermeable()
    {
        return impermeable;
    }

    public void setImpermeable(boolean impermeable)
    {
        this.impermeable = impermeable;
    }

    @Override
    public String toString()
    {
        StringBuilder salida = new StringBuilder();
        
        salida.append(super.toString());
        salida.append("Deportiva{");
        salida.append("descripcion=").append(descripcion);
        salida.append(", impermeable=").append(impermeable);
        salida.append('}');
        
        return salida.toString();
    }

    public String vender()
    {
        return super.getCodigo() + "VD";
    }
}