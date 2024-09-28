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
public class ComparadorCodigo implements Comparator<Zapato>
{
    @Override
    public int compare(Zapato z1, Zapato z2)
    {
        return z1.getCodigo().compareTo(z2.getCodigo());
    }
}