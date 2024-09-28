/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroeducativo;

/**
 *
 * @author Mariajo
 */
public abstract class Persona implements Comparable<Persona>{
    private String nombre;
    private String apellidos;
    private String DNI;

    public Persona(String nombre, String apellidos, String DNI) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    
    @Override
    public String toString()
    {
        StringBuilder salida= new StringBuilder();
        salida.append("Nombre:").append(nombre);
        salida.append(" Apellidos:").append(apellidos);
        salida.append(" DNI:").append(DNI);
        return salida.toString();
    }
    
    @Override
    public boolean equals(Object o)
    {
        Persona p;
        if(o ==null ||  !(o instanceof Persona))
            return false;
        else
        {
            p=(Persona) o;
            return DNI.equals(p.getDNI());
        }
        
    }
    
    public int compareTo(Persona otraPersona)
    {
        if(apellidos.equals(otraPersona.getApellidos()))
            return nombre.compareTo(otraPersona.getNombre());
        else
            return apellidos.compareTo(otraPersona.getApellidos());
    }
    
}
