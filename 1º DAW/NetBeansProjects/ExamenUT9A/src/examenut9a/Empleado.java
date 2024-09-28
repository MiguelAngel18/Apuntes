/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut9a;

import java.io.Serializable;

/**
 * @author Miguel Ángel
 */
public class Empleado implements Serializable // Para la lectura de objetos en el método mostrarNuevoFichero() del gestorFichero
{
    private String dni,nombre,cargo;
    private int edad;
    private double sueldo;

    public Empleado(String dni,String nombre, int edad, String cargo, double sueldo)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.cargo = cargo;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getDni()
    {
        return dni;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }
    
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getCargo()
    {
        return cargo;
    }

    public void setCargo(String cargo)
    {
        this.cargo = cargo;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public double getSueldo()
    {
        return sueldo;
    }

    public void setSueldo(double sueldo)
    {
        this.sueldo = sueldo;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Empleado{");
        sb.append("dni=").append(dni);
        sb.append(", nombre=").append(nombre);
        sb.append(", cargo=").append(cargo);
        sb.append(", edad=").append(edad);
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        
        return sb.toString();
    }
}