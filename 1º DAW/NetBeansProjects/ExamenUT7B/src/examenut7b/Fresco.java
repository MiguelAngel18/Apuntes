/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut7b;

/**
 * @author Miguel Ángel
 */
public class Fresco extends Producto
{
    private String fechaDeEnvasado;

    public Fresco(String fechaDeEnvasado, String codigo, String nombre, String fechaCaducidad, String paisOrigen, double precio) {
        super(codigo, nombre, fechaCaducidad, paisOrigen, precio);
        this.fechaDeEnvasado = fechaDeEnvasado;
    }

    public String getFechaDeEnvasado() {
        return fechaDeEnvasado;
    }

    public void setFechaDeEnvasado(String fechaDeEnvasado) {
        this.fechaDeEnvasado = fechaDeEnvasado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Frescos{");
        sb.append("fechaDeEnvasado=").append(fechaDeEnvasado);
        sb.append('}');
        return sb.toString();
    }
}
