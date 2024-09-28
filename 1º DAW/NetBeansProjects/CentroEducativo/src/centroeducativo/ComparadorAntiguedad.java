/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroeducativo;

import java.util.Comparator;

/**
 *
 * @author Mariajo
 */
public class ComparadorAntiguedad implements Comparator<Empleado>{

    @Override
    public int compare(Empleado o1, Empleado o2) {
        if(o1.getAnioIncorporacion()==o2.getAnioIncorporacion())
            return 0;
        if(o1.getAnioIncorporacion()<o2.getAnioIncorporacion())
            return -1;
        return 1;
        
    }
    
}
