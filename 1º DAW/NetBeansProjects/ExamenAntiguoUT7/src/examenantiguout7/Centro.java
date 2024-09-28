/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenantiguout7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Miguel Ángel
 */
public class Centro 
{
    private List<Persona> personas;

    public Centro() 
    {
        personas = new ArrayList<Persona>();
    }

    public void altaPersona(Persona p) 
    {
        if(!personas.contains(p))
        {
            personas.add(p);
        }
    }
    
    public void borrarPersona(String dni) 
    {
        Persona p;
        Boolean encontrado = false;

        Iterator<Persona> it=personas.iterator();
        
        while(it.hasNext() && !encontrado)        
        {
            p=it.next();
            if(p.getDNI().equals(dni))
            {
                it.remove();
                encontrado=true;
            }
        }
    }
    
    public void listarEstudiantes(int anio)
    {
        Estudiante e;
        Collections.sort(personas);
        
        for(Persona p: personas)
        {
            if(p instanceof Estudiante)
            {
                e=(Estudiante) p;
                
                if(e.getAnio()>anio)
                {
                    System.out.println(e.toString());
                }
            }
        }
    }
    
    public ArrayList<Empleado> getEmpleados()
    {
        ArrayList<Empleado> empleados= new ArrayList<>();
        
        for(Persona p: personas)
        {
            if(p instanceof Empleado)
            {
                empleados.add((Empleado) p);
            }
        }
        return empleados;
    }
    
    public void mostrarProfesores()
    {
        ArrayList<Empleado> empleados= getEmpleados();
        Collections.sort(empleados, new ComparadorAntiguedad());
        
        for(Persona p: personas)
        {
            if(p instanceof Profesor)
            {
                System.out.println(p.toString());
            }
        }
    }
    
    
    
    
    
}








