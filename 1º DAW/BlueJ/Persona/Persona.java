
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int edad;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nuevoNombre, int nuevaEdad)
    {
        // initialise instance variables
        nombre=nuevoNombre;
        edad=nuevaEdad;
       
    }
    
    /**
     * Accesor del atributo nombre
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * Accesor para la edad
     */
    public int getEdad()
    {
        return edad;
    }

    /**
     * Mutador para el  nombre
     */
    public void setNombre(String nuevoNombre)
    {
        nombre=nuevoNombre;
    }
    
    /**
     * Mutador para la edad
     */
    public void setEdad(int nuevaEdad)
    {
        edad=nuevaEdad;
    }
    
    /**
     * Devuelve la edad de ala persona dentro de cinco años
     */
    public int edadEn5Anios()
    {
        return edad +5;
    }
    
    /**
     * Saluda por pantalla
     */
    public void saludar()
    {
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años");
    }
    
}
