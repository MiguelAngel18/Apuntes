/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut6b;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Miguel Ángel
 */
public class Coche 
{
    private String codigo;
    private final int PRECIO_BASE=7000;
    private Color color;
    private int[] potencias = {60,80,100,120,125};
    private int potenciaMinima;
    private boolean vendido;
    private double peso;
    
    private String[] extras;
    
    private int siguiente=0;
    
    public Coche(String codigo, Color color, double peso, int potencia)
    {
        this.codigo = codigo;
        this.peso = peso;
        
        extras= new String[10];
        vendido = false;
   
        this.color = color;
        if(comprobarColor())
        {
            this.color = color;
        }
        else
        {
            this.color=Color.BLANCO;
        }
        
        potenciaMinima = potencia;
        if(comprobarPotencia())
        {
            potenciaMinima = potencia;
        }
        else
        {
            potenciaMinima = 100;
        }
        
        /* Este está muy bien y muy bonito pero no usa el vector potenciaMinima :(
        switch(potenciaMinima)
        {
            case 60: potencia = potenciaMinima; break;
            case 80: potencia = potenciaMinima; break;
            case 100: potencia = potenciaMinima; break;
            case 120: potencia = potenciaMinima; break;
            case 125: potencia = potenciaMinima; break;
            default: potencia=0; break;
        }*/
        
    }

    public Coche()
    {}

    
    public String getCodigo()
    {
        return codigo;
    }

    public Color getColor()
    {
        return color;
    }

    public int getPotenciaMinima()
    {
        return potenciaMinima;
    }

    public boolean getVendido()
    {
        return vendido;
    }
    
    public void vender()
    {
        vendido=true;
    }
    
    public double getPeso()
    {
        return peso;
    }

    public String imprimirExtras()
    {
        int num=0;
        StringBuilder salida = new StringBuilder();
        
        salida.append("\nExtras:\n");
        for(int i=0;i<extras.length;i++) // Si no está se introduce en el vector, en la posicion de j
        {
            num=i+1;
            salida.append("\tExtra n.").append(num).append(": ").append(extras[i]).append(";\n");
        }
        return salida.toString();
    }
    public String[] getExtras()
    {
        return extras;
    }
    
    public boolean comprobarColor()
    {
        boolean colorCorrecto=false;
        
        if(getColor()==Color.BLANCO || getColor()==Color.NEGRO || getColor()==Color.ROJO || getColor()==Color.AZUL || getColor()==Color.AMARILLO)
        {
            colorCorrecto=true;
        }
        return colorCorrecto;
    }
    
    public boolean comprobarPotencia()
    {
        boolean potenciaCorrecta=false;    
        
        if(getPotenciaMinima()==potencias[0] || getPotenciaMinima()==potencias[1] || getPotenciaMinima()==potencias[2] || getPotenciaMinima()==potencias[3] || getPotenciaMinima()==potencias[4])
        {
            potenciaCorrecta=true;
        }
        return potenciaCorrecta;
    }

    @Override
    public String toString() 
    {
        imprimirExtras();
        StringBuilder salida= new StringBuilder();
        
        salida.append("\nCoche con codigo: ").append(codigo).append(" de color ").append(color).append(" y peso ").append(peso).append(" kilos\n");
        salida.append("Potencia: ").append(potenciaMinima).append(" y precio base ").append(PRECIO_BASE).append(" euros\n");
        salida.append(imprimirExtras());

        return salida.toString();
    }    
    
    public void aniadirExtra(String extra)
    {
        boolean vacio=false;
        int introducidos=0;
        
        for(int i=0;i<extras.length;i++)
        {
            if(extras[i]==null)
            {
                vacio=true;
            }
            else
            {
                introducidos++;
            }
        }
                    
        if(vacio==true)
        {
            extras[introducidos]=extra;
        }
    }
    
    public void borrarExtra(String cual)
    {        
        for(int i=0;i<extras.length;i++)
        {
            if(extras[i]!=null && extras[i].equalsIgnoreCase(cual))
            {
                extras[i]=null;
            }
        } 
    }
    
    public void ordenarExtras()
    {
      //  Arrays.sort(extras);
        Arrays.sort(extras,0,siguiente);
    }
    
    public String invertirExtra()
    {
        String[] invertido = new String[2];
        
        for(int i=extras.length;i>=extras.length;i--)
        {
            for(int j=extras.length;j>=extras.length;j--)
            {
                invertido[j]=extras[i];
            }
        }
        return invertido.toString();
    } 
}