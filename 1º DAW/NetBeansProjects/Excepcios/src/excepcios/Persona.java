/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcios;

/**
 *
 * @author Miguel Ángel
 */
public class Persona implements Comparable<Persona>
{
    private String nombre;
    private String apellidos;
    private String DNI;

    public Persona(String Nombre, String Apellidos, String DNI) 
    {
        this.nombre = Nombre;
        this.apellidos = Apellidos;
        this.DNI = DNI;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String Nombre) 
    {
        this.nombre = Nombre;
    }

    public String getApellidos() 
    {
        return apellidos;
    }

    public void setApellidos(String Apellidos) 
    {
        this.apellidos = Apellidos;
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
        return "DNI=" + DNI + "Nombre=" + nombre + ", Apellidos=" + apellidos;
    }
    
    @Override
    public boolean equals(Object o)
    {
        Persona p;
        if(o==null || !(o instanceof Persona))
        {
            return false;
        }
        else
        {
            p=(Persona) o;
            return DNI.equals(p.getDNI());
        }
    }
    
    public int compareTo(Persona otra)
    {
        if(apellidos.equals(otra.getApellidos()))
        {
            return nombre.compareTo(otra.getNombre());
        }
        else
        {
            return apellidos.compareTo(otra.getApellidos());
    
        }
    }
}

