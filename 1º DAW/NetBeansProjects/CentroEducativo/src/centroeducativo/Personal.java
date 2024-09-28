/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroeducativo;

/**
 *
 * @author Mariajo
 */
public class Personal extends Empleado{
    private String seccion;

    public Personal(String seccion, int anioIncorporacion, int numDespacho, String nombre, String apellidos, String DNI) {
        super(anioIncorporacion, numDespacho, nombre, apellidos, DNI);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void trasladoSeccion(String seccion) {
        this.seccion = seccion;
    }
    
    public String toString()
    {
        StringBuilder salida=new StringBuilder();
        salida.append(super.toString());
        
        salida.append("\nAsignado a la sección:").append(seccion);
        return salida.toString();
    }
    
     public  double getSueldo()
     {
         int antiguedad=2024-super.getAnioIncorporacion();
         return 800 + 50*(antiguedad/6);
     }
    
}
