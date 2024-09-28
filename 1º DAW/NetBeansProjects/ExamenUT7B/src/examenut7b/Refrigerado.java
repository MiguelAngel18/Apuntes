/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut7b;

/**
 * @author Miguel Ángel
 */
public class Refrigerado extends Fresco
{
    private String organismo;
    private double temperaturaDeMantenimiento;

    public Refrigerado(String organismo, double temperaturaDeMantenimiento, String fechaDeEnvasado, String codigo, String nombre, String fechaCaducidad, String paisOrigen, double precio) {
        super(fechaDeEnvasado, codigo, nombre, fechaCaducidad, paisOrigen, precio);
        this.organismo = organismo;
        this.temperaturaDeMantenimiento = temperaturaDeMantenimiento;
    }

    public String getOrganismo() {
        return organismo;
    }

    public void setOrganismo(String organismo) {
        this.organismo = organismo;
    }
    
    public double getTemperaturaDeMantenimiento() {
        return temperaturaDeMantenimiento;
    }
    
    public void setTemperaturaDeMantenimiento(double temperaturaDeMantenimiento) {
        this.temperaturaDeMantenimiento = temperaturaDeMantenimiento;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Refrigerado{");
        sb.append("Fecha de envasado: ").append(super.getFechaDeEnvasado());
        sb.append(" Organismo: ").append(organismo);
        sb.append(" Temperatura de mantenimiento: ").append(temperaturaDeMantenimiento);
        sb.append('}');
        return sb.toString();
    }
}