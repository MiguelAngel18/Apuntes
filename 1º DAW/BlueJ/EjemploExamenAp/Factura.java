
/**
 * Write a description of class Factura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


/**
 *     • PRIMEROS_100  de valor 0.14 cts/kw – representan el coste de cada kw para los primeros 100 que se consuman
    • SIGUIENTES_150  de valor 0.10 cts/kw – es lo que se paga por cada uno de los kw consumidos dentro de los 150 sgtes
    • RESTO – de valor 0.07  cts/kw – es lo que se paga a lo que exceda de 250 kw en el consumo
    • dos atributos de tipo double, lecturaAnterior y lecturaActual.

 */
public class Factura
{
    // instance variables - replace the example below with your own
    private  final double GASTOS_FIJOS=6.3;
    private final double PRIMEROS_100=0.14;
    private final double SIGUIENTES_150=0.10;
    private final double RESTO=0.07;
    private double lecturaAnterior;
    private double lecturaActual;
    
    /**
     * Constructor for objects of class Factura
     */
    public Factura(double lecturaAnterior, double lecturaActual )
    {
        this.lecturaAnterior=lecturaAnterior;
        if(lecturaActual>=lecturaAnterior)
              this.lecturaActual=lecturaActual;
        
        else
             this.lecturaActual=lecturaAnterior;
        
    }

    /**
     * un accesor getConsumo() que devuelve el nº de Kw consumidos
     */
    public double getConsumo()
    {
        return lecturaActual - lecturaAnterior;
    }
    
    /**
     * el método  que devuelve el importe a pagar por lo que se ha consumido incluyendo 
     * el Iva (16%).
     */
    
    public double getImporteTotal()
    {
        double consumo=getConsumo();
        double importe=GASTOS_FIJOS;
        
        if(consumo>250)
        {
            importe+=(consumo-250)*RESTO + 150*SIGUIENTES_150 + 100*PRIMEROS_100;
            
        }
        else
            if(consumo>100)
                importe+= (consumo-100)*SIGUIENTES_150 + 100*PRIMEROS_100;
            else
                importe+=consumo*PRIMEROS_100;
        
        importe+=importe*0.16;
        return importe;
        
        
    }
}
