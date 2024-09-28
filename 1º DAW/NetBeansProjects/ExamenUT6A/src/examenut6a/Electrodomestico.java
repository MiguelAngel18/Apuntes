/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut6a;

import java.util.Arrays;

/**
 * @author Miguel Ángel
 */
public class Electrodomestico
{
    private String codigo;
    private double precio,peso;
    private Color color;
    private char consumo;
    private boolean encendido;
    
    private String[] ecologico;
    
    private int siguiente;

    public Electrodomestico(String codigo, double precio, double peso, char consumo)
    {
        this.codigo = codigo;
        this.precio = precio;
        this.peso = peso;
        
        if(comprobarConsumo(consumo))
        {
           this.consumo = consumo;
        }
        else
        {
           this.consumo = 'E';
        }
        
        encendido = false;
        
        ecologico = new String[5];
    }
    
    public Electrodomestico()
    {
        codigo = "000000";
        precio = 1.000;
        peso = 1.25;
        
        color=color.NEGRO;
        consumo = 'E';
        
        encendido = false;
        
        ecologico = new String[5];
        
        encender();
        añiadirCaracteristicas("4X4");
    }

    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public Color getColor()
    {
        return color;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public char getConsumo()
    {
        return consumo;
    }

    public void setConsumo(char consumo)
    {
        this.consumo = consumo;
    }

    public boolean isEncendido()
    {
        return encendido;
    }

    public void setEncendido(boolean encendido)
    {
        this.encendido = encendido;
    }

    public String[] getEcologico()
    {
        return ecologico;
    }

    public void setEcologico(String[] ecologico)
    {
        this.ecologico = ecologico;
    }

    public int getSiguiente()
    {
        return siguiente;
    }

    public void setSiguiente(int siguiente)
    {
        this.siguiente = siguiente;
    }

    
    public boolean comprobarConsumo(char consumo)
    {
        boolean aceptado=false;
        if(consumo>='A' && consumo<='E')
        {
            aceptado=true;
        }
        return aceptado;
    }
    
    
    public void encender()
    {
        encendido=true;
    }
    
    public void añiadirCaracteristicas(String nuevaCaracteristica)
    {
        if(siguiente<ecologico.length)
        {
            ecologico[siguiente]=nuevaCaracteristica;
        }
    }
    
    public void borrarCaracteristicas(String CaracteristicaBorrar)
    {
        boolean encontrado=false;
        int i=0;
        
        if(CaracteristicaBorrar!=null)
        {
            while(!encontrado && i<siguiente)
            {
                if(ecologico[i].equalsIgnoreCase(CaracteristicaBorrar))
                {
                    encontrado=true;
                    
                    // Borrado de la caracteristica introducida
                    for(int j=i;j<siguiente-1;j++)
                    {
                        ecologico[j]=ecologico[j+1];
                    }
                    
                    ecologico[siguiente-1]=null;
                    siguiente--;
                }
                else
                {
                    i++;
                }
            }
        }
    }
    
    public void ordenarCaracteristicas()
    {
        Arrays.sort(ecologico);
    }
    
    public void invertirCaracteristicas()
    {
        String[] invertido= new String[ecologico.length];
        
        int i=0;
        
        for(int j=siguiente-1;j>=0;j--)
        {
            
        }
    }
    
    @Override
    public String toString()
    {
        return "Electrodomestico -->" + " Codigo: " + codigo + ", Precio: " + precio + ", Peso: " + peso + ", Color: " + color + ", Consumo: " + consumo + ", Encendido: " + encendido + ", Ecologico: " + Arrays.toString(ecologico) + "\n";
    }
}
