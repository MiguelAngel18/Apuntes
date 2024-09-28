/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut7a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Miguel Ángel
 */
public class Almacen
{
    private List<Zapato> zapatos;
    private String direccion,telefono;

    public Almacen(String direccion, String telefono)
    {
        zapatos = new ArrayList<Zapato>();
        
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public List<Zapato> getZapatos() {
        return zapatos;
    }

    public void setZapatos(List<Zapato> zapatos) {
        this.zapatos = zapatos;
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
    
    
    
    public void addZapato(Zapato z)
    {
        if(!zapatos.contains(z))
        {
            zapatos.add(z);
        }
    }
    
    public void cualesConTejido(String tejido)
    {
        Mocasin m;
        
        System.out.println("Mocasines cuyo tejido es" + tejido + ":\n");
        for(Zapato z: zapatos)
        {
            if(z instanceof Mocasin)
            {
                m= (Mocasin) z;
                
                if(m.getTejido().equalsIgnoreCase(tejido))
                {                    
                    System.out.println("Marca: " + m.getMarca() + "Talla: " + m.getTalla() + "Precio: " + m.getPrecio());
                }
            }
        }
        
    }

    
    public void cambiarColor(String viejo,String nuevo)
    {
        Deportiva d;
        
        for(Zapato z: zapatos)
        {
            if(z instanceof Deportiva)
            {
                d= (Deportiva) z;
                
                if(d.getDescripcion().equalsIgnoreCase("RUNNER") && d.getColor().equalsIgnoreCase(viejo))
                {
                    d.setColor(nuevo);
                }
            }
        }
    }

    public void boorarPorCodigo(String codigo) // EL ITERATOOOOOOOOOORRRRRRRR
    {
        Iterator<Zapato> it = zapatos.iterator();
        Zapato z;
        
        while(it.hasNext())
        {
            z= it.next();
            
            if(z.getCodigo().equalsIgnoreCase(codigo))
            {
                System.out.println(z.toString());
                it.remove();
            }
        }
    }

    public void ordenarPorTalla()
    {
        Collections.sort(zapatos);
        
        for(Zapato z : zapatos)
        {
            System.out.println(z.toString());
        }
    }
    
    public String vender(String codigo)
    {
        for(Zapato z : zapatos)
        {
            if(z instanceof Deportiva && z.getCodigo().equals(codigo))
            {
                z.setCodigo(codigo + "VD");
            }
            
            if(z instanceof Mocasin && z.getCodigo().equals(codigo))
            {
                z.setCodigo(codigo + "VM");
            }
            
            if(z instanceof Sandalia && z.getCodigo().equals(codigo))
            {
                z.setCodigo(codigo + "VS");
            }
        }
        return codigo;
    }
       
    public ArrayList vendidos()
    {
        ArrayList<Zapato> vendidos = new ArrayList<>();
        
        for(Zapato z: zapatos)
        {            
            if((z.getCodigo().charAt(z.getCodigo().length()-2)=='V'));
            {
                vendidos.add(z);
            }
        }
            
        Collections.sort(vendidos, new ComparadorCodigo());
        
        return vendidos;
    }
    
    public void ordenarPorPrecio()
    {
        Collections.sort(zapatos,new ComparadorPrecio());
    }
}