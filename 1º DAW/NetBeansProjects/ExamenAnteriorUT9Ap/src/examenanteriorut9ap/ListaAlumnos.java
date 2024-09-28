/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenanteriorut9ap;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel Ángel
 */
public class ListaAlumnos 
{
    private List<Alumno> alumnos;

    public ListaAlumnos()
    {
        alumnos = new ArrayList<>();
    }

    @Override
    public String toString() 
    {
        return "ListaAlumnos{\n" + alumnos.toString() + "'\n}";
    }
    
    public void add(Alumno a)
    {
        if(a!=null && !alumnos.contains(a))
        {
            alumnos.add(a);
        }   
    }

    public void delete(Alumno a)
    {
        if(a!=null && alumnos.contains(a))
        {
            alumnos.remove(a);
        }   
    }
    
    public List<Alumno> getAlumnos()
    {
        return alumnos;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
