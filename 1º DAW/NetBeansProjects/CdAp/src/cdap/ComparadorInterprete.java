/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cdap;

import java.util.Comparator;

/**
 *
 * @author Mariajo
 */
public class ComparadorInterprete implements Comparator<Cancion>{

    @Override
    public int compare(Cancion o1, Cancion o2) {
        return o1.getInterprete().compareTo(o2.getInterprete());
    }

    
    
}
