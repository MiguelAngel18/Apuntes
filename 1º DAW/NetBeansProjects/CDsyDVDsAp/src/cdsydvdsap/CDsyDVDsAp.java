/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cdsydvdsap;

/**
 *
 * @author Mariajo
 */
public class CDsyDVDsAp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BasesDeDatos miBD=new BasesDeDatos();
        miBD.addArticulo(new CD("Pablo Alborán", 5,"BTitulo 1",65));
        miBD.addArticulo(new DVD("Directo X", "ATitulo DVD 1",120));
      //  miBD.addArticulo(new Articulo("Casette1",35));
         miBD.addArticulo(new CD("Pablo Alborán", 5,"TTitulo aaaa",65));
         miBD.addArticulo(new DVD("Directo X", "CTitulo DVD 2",120));
         miBD.addArticulo(new CD("Pablo Alborán", 5,"WTitulo 1",65));
          miBD.addArticulo(new DVD("Directo X", "GTitulo DVD 1",120));
         
         miBD.listar();
        
         System.out.println("Hay " + miBD.getNumeroCDs() + " CDs");
         
         System.out.println("Hay " + miBD.getNumeroDVDs() + " DVDs");
         
         System.out.println("Despues de ordenar:");
         miBD.ordenarPorDuracion();
         miBD.listar();
         
         System.out.println("Despues de ordenar por titulo:");
         miBD.ordenarPorTitulo();
         miBD.listar();
         
    }
    
}
