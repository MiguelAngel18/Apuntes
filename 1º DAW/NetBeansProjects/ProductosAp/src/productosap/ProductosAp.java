/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productosap;

/**
 *
 * @author Mariajo
 */
public class ProductosAp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tienda miTienda=new Tienda("tienda Paco", 550);
        miTienda.addproducto("1", 0.5, 5, 1);
        miTienda.addproducto("2", 3, 5, 2);
        miTienda.addproducto("3", 100, 2, 2);
        miTienda.listar();
        
        miTienda.venderProducto("1", 2);
        miTienda.venderProducto("2", 4);
        
        miTienda.listar();
        
        miTienda.venderProducto("4", 4);
        miTienda.venderProducto("2", 4);
        miTienda.listar();
        
        
    }
    
}
