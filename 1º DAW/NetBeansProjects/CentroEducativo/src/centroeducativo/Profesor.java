/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroeducativo;

import java.time.LocalDate;

/**
 *
 * @author Mariajo
 */
public class Profesor extends Empleado{
    
    private String departamento;

    public Profesor(String departamento, int anioIncorporacion, int numDespacho, String nombre, String apellidos, String DNI) {
        super(anioIncorporacion, numDespacho, nombre, apellidos, DNI);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void cambioDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String toString()
    {
        StringBuilder salida=new StringBuilder();
        salida.append(super.toString());
        
        salida.append("\nPertenece al departamento:").append(departamento);
        return salida.toString();
    }

    @Override
    public double getSueldo() {
        LocalDate fecha=LocalDate.now();
        int antiguedad=fecha.getYear()-super.getAnioIncorporacion();
        return 1500 + (antiguedad/3)*100;
        
    }
    
    
    
    
}
