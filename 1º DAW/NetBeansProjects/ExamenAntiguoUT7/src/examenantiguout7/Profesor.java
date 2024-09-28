/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenantiguout7;

import static examenantiguout7.Departamento.LENGUAJE;

/**
 *
 * @author Miguel Ángel
 */
public class Profesor extends Empleado
{
    private Departamento departamento;

    public Profesor(Departamento departamento, int anio, int despacho, String Nombre, String Apellidos, String DNI) 
    {
        super(anio, despacho, Nombre, Apellidos, DNI);
        
        switch(departamento)
        {
            case LENGUAJE: this.departamento=departamento; break;
            case MATEMATICAS: this.departamento=departamento; break;
            case ARQUITECTURA: this.departamento=departamento; break;
            default: System.out.println("Departamento invalido");
        }
    }

    @Override
    public double getSueldo() 
    {
        int antiguedad = 2024 - super.getAnio();
        return 1500 + (antiguedad/3)*100;
    }
    
    @Override
    public String toString() 
    {
        return "Profesor{" + " Departamento= " + departamento + super.toString() + '}';
    }
}
