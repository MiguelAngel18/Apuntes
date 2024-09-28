/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cdsydvdsap;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Mariajo
 */
public class BasesDeDatos {
    private ArrayList<Articulo> articulos; 

    public BasesDeDatos() {
        articulos=new ArrayList<Articulo>();
    }
    
    public void addArticulo(Articulo nuevo)
    {
        if(!articulos.contains(nuevo))
            articulos.add(nuevo);
    }
    
    public void listar()
    {
        for (Articulo a:articulos)
                System.out.println(a.toString());
    }
    
    public int getNumeroCDs()
    {   int contCDs=0;
        for (Articulo a:articulos)
            if(a instanceof CD)
                contCDs++;
        return contCDs;
        
    }
    
    public int getNumeroDVDs()
    {   int contDVDs=0;
        for (Articulo a:articulos)
            if(a instanceof DVD)
                contDVDs++;
        return contDVDs;
        
    }
    
    public double getValorBD()
    {
        double valor=0;
        for (Articulo a:articulos)
            valor+=a.getPrecio();
        return valor;
    }
    
    public void ordenarPorDuracion()
    {
        Collections.sort(articulos);
        
    }
    
    public void ordenarPorTitulo()
    {
        Collections.sort(articulos, new ComparadorTitulo());
    }
}
