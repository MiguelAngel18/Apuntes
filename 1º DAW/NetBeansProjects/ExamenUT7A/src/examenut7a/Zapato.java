/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut7a;

/**
 * @author Miguel Ángel
 */
public abstract class Zapato implements Comparable<Zapato>
{
    private String codigo,color,marca;
    private char sexo;
    private double precio;
    private int talla;

    public Zapato(String codigo, String color, String marca, char sexo, double precio, int talla)
    {
        this.codigo = codigo;
        this.color = color;
        this.marca = marca;
        this.sexo = sexo;
        this.precio = precio;
        this.talla = talla;
    }

    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public char getSexo()
    {
        return sexo;
    }

    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public int getTalla()
    {
        return talla;
    }

    public void setTalla(int talla)
    {
        this.talla = talla;
    }
    
    public int compareTo(Zapato z)
    {
        if(talla==z.getTalla())
            return 0;
        if(talla<z.getTalla())
            return -1;
        return 1;
    }

    @Override
    public String toString()
    {
        StringBuilder salida = new StringBuilder();
        salida.append("Zapato: ");
        salida.append("Codigo=").append(codigo);
        salida.append(", Color=").append(color);
        salida.append(", Marca=").append(marca);
        salida.append(", Sexo=").append(sexo);
        salida.append(", Precio=").append(precio);
        salida.append(" - Tipo: ");
        return salida.toString();
    }
    
    public abstract String vender();
    
    public boolean equals(Object o)
    {
        Zapato z;
        
        if(o instanceof Zapato)
        {
            z = (Zapato) o;
            
            return codigo.equals(z.getCodigo());
        }
        else
        {
            return false;
        }
    }
}