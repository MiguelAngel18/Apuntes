/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenanteriorut9ap;

/**
 *
 * @author Miguel Ángel
 */
public class Alumno
{
    private String nombre,apellidos,DNI;

    public Alumno(String nombre, String apellido1, String apellido2, String DNI)
    {
        this.nombre = nombre;
        apellidos = apellido1 + " " + apellido2;
        this.DNI = DNI;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellidos()
    {
        return apellidos;
    }

    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }

    public String getDNI()
    {
        return DNI;
    }

    public void setDNI(String DNI)
    {
        this.DNI = DNI;
    }

    @Override
    public String toString()
    {
        return "Alumno{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + '}';
    }
    
    
}
