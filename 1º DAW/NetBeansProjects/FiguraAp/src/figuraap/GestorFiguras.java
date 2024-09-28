/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuraap;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mariajo
 */
public class GestorFiguras {
    private ArrayList<Figura> lista;

    public GestorFiguras() {
        lista=new ArrayList<Figura>();
    }

    public ArrayList<Figura> getLista() {
        return lista;
    }
    
    
    public void addFigura(Figura f)
    {
        if(f!=null)
            lista.add(f);
    }
    
    public void listarFiguras() 
    {
        for(Figura f:lista)
            System.out.println(f.toString() + "Area:" + f.getArea() + " Perimetro:" + f.getPerimetro());
    }
    
    
    public Figura mayorArea()
    {
        Figura mayor=lista.get(0);
         for(Figura f:lista)
         {
            if(mayor.getArea()<f.getArea())
                mayor=f;
         }
         return mayor;
    }
    
    
    public void borrarDeColor(Color color)
    {
        Iterator<Figura> it=lista.iterator();
        Figura f;
        while(it.hasNext())
        {
            f=it.next();
            if(f.getColor().equals(color))
                it.remove();
        }
    }
    
    public void testMovibles()
    {
        ArrayList<Movible> lista=new ArrayList<Movible> ();
        
       lista.add(new Circulo(new Point(3,4), new Color(134),2));
        lista.add(new Cuadrado(4,new Point(3,4), new Color(134)));
       lista.add(new Triangulo(5,3,new Point(3,4), new Color(134)));
        lista.add(new Circulo(new Point(3,4), new Color(33),2));
        lista.add(new Circulo(new Point(3,4), new Color(13),2));
        
        
           
        
        
    }
}
