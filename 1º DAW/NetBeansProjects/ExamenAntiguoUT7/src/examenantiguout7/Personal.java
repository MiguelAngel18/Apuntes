/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenantiguout7;

/**
 *
 * @author Miguel Ángel
 */
public class Personal extends Empleado
{
    private Seccion seccion;

    public Personal(Seccion seccion, int anio, int despacho, String Nombre, String Apellidos, String DNI) 
    {
        super(anio, despacho, Nombre, Apellidos, DNI);
        
        switch(seccion)
        {
            case BIBLIOTECA: this.seccion=seccion; break;
            case DECANATO: this.seccion=seccion; break;
            case SECRETARIA: this.seccion=seccion; break;
            default: System.out.println("Seccion invalida");
        }
    }

    public Seccion getSeccion() 
    {
        return seccion;
    }
    
    @Override
    public double getSueldo() 
    {
        int antiguedad = 2024 - super.getAnio();
        return 800 + (antiguedad/6)*50;
    }
    
    @Override
    public String toString() 
    {
        return "Personal{" + " Seccion= " + seccion + super.toString() + '}';
    }
    
    
    
}
