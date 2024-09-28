/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroeducativo;

/**
 *
 * @author Mariajo
 */
public abstract class Empleado extends Persona {
    private int anioIncorporacion;
    private int numDespacho;

    public Empleado(int anioIncorporacion, int numDespacho, String nombre, String apellidos, String DNI) {
        super(nombre, apellidos, DNI);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void ReasignacionDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }
    
    public String toString()
    {
        StringBuilder salida=new StringBuilder();
        salida.append(super.toString());
        salida.append("\nAño incorporacion:").append(anioIncorporacion);
        salida.append("\nNumreo de Despacho:").append(numDespacho);
        return salida.toString();
    }
    
    public abstract double getSueldo();
}
