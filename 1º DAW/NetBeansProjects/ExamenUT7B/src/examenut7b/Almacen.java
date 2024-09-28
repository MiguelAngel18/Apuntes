/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut7b;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Miguel Ángel
 */
public class Almacen
{
    private String direccion,telefono;
    private ArrayList<Producto> productos;

    public Almacen(String direccion, String telefono)
    {
        this.direccion = direccion;
        this.telefono = telefono;
        
        productos = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public void addPructo(Producto producto)
    {
        if(!productos.contains(producto) && producto!=null)
        {
            productos.add(producto);
        }
    }
    
    public void cualesDeOrigenAnimal()
    {
        for(Producto p : productos)
        {
            if(p instanceof Congelado)
            {
                Congelado c;
                c = (Congelado) p;
                
                if(c.getOrigen()==Origen.ANIMAL)
                {
                    System.out.println(c.toString());
                }
            }
        }
    }
    
    public void cambiarOtganismo(String viejo,String nuevo)
    {
        for(Producto p : productos)
        {
            if(p instanceof Refrigerado)
            {
                Refrigerado r;
                r = (Refrigerado) p;
                
                if(r.getOrganismo().equals(viejo) && r.getTemperaturaDeMantenimiento()>8)
                {
                    r.setOrganismo(nuevo);
                }
            }
        }
    }
    
    public void borrarPorCodigo(String codigo)
    {
        Iterator<Producto> it = productos.iterator();
        
        while(it.hasNext())
        {
            if(it instanceof Producto)
            {
                Producto p;
                p = it.next();
                
                if(p.getCodigo().equals(codigo) && productos.contains(p))
                {
                    productos.remove(p);
                }
            }
        }
    }
    
    
}