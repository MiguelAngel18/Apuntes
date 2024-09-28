
/**
 * Write a description of class Personaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personaje
{
    // instance variables - replace the example below with your own
    private final char  NORTE='N';
    private final char SUR='S';
    private final char ESTE='E';
    private final char OESTE='O';
    private String nombre;
    private int x;
    private int y;
    private char orientacion;
    /**
     * Constructor for objects of class Personaje
     */
    public Personaje(String queNombre)
    {
        nombre=queNombre;
        x=0;
        y=0;
        orientacion=NORTE;
    }

    /**
     * modifica las coordenadas del personaje que 
avanzará la distancia (en unidades) especificada como parámetro. 
     */
    public void avanzar(int distancia)
    {
        if(distancia>0)
        {
            switch (orientacion)
            {
                case NORTE: y+=distancia;
                            break;
                    
                case SUR: y-=distancia;
                            break;
                case ESTE: x+=distancia;
                            break;
                    
                case OESTE: x-=distancia;
                            break;
                default: break;
            }
           
        }
        else
                System.out.println("La distancia tiene que ser positiva");
    }
    
    /**
     * cambia la orientación del personaje que siempre 
     * gira en sentido horario: N ? E, S ? O, E ? S, O ? N
     */
    public void girar()
    {
        switch (orientacion)
            {
                case NORTE: orientacion=ESTE;
                            break;
                    
                case SUR: orientacion=OESTE;
                            break;
                case ESTE: orientacion=SUR;
                            break;
                    
                case OESTE: orientacion=NORTE;
                            break;
                default: break;
            }
    }
    
    public String toString()
    {
        String salida="******PERSONAJE=" + nombre + "\n ORIENTACION=" + orientacion + "\n POSICION=[" 
        + x + "," + y +"]";
        
        return salida;
    }
}
