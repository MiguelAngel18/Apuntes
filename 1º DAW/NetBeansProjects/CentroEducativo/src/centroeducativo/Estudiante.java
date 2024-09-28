/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroeducativo;

/**
 *
 * @author Mariajo
 */
public class Estudiante extends Persona{
    private int cursoMatricula;

    public Estudiante(int cursoMatricula, String nombre, String apellidos, String DNI) {
        super(nombre, apellidos, DNI);
        this.cursoMatricula = cursoMatricula;
    }

    public int getCursoMatricula() {
        return cursoMatricula;
    }

    public void matricular(int cursoMatricula) {
        this.cursoMatricula = cursoMatricula;
    }
    
    public String toString()
    {
        StringBuilder salida=new StringBuilder();
        salida.append(super.toString());
        salida.append("\nAño de mat´rcula:").append(cursoMatricula);
        return salida.toString();
    }
    
    
}
