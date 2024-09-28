
/**
 * Write a description of class Numero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Numero
{
    // instance variables - replace the example below with your own
    private int numero;

    /**
     * Constructor for objects of class Numero
     */
    public Numero()
    {
        // initialise instance variables
        numero=999;
    }

    /** 
     * Accesor para el numero
     */
    public int getNumero()
    {
        return numero;
    }
    
    /**
     * Mutador para el numero
     */
    public void setNumero(int queNumero)
    {
        if(queNumero>=100 && queNumero<=999)
            numero=queNumero;
    }
    
    /**
     * que devuelve true si el nº contenido en el objeto es par
     */
    public boolean esPar()
    {
        return numero%2==0;
    }
    
    /**
     * getUltimaCifra(), que devuelve la última cifra del número
     */
    public int getUltimaCifra() 
    {
        return numero%10;
    }
    
    /**
     * Define el método obtenerSumaCifras() que devuelve la suma de las tres cifras 
que forman el nº
     */
    public int obtenerSumaCifras()
    {
        int suma=0;
        int num=numero;
        suma+=num%10;
        num=num/10;
        suma+=num%10;
        num=num/10;
        suma+=num%10;
        return suma;
        
        
    }
}
