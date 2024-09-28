/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut7a;

import java.util.Comparator;

/**
 *
 * @author Miguel Ángel
 */
public class ComparadorPrecio implements Comparator<Zapato>
{
    @Override
    public int compare(Zapato z1, Zapato z2)
    {
        if(z1.getPrecio() == z2.getPrecio())
            return 0;
        if(z1.getPrecio() == z2.getPrecio())
            return -1;
        return 1;
    }
}
