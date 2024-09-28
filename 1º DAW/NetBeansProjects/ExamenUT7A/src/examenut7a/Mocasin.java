/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut7a;

/**
 * @author Miguel Ángel
 */
public class Mocasin extends Zapato
{
    private String tejido;

    public Mocasin(String tejido, String codigo, String color, String marca, char sexo, double precio, int talla)
    {
        super(codigo, color, marca, sexo, precio, talla);
        this.tejido = tejido;
    }

    

    public String getTejido()
    {
        return tejido;
    }

    public void setTejido(String tejido)
    {
        this.tejido = tejido;
    }

    @Override
    public String toString()
    {
        StringBuilder salida = new StringBuilder();
        
        salida.append(super.toString());
        salida.append("Mocasin{");
        salida.append("tejido=").append(tejido);
        salida.append('}');
        
        return salida.toString();
    }

    public String vender()
    {
        return super.getCodigo() + "VM";
    }
}
