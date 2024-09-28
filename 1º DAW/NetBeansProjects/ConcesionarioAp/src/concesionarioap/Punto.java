/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionarioap;

/**
 *
 * @author Mariajo
 */
public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void desplaza(int distX, int distY)
    {
        x+=distX;
        y+=distY;
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
