/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaficherosap;

import java.util.ArrayList;

/**
 *
 * @author Mariajo
 */
public class SistemaFicherosAp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       ArrayList<ElementoSistemaFicheros> sistema =new ArrayList<ElementoSistemaFicheros>();
       Directorio d=new Directorio("Ples");
       d.add(new Fichero("ejer1.doc"));
       d.add(new Fichero("ejer1.pdf"));
       sistema.add(d);
       
       Directorio d1=new Directorio("Web");
       d1.add(new Fichero("index.html"));
       d1.add(new Fichero("pagina1.html"));
       d1.add(new Fichero("pagina2.html"));
       sistema.add(d1);
       
       Directorio d2=new Directorio("ejercicios");
       d2.add(new Fichero("ejericios1.java"));
       sistema.add(d2);
       
       
       sistema.add(new Fichero("prueba.txt"));
       
       for(ElementoSistemaFicheros f:sistema)
       {
           f.listar();
           System.out.println("*********");
       }

       for(ElementoSistemaFicheros f:sistema)
       {
           if (f instanceof Directorio)
               ((Directorio) f).borrar(new Fichero("index.html"));
       }
       

       System.out.println("despues de borrar");
       
       for(ElementoSistemaFicheros f:sistema)
       {
           f.listar();
            System.out.println("*********");
       }

        
    }
    
}
