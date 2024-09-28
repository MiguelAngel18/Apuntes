
/**
 * Write a description of class Calentador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calentador
{
    // instance variables - replace the example below with your own
    private int temperatura;
    private int minimo, maximo;
    private int incremento;

    /**
     * Constructor for objects of class Calentador
     */
    public Calentador(int queMinimo, int queMaximo)
    {
        // initialise instance variables
       temperatura=15;
       if(queMinimo<=queMaximo)
       {
           minimo=queMinimo;
           maximo=queMaximo;
       }
       incremento=5;
    }

    /**
     * Incrementa la temèrantura en incremento
     */
    public void canlentar()
    {
        if(temperatura+incremento<=maximo)
            temperatura+=incremento;
        else
            temperatura=maximo;
    }
    
    /**
     * Decrementa la temp en incremento
     */
    public void enfriar()
    {
        if(temperatura-incremento >=minimo)
            temperatura-=incremento;
        else
            temperatura=minimo;
    }
    
    /**
     * Accesor para la temèratura
     */
    public int getTemperatura()
    {
        return temperatura;
    }
    
    /**
     * Mutador para el incremento
     */
    public void setIncremento(int queIncremento)
    {
        if(queIncremento>0)
            incremento=queIncremento;
    }
}
