/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalap;

/**
 *
 * @author Mariajo
 */
public abstract class Animal {
       private String nombre;
       private int numPatas;
       private String duenio;

    public Animal(String nombre, int numPatas, String duenio) {
        this.nombre = nombre;
        this.numPatas = numPatas;
        this.duenio = duenio;
    }
    
    public abstract void emitirSonido();
    public abstract void comer();

    @Override
    public String toString() {
        return "nombre=" + nombre + ", numPatas=" + numPatas + ", duenio=" + duenio + '}';
    }
    
    
}
