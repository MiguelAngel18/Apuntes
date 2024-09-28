/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroeducativo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Mariajo
 */
public class Centro {

  
    private ArrayList<Persona> personas;
    
     public Centro() {
         personas=new ArrayList<Persona>();
    }
    
     public void altaPersona(Persona p)
     {
         if(!personas.contains(p))
             personas.add(p);
         
     }
     
     public void borrarPersona(String dni)
     {
         Iterator<Persona> it=personas.iterator();
         Persona p;
         Boolean encontrado=false;
         
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
             if(p instanceof Estudiante)
             {
                 e=(Estudiante)p;
                 if(e.getCursoMatricula()>anio)
                     System.out.println(e.toString());
             }
     }
     
     public ArrayList<Empleado> getEmpleados()
     {
         ArrayList<Empleado> empleados=new ArrayList<Empleado>();
         for(Persona p: personas)
             if(p instanceof Empleado)
                 empleados.add((Empleado)p);
         
         return empleados;
     }
     
     public void mostrarProfesores()
     {
         ArrayList<Empleado> empleados=getEmpleados();
         Collections.sort(empleados, new ComparadorAntiguedad());
         
         
         for(Empleado p: empleados)
             if(p instanceof Profesor)
                  System.out.println(p.toString());
     }
     
     public void listarPersonalBiblioteca()
     {
         ArrayList<Empleado> empleados=getEmpleados();
         Collections.sort(empleados, new ComparadorAntiguedad());
         Personal per;
          for(Empleado p: empleados)
             
             if(p instanceof Personal)
             {
                 per=(Personal)p;
                 if(per.getSeccion().equalsIgnoreCase("Biblioteca"))
                     System.out.println(per.toString());
             }
     }
          
     
     public void borrarJubilados()
     {
          
          Iterator<Persona> it=personas.iterator();
          Persona emple;
          while(it.hasNext())
          {
              emple=it.next();
              if(emple instanceof Empleado)
              if((2024-((Empleado)emple).getAnioIncorporacion())>=35)
                  it.remove();
          }
     }
    
}
