/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenantiguout7;

/**
 *
 * @author Miguel Ángel
 */
public class Estudiante extends Persona
{
    private int anio;

    public Estudiante(int anio, String Nombre, String Apellidos, String DNI) 
    {
        super(Nombre, Apellidos, DNI);
        this.anio = anio;
    }

    public int getAnio() 
    {
        return anio;
    }

    public void setAnio(int anio) 
    {
        this.anio = anio;
    }

    @Override
    public String toString() 
    {
        return "Estudiantes{ " + "anio= " + anio + super.toString() + "}";
    }
    
}