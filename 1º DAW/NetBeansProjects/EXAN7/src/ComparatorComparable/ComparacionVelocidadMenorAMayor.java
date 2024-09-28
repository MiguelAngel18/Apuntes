/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComparatorComparable;

import java.util.Comparator;

/**
 *
 * @author Miguel Ángel
 */
public class ComparacionVelocidadMenorAMayor implements Comparator<Coche>
{   
    @Override
    public int compare(Coche c1, Coche c2) 
    {
        return Integer.valueOf(c1.getVelocidad()).compareTo(c2.getVelocidad());
    }
}
    

