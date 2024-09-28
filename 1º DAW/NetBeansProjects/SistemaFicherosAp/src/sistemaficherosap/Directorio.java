/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaficherosap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Mariajo
 */
public class Directorio extends ElementoSistemaFicheros{
 
    private List<ElementoSistemaFicheros> ficheros;

    public Directorio(String nombre) {
        super(nombre);
        ficheros=new ArrayList<ElementoSistemaFicheros>();
    }
    
    
    public void add(ElementoSistemaFicheros f)
    {
        if(f!=null)
            ficheros.add(f);
    }
    
    public void borrar(ElementoSistemaFicheros f)
    {
        ElementoSistemaFicheros fich;
        if(f!=null)
        {
            Iterator<ElementoSistemaFicheros> it=ficheros.iterator();
        
            while(it.hasNext())
            {
                
                fich=it.next();
                if(fich.compareTo(f)==0)
                    it.remove();
            }
        }
        
            
    }
    
    public void listar()
    {
        System.out.println("\\" + this.formatearSalida());
        
        for(ElementoSistemaFicheros fich: ficheros)
            fich.listar();
                
        
    }
    
}

