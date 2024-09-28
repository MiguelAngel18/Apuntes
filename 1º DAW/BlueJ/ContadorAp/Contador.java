
/**
 * Write a description of class Contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contador
{
    // instance variables - replace the example below with your own
    private int valor;

    /**
     * Constructor for objects of class Contador
     */
    public Contador()
    {
        // initialise instance variables
        valor = 0;
    }

    /**
     * Decrementa el valor del contador
     */
    public void decrementar()
    {
        valor--;
    }
    
    /**
     * Incrementa el contador
     */
    public void incrementar()
    {
        valor++;
    }
    
    /**
     * Devuelve el valor del contador
     */
    public int getContador()
    {
        return valor;
    }
    
    /**
     * Imprimne el valor del contador
     */
    public void printContador()
    {
        System.out.println("El valor del contador es:" + valor);
    }
    /**
     * Pone el contador a cero
     */
    public void reset()
    {
        valor=0;
    }
}
