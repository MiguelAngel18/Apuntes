/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebascannerap;

/**
 *
 * @author Miguel Ángel
 */
public class Alumno 
{
    private String nombre;
    private int nota1,nota2,nota3;

    public Alumno(String nombre, int nota1, int nota2, int nota3) 
    {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    @Override
    public String toString() 
    {
        return "Alumno{" + "nombre=" + nombre + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public double getMedia()
    {
        double media;
        media = (nota1 + nota2 + nota3)/3.0;
        return media;
    }
}
