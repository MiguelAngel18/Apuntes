/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenantiguout7;

/**
 *
 * @author Miguel Ángel
 */
public abstract class Empleado extends Persona
{
    private int anio;
    private int despacho;
    private double sueldo;

    public Empleado(int anio, int despacho, String Nombre, String Apellidos, String DNI) 
    {
        super(Nombre, Apellidos, DNI);
        this.anio = anio;
        this.despacho = despacho;
    }

    public int getAnio() 
    {
        return anio;
    }

    public void setAnio(int anio) 
    {
        this.anio = anio;
    }

    public int getDespacho() 
    {
        return despacho;
    }

    public void setDespacho(int despacho) 
    {
        this.despacho = despacho;
    }

    public abstract double getSueldo();
    

    public void setSueldo(double sueldo) 
    {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() 
    {
        return "Anio=" + anio + ", Despacho=" + despacho + ", Sueldo=" + sueldo + super.toString() + '}';
    }
}
