/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut3;

/**
 * @author Miguel Ángel
 */
public class Nomina
{
    private final int COMPLEMENTO_DESTINO=650,COMPLEMENTO_ESPECIFICO=630;
    private final double IRPF=0.18,VALOR_TRIENIO=25;
    
    private String nombre;
    private int edad,numTrienios;
    private double sueldoBase;

    public Nomina(String nombre, int edad, int numTrienios, double sueldoBase)
    {
        this.nombre = nombre;
        
        if(edad>=16)
        {
            this.edad = edad;
        }
        else
        {
            this.edad=16;
        }
        
        this.numTrienios = numTrienios;
        this.sueldoBase = sueldoBase;
    }
    
    public Nomina()
    {
        nombre = null;
        edad=0;
        sueldoBase=0;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public int getNumTrienios()
    {
        return numTrienios;
    }

    public void setNumTrienios(int numTrienios)
    {
        this.numTrienios = numTrienios;
    }

    public double getSueldoBase()
    {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase)
    {
        this.sueldoBase = sueldoBase;
    }
    
    
    public boolean esMenorDe25()
    {
        /*
        
        Lo mismo
        
        if(edad<25)
            return true;
        else
            return false;
        */
       
        return(edad<25);
    }
    
    private double getSueldoBruto()
    {
        return sueldoBase + getTotalComplementos() + importePorTrienio();
    }
    
    public int getTotalComplementos()
    {
        return COMPLEMENTO_DESTINO + COMPLEMENTO_ESPECIFICO;
    }
    
    public double getImporteIRPF()
    {
        
        if(esMenorDe25())
        {
            return 0;
        }
        else 
        {
            return getSueldoBruto()*IRPF;
        }
    }
    
    
    public double importePorTrienio()
    {
        return numTrienios*VALOR_TRIENIO;
    }
    
    
    public double getSueldoTotal()
    {
        return getSueldoBruto() - getImporteIRPF();
    }
    
    
    public String getCategoria(char categoria)
    {
        String valorCat;
        
        switch(categoria)
        {
            case 'A': valorCat="Aprendiz"; break;
            case 'B': valorCat="Becario"; break;
            case 'J': valorCat="Junior"; break;
            case 'E': valorCat="Experto"; break;
            default: valorCat="Desconocido"; break;
        }
        return valorCat;
    }
        
    // No lo hace con StringBuilder (porque en ese momento no lo habíamos dado)
    public String toString()
    {
        StringBuilder salida= new StringBuilder();
        salida.append("Nombre: ");
        salida.append(nombre).append("\n");
        salida.append("Edad: ");
        salida.append(edad).append("\n");
        salida.append("Sueldo Base: ");
        salida.append(sueldoBase).append("\n");
        salida.append("Importe por trienio: ");
        salida.append(importePorTrienio()).append("\n");
        salida.append("Sueldo Bruto: ");
        salida.append(getSueldoBruto()).append("\n");
        salida.append("Sueldo total ");
        salida.append(getSueldoTotal()).append("\n");
        
        return salida.toString();
    }   
}