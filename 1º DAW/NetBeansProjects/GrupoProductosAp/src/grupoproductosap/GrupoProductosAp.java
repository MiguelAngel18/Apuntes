/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupoproductosap;

/**
 *
 * @author Mariajo
 */
public class GrupoProductosAp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Producto horno = new Articulo("Horno microonda", 90.0);
        Producto tostador = new Articulo("Tostador", 20.0);
        Producto paqueteTostador = new Paquete(4, tostador);
        GrupoProductos kitCocina = new GrupoProductos();
        kitCocina.add(horno);
        kitCocina.add(tostador);
        GrupoProductos kitRestaurante = new GrupoProductos();
        kitRestaurante.add(kitCocina);
        kitRestaurante.add(paqueteTostador);
        Producto kitCasa = new Paquete(5, kitCocina);
        
        System.out.println(kitCocina.toString());
        System.out.println(kitCasa.toString());
        
    }
    
}
