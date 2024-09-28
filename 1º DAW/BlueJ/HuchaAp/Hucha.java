
/**
 * Write a description of class Hucha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hucha
{
    // instance variables - replace the example below with your own
    private double dinero;

    /**
     * Constructor for objects of class Hucha
     */
    public Hucha()
    {
        // initialise instance variables
        dinero = 0;
    }

    /**
     * Accesor pàra el dinero
     */
    public double getDinero()
    {
        return dinero;
    }
    
    /**
     * Mete dinero en la hucha
     */
    
    public void meterDinero(double cantidad)
    {
        if(cantidad>0)
            dinero+=cantidad;
        else
            System.out.println("La cantidad debe de ser positiva");
    }
    
    /**
     * Saca dinero de la hucha
     */
    public void sacarDinero(double cantidad)
    {
        if (cantidad<=dinero && cantidad>0)
            dinero-=cantidad;
        else
            System.out.println("Cantidad incorrecta");
            
            
    }
    
    /**
     * Imprime la cantidad de dinero de la hucha
     */
    public void printDetalles()
    {
        System.out.println("La hucha tiene:" + dinero + " euros");
    }
    
    
}
