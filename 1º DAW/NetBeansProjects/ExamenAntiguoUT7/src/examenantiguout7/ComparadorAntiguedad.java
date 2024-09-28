/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenantiguout7;

import java.util.Comparator;

/**
 *
 * @author Miguel Ángel
 */
public class ComparadorAntiguedad implements Comparator<Empleado>
{
    @Override
    public int compare(Empleado o1, Empleado o2) 
    {
        if(o1.getAnio()==o2.getAnio())
            return 0;
        if(o1.getAnio()<o2.getAnio())
            return -1;
        return 1;
    }
}
