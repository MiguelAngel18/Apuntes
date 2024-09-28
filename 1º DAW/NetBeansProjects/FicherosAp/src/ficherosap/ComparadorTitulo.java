/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficherosap;

import java.util.Comparator;

/**
 *
 * @author Mariajo
 */
public class ComparadorTitulo implements Comparator<Fichero>{

    @Override
    public int compare(Fichero o1, Fichero o2) {
        
        return o1.getTitulo().toUpperCase().compareTo(o2.getTitulo().toUpperCase());
    }
    
    
}
