/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalap;

/**
 *
 * @author Mariajo
 */
public class Gato extends Animal{
    
    private String juguete;

    public Gato(String juguete, String nombre, int numPatas, String duenio) {
        super(nombre, numPatas, duenio);
        this.juguete = juguete;
    }

    @Override
    public void emitirSonido() {
        System.out.println("MIAU");
    }
       

    @Override
    public void comer() {
        System.out.println("COME PESCADO");
    }
    
     @Override
    public String toString() {
        return    "Gato{" + super.toString()+ "Juguete=" + juguete + '}';
    }
    
}
