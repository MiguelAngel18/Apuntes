/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuraap;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Mariajo
 */
public class Cuadrado extends Figura{
    private int lado;

    public Cuadrado(int lado, Point centro, Color color) {
        super(centro, color);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + super.toString() + " lado=" + lado + '}';
    }

    @Override
    public double getArea() {
        return lado*lado;
    }

    @Override
    public double getPerimetro() {
        return 4*lado;
    }
    
    
    
}
