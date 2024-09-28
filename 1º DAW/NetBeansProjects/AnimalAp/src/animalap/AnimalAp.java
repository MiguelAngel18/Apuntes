/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animalap;

/**
 *
 * @author Mariajo
 */
public class AnimalAp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Granja miGranja=new Granja();
        miGranja.addAnimal(new Perro("sofa", "Nano", 4,"Paco" ));
        miGranja.addAnimal(new Gato("pelota", "Lulu", 4,"Ramón" ));
        miGranja.addAnimal(new Perro("salon", "Tor", 4,"Pepe" ));
        miGranja.addAnimal(new Perro("patio", "Trufo", 4,"Purita" ));
        miGranja.addAnimal(new Vaca( "Lola", 4,"Pepe" ));
        
        miGranja.mostraAnimales();
        System.out.println("Nº de perros:" +miGranja.cuantosPerros());
        System.out.println(miGranja.getAnimal(4).toString());
    }
    
}
