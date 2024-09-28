/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut7b;

/**
 * @author Miguel Ángel
 */
public class Congelado extends Refrigerado
{
    private Origen origen;

    public Congelado(Origen origen, String organismo, double temperaturaDeMantenimiento, String fechaDeEnvasado, String codigo, String nombre, String fechaCaducidad, String paisOrigen, double precio) {
        super(organismo, temperaturaDeMantenimiento, fechaDeEnvasado, codigo, nombre, fechaCaducidad, paisOrigen, precio);
        this.origen = origen;
    }

    public Origen getOrigen(){
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Congelados{");
        sb.append(" Temperatura de mantenimiento: ");
        sb.append(super.getTemperaturaDeMantenimiento());
        sb.append(" Origen=").append(origen);
        sb.append('}');
        
        return sb.toString();
    }
}
