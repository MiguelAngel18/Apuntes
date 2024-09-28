/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuraap;

import java.util.Comparator;

/**
 *
 * @author Mariajo
 */
public class ComparadorPerimetro implements Comparator<Figura>{

    @Override
    public int compare(Figura o1, Figura o2) {
        if(o1.getPerimetro()==o2.getPerimetro())
                    return 1;
        if(o1.getPerimetro()<o2.getPerimetro())
            return -1;
        return 1;
    }
    
}
