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
public class Triangulo extends Figura{
    private int base;
    private int altura;

    public Triangulo(int base, int altura, Point centro, Color color) {
        super(centro, color);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" +  super.toString()+ " base=" + base + ", altura=" + altura + '}';
    }

    
    @Override
    public double getArea() {
        
        return (1.0*base*altura)/2;
        
    }

    @Override
    public double getPerimetro() {
        
        return 3*base;
    }

    
    
}
