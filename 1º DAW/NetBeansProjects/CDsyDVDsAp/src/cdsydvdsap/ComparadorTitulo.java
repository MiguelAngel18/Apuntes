/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cdsydvdsap;

import java.util.Comparator;

/**
 *
 * @author Mariajo
 */
public class ComparadorTitulo implements Comparator<Articulo>{

    @Override
    public int compare(Articulo o1, Articulo o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
    
}
