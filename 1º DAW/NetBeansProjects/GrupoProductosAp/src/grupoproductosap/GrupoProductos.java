/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupoproductosap;

import java.util.ArrayList;

/**
 *
 * @author Mariajo
 */
public class GrupoProductos implements Producto {
    private ArrayList<Producto> grupo;

    public GrupoProductos() {
        grupo=new ArrayList<Producto>();
    }

    public void add(Producto p)
    {
        if (p!=null)
            grupo.add(p);
    }
    @Override
    public double getPrecio()
    {
        double total=0;
        for(Producto p: grupo )
            total+=p.getPrecio();
        return total;
    }
    
    public String toString()
    {   StringBuilder sb=new StringBuilder();
        sb.append("Grupo:");
         for(Producto p: grupo )
             sb.append (p.toString());
         sb.append("Precio Total:" );
         sb.append(getPrecio());
         return sb.toString();
    }
            
    
    
}
