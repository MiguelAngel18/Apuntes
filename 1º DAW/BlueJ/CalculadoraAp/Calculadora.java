
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    // instance variables - replace the example below with your own
    private int cantidad;
    private int suma;
    private int maximo;
    private int minimo;

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
       cantidad=0;
       suma=0;
       maximo=0;
       minimo=0;
    }

    /**
     * Accesor para la cantidad
     */
    public int getCantidad()
    {
        return cantidad;
    }
    
    /**
     * Accesor para el maximo
     */
    public int getMaximo()
    {
        return maximo;
    }
    /**
     * Accesor para el minimo
     */
    public int getMinimo()
    {
        return minimo;
    }
    
    /**
     *  – añade un nuevo número a un objeto Calculadora. El
efecto será que el estado de la calculadora cambia puesto que habrá que contar el número,
añadirlo a la suma y actualizar el valor del máximo y del mínimo
     */
    public void introducirNumero(int numero)
    {
        cantidad++;
        suma+=numero;
        if(cantidad==1)
        {
            maximo=numero;
            minimo=numero;
        }
        else 
        {
            if(maximo<numero)
                maximo=numero;
                
            if(minimo>numero)
                minimo=numero;
        }
        
    }
    /**
     *  – devuelve la media de todos los valores introducidos a la calculadora
     */
    public double getMedia()
    {
        return ((double)suma)/cantidad;
    }
    
    
}
