/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concesionarioap;

/**
 *
 * @author Mariajo
 */
public class ConcesionarioAp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Concesionario miCon=new Concesionario("Overcame");
        
        miCon.añadir(new CocheDeportivo("Pedro", "deportivo", "rojo"));
        miCon.añadir(new CocheDeportivo("Luis", "deportivo", "rojo"));
        miCon.añadir(new CocheDeportivo("Pedro", "deportivo", "azul"));
        miCon.añadir(new CocheDeportivo("Pedro", "deportivo", "rojo"));
        miCon.añadir(new CocheEconomico("Paco", "economico", "rojo"));
        miCon.añadir(new Taxi(7,"Carlos", "taxi", "blanco"));
        
        miCon.listarCoches();
        System.out.println("Avanzo");
        miCon.avanzarTodos();
        
        miCon.listarCoches();
        
        System.out.println("Borro Pedro");
        miCon.borrarDeConductor("Pedro");
        miCon.listarCoches();
        
        System.out.println("Borro Taxis");
        miCon.borrarTaxis();
        miCon.listarCoches();

        
        
    }
    
}
