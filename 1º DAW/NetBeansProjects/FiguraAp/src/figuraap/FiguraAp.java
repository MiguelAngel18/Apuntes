/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuraap;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Mariajo
 */
public class FiguraAp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GestorFiguras miGestor=new GestorFiguras();
        
        miGestor.addFigura(new Circulo(new Point(3,4), new Color(134),2));
        miGestor.addFigura(new Cuadrado(4,new Point(3,4), new Color(134)));
        miGestor.addFigura(new Triangulo(5,3,new Point(3,4), new Color(134)));
        miGestor.addFigura(new Circulo(new Point(3,4), new Color(33),2));
        miGestor.addFigura(new Circulo(new Point(3,4), new Color(13),2));
        
        Collections.sort(miGestor.getLista());
        miGestor.listarFiguras();
        
        System.out.println("****************");
        Collections.sort(miGestor.getLista(), new ComparadorPerimetro());
        miGestor.listarFiguras();
        
        
        Figura mayor=miGestor.mayorArea();
        System.out.println("La figura de mas area es" + mayor.toString());
        
       miGestor.borrarDeColor( new Color(134));
        
         miGestor.listarFiguras();
         
         
         
        
    }
    
}
