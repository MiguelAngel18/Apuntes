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
public class Circulo extends Figura{
    private int radio;
  
    
    public Circulo(Point centro, Color color, int radio)
    {
        super(centro, color);
        this.radio=radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + super.toString() +   "radio=" + radio + '}';
    }

    @Override
    public double getArea() {
        return Math.PI*radio*radio;
    }

    @Override
    public double getPerimetro() {
        return 2*Math.PI*radio;
    }
    
    
}
