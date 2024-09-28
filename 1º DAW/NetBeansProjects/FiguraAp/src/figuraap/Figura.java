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
public abstract  class Figura implements Movible, Comparable<Figura>{
    
    private Point centro;
    private Color color;

    public Figura(Point centro, Color color) {
        this.centro = centro;
        this.color = color;
    }

    public Point getCentro() {
        return centro;
    }

    public Color getColor() {
        return color;
    }

    public void setCentro(Point centro) {
        this.centro = centro;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figura{" + "centro=" + centro + ", color=" + color + '}';
    }
    
    
    public abstract double getArea();
    public abstract double getPerimetro();
    
    @Override
    public void moverHorizontal(int desp)
    {
        centro.move(desp,0);
    }
    
    @Override
    public void moverVertical(int desp)
{
    centro.move(0, desp);
}
    
    
    @Override
    public int compareTo(Figura otra)
    {
        if(this.getArea()==otra.getArea())
            return 0;
        if(this.getArea()<otra.getArea())
            return -1;
        return 1;
    }
}
