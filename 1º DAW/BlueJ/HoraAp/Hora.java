
/**
 * Write a description of class Hora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hora
{
    // instance variables - replace the example below with your own
    private int hora;
    private int minutos;
    private int segundos;

    /**
     * Constructor for objects of class Hora
     */
    public Hora()
    {
        hora=0;
        minutos=0;
        segundos=0;
    }

    /**
     * Accesor para la hora
     */
    public int getHora()
    {
        return hora;
    }
    /**
     * Accesor para minutos
     */
    public int getMinutos()
    {
        return minutos;
    }
    
    /**
     * Accesor para los segundos
     */
    public int getSegundos()
    {
        return segundos;
    }
    
    /**
     * Mutador para la hora
     */
    public void setHora(int queHora)
    {
        if(queHora>=0 && queHora<24)
            hora=queHora;
    }
    
    /**
     * Mutador para minutos
     */
    public void setMinutos(int queMinutos)
    {
        if(queMinutos>=0 && queMinutos<60)
            minutos=queMinutos;
    }
    
    /**
     * Mutador para los segundos
     */
    public void setSegundos(int queSegundos)
    {
        if(queSegundos>=0 && queSegundos<60)
            segundos=queSegundos;
    }
    
    /**
     * el método avanzarSegundo() que incrementa un segundo a la hora
     */
    public void  avanzarSegundo()
    {
        segundos++;
        if(segundos==60)
        {
            segundos=0;
            minutos++;
            if(minutos==60)
            {
                minutos=0;
                hora++;
                if(hora==24)
                    hora=0;
            }
        }
    }
    
    /**
     * Devuelve string con la hh:mm:ss
     */
    public String toString()
    {
        String salida="";
    
        if(hora<10)
            salida+="0";
        salida+=hora+":";
        
        if(minutos<10)
            salida+="0";
        salida+=minutos+":";
        if(segundos<10)
            salida+="0";
        salida+=segundos;    
        return salida;
    }
}
