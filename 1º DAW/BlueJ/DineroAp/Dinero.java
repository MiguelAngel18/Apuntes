
/**
 * Write a description of class Dinero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dinero
{
    // instance variables - replace the example below with your own
    private int euros;
    private final int BILLETE10=10;
    private final int BILLETE5=5;
    private final int MONEDA2=2;
    private final int MONEDA1=1;

    /**
     * Constructor for objects of class Dinero
     */
    public Dinero(int queEuros)
    {
        // initialise instance variables
        if(queEuros>0 && queEuros<100)
            euros=queEuros;
        else
            System.out.println("Solo admite cantidades positivas y menor a 100");
    }
    
    /**
     * accesor
     */
    public int getEuros()
    {
        return euros;
    }

    /**
     * Mutador
     */
    public void setEuros(int queEuros)
    {
        if(queEuros>0 && queEuros<100)
            euros=queEuros;
        else
            System.out.println("Solo admite cantidades positivas y menor a 100");
    }
    
    public void printDescomposicionMonedas()
    {
        int billetes10=euros/BILLETE10;
        int resto10=euros%BILLETE10;
        int billetes5=resto10/BILLETE5;
        int resto5=resto10%BILLETE5;
        int monedas2=resto5/MONEDA2;
        int resto2=resto5%MONEDA2;
        
        System.out.println("Billetes de 10:" + billetes10);
        System.out.println("Billetes de 5:" + billetes5);
        System.out.println("Monedas de 2:" + monedas2);
        System.out.println("Monedas de 1:" + resto2);
    
    }
    
    public void printDescomposicionMonedasV2()
    {
        int sobra;
        System.out.println("Billetes de 10:" + euros/BILLETE10);
        sobra=euros%BILLETE10;
        System.out.println("Billetes de 5:" + sobra/BILLETE5);
        sobra=sobra%BILLETE5;
        System.out.println("Monedas de 2:" + sobra/MONEDA2);
        sobra=sobra%MONEDA2;
        System.out.println("Monedas de 1:" + sobra);
        
    }
    
    
}
