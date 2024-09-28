/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoexamenpro;

import java.util.Comparator;

/**
 *
 * @author Miguel Ángel
 */
public class ComparadorNombre implements Comparator<Persona>
{
    @Override
    public int compare(Persona p1, Persona p2)
    {
        return p1.getNombre().compareTo(p2.getNombre());
    }
}