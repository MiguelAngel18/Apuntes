
/**
 * Write a description of class Conversor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Conversor
{
    // instance variables - replace the example below with your own
    private double grados ;

    /**
     * Constructor for objects of class Conversor
     */
    public Conversor()
    {
        // initialise instance variables
        grados = 0;
    }

    /**
     * Mutador para los grados
     */
    public void setGrados (double queGrados)
    {
        grados=queGrados;
    }
    /**
     * Accesor para grados
     */
    public double getGrados()
    {
        return grados;
    }
    public double aFarenheit()
    {
        return (9.0/5)*grados + 32;
    }
    public double aCentigrados()
    {
        return (5.0/9)*(grados-32);
    }
}
