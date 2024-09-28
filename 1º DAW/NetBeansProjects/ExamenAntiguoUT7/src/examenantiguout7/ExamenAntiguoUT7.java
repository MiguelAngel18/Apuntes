/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenantiguout7;

/**
 *
 * @author Miguel Ángel
 */
public class ExamenAntiguoUT7 
{
    public static void main(String[] args) 
    {
        Centro centro1 = new Centro();
        
        Estudiante alumno1 = new Estudiante(2024, "Miguel Angel", "Cabello Vega", "49695431K");
        
        centro1.altaPersona(alumno1);
        
        System.out.println(alumno1.toString());

    }
    
}
