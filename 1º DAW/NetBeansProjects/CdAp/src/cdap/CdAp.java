/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cdap;

/**
 *
 * @author Mariajo
 */
public class CdAp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CD miCD=new CD();
        miCD.addCancion(new Cancion("cancion1", "interprete1", 3.5f));
        miCD.addCancion(new Cancion("cancion2", "interprete1", 3.9f));
        miCD.addCancion(new Cancion("cancion1", "interprete2", 0.5f));
        miCD.addCancion(new Cancion("cancion1", "Ainterprete1", 2.6f));
        miCD.addCancion(new Cancion("Acancion", "Ainterprete1", 1.5f));
        
        
        miCD.listarPorDuracion();
        
       System.out.println("Por duracion:" + miCD.toString());
       
        miCD.listarPorInterprete();
        
       System.out.println("Por Interprete:" + miCD.toString());
       
        miCD.listarPorTitulo();
        
       System.out.println("Por titulo:" + miCD.toString());
       
       miCD.borrarCancion("LALALAL");
       System.out.println(miCD.toString());
       
       miCD.borrarCancion("cancion2");
       System.out.println("Despues de borrar cancion2" + miCD.toString());

       
        
        
    }
    
}
