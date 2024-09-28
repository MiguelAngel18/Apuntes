/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut7a;

/**
 * @author Miguel Ángel
 */
public class Sandalia extends Zapato
{
    private int tiras;
    private boolean cerrada;

    public Sandalia(int tiras, boolean cerrada, String codigo, String color, String marca, char sexo, double precio, int talla)
    {
        super(codigo, color, marca, sexo, precio, talla);
        this.tiras = tiras;
        this.cerrada = cerrada;
    }

    public int getTiras()
    {
        return tiras;
    }

    public void setTiras(int tiras){
        this.tiras = tiras;
    }

    public boolean isCerrada(){
        return cerrada;
    }

    public void setCerrada(boolean cerrada){
        this.cerrada = cerrada;
    }

    @Override
    public String toString() 
    {
        StringBuilder salida = new StringBuilder();
        
        salida.append(super.toString());        
        salida.append("Sandalia{");
        salida.append("tiras=").append(tiras);
        salida.append(", cerrada=").append(cerrada);
        salida.append('}');
        
        return salida.toString();
    }
    
    public String vender()
    {
        return super.getCodigo() + "VS";
    }
}
