/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficherosap;

/**
 *
 * @author Mariajo
 */
public class FicherosAp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ReproductorMP3 miReproductor=new ReproductorMP3(3000);
        
        miReproductor.addFichero(new FicheroJPG(Compresion.MEDIA,"BBBBB", 360));
         miReproductor.addFichero(new FicheroMusica(200, "AAAAA", 80));
        miReproductor.addFichero(new FicheroJPG(Compresion.BAJA,"ZZZZZ", 90));
        miReproductor.addFichero(new FicheroMusica(300, "TTTTTT", 130));
        
        miReproductor.mostrarCanciones();
        miReproductor.ordenar();
        System.out.println("despues de ordenar");
        miReproductor.mostrarTodo();
        
        miReproductor.reordenar();
        System.out.println("despues de Reordenar");
        miReproductor.mostrarTodo();
        
       miReproductor.ordenarPorTitulo();
        System.out.println("Ordenador por Titulo:");
        miReproductor.mostrarTodo();
        
        
        miReproductor.reset();
        System.out.println("despues Borrar");
        miReproductor.mostrarTodo();
        
       
        
        
    }
    
    
}
