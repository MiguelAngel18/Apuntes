
/**
 * Write a description of class Cafetera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cafetera
{
    // instance variables - replace the example below with your own
    private int capacidadMaxima;
    private int cantidadActual;

    /**
     * Constructor for objects of class Cafetera
     */
    public Cafetera()
    {
        capacidadMaxima=1000;
        cantidadActual=0;
    }

    /**
     * Accesor para cantidadMaxima
     */
    public int getCapacidadMaxima()
    {
        return capacidadMaxima;
    }

    /**+
     * Accesor para cantidad actual
     */
    public int getCantidadActual()
    {
        return cantidadActual;
    }

    /**
     * Mutador para capacidadMaxima
     */
    public void setCapacidadMaxima(int maxima)
    {
        if (maxima>=cantidadActual)
            capacidadMaxima=maxima;
    }

    /**
     * Mutador para cantidad actual
     */
    public void setCantidadActual (int actual)
    {
        if(actual<=capacidadMaxima)
            cantidadActual=actual;
    }

    /**
     * – hace que la cantidad actual sea igual a la 
     * capacidad
     */
    public void llenarCafetera() 
    {
        cantidadActual=capacidadMaxima;
    }

    /**
     * – simula la acción de servir una taza con la capacidad indicada como

     * parámetro. Si la cantidad actual de café no alcanza para llenar la taza 
     * se sirve lo que
     * quede
     */
    public void sevirTaza(int capacidadTaza) 
    {
        if(capacidadTaza<=cantidadActual)
            cantidadActual-=capacidadTaza;
        else
        {
            System.out.println("No hay café para llenar la taza, sólo te pongo : "  + cantidadActual  );        
            cantidadActual=0;
        }
    }

    /**
     *  – pone la cantidad actual de café a 0
     */
    public void vaciarCafetera()
    {
        cantidadActual=0;
    }

    /**
     *  – añade a la cafetera la cantidad de café indicada como parámetro
     */
    public void agregarCafe(int cantidad)
    {
        if (cantidad>0)
        {
            if((cantidadActual + cantidad ) <=capacidadMaxima)
                cantidadActual+=cantidad;
            else
                cantidadActual=capacidadMaxima;
        }  
        else
            System.out.println("La cantidad debe de ser positiva");

    }
}
