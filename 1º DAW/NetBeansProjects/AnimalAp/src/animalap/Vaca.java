/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalap;

/**
 *
 * @author Mariajo
 */
public class Vaca extends Animal{

    public Vaca(String nombre, int numPatas, String duenio) {
        super(nombre, numPatas, duenio);
    }

    @Override
    public void emitirSonido() {
        System.out.println("MUJUUUU");
    }

    @Override
    public void comer() {
        System.out.println("COME HIERBA");
    }

  
     @Override
    public String toString() {
        return    "Vaca{" + super.toString()+ '}';
    }
    
    
}
