/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teatroap;

/**
 *
 * @author Mariajo
 */
public class TeatroAp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestorTeatro miGestor=new GestorTeatro(new Teatro());
        
        miGestor.venderEntradas();
        
    }
    
}
