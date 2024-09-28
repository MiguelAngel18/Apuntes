/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package centroeducativo;

import java.util.ArrayList;

/**
 *
 * @author Mariajo
 */
public class CentroEducativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Centro miCentro=new Centro();
        miCentro.altaPersona(new Estudiante(2022,"Estudiante 1","Gonzalez", "11111A"));
        miCentro.altaPersona(new Estudiante(2022,"Estudiante 2","Alvarez", "22222A"));
        miCentro.altaPersona(new Estudiante(2022,"AEstudiante 3","Gonzalez", "333333A"));
        miCentro.altaPersona(new Profesor("Informatica",1995,3,"Profe1","Perez","121212B"));
        miCentro.altaPersona(new Profesor("MAtematicas",1980,3,"Profe2","Garcia","13131313B"));
        miCentro.altaPersona(new Profesor("Informatica",2020,3,"Profe03","Perez","121212B"));
        miCentro.altaPersona(new Personal("Biblioteca",1999,3,"Personal1","Fernadez","2222F"));
        miCentro.altaPersona(new Personal("Comedor",1982,3,"Personal2","Ruiz","343434F"));
        System.out.println("Alumnos matriculados despues del 2021");
        miCentro.listarEstudiantes(2021);
        System.out.println("PROFESORES:");
        miCentro.mostrarProfesores();
        System.out.println("bIBLIOTECA:");
        miCentro.listarPersonalBiblioteca();
        
        miCentro.borrarJubilados();
        ArrayList<Empleado> empleados=miCentro.getEmpleados();
        System.out.println("Despues de borrar jubilados");
        for(Empleado e:empleados)
             System.out.println(e.toString());
        
        miCentro.borrarPersona("333333A");
        System.out.println("Despues de borrar 333333A");
        miCentro.listarEstudiantes(1999);
    }
    
}
