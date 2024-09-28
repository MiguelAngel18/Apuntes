/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalap;

/**
 *
 * @author Mariajo
 */
public class Perro extends Animal {
    private String lugarFavorito;

    public Perro(String lugarFavorito, String nombre, int numPatas, String duenio) {
        super(nombre, numPatas, duenio);
        this.lugarFavorito = lugarFavorito;
    }

    @Override
    public void emitirSonido() {
        System.out.println("GUA GUA");
    }

    @Override
    public void comer() {
        System.out.println("Come huesos");

    }

    @Override
    public String toString() {
        return    "Perro{" + super.toString()+ "lugarFavorito=" + lugarFavorito + '}';
    }
    
    
    
}
