
/**
 * Write a description of class FacturaLuz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FacturaLuz
{
    // instance variables - replace the example below with your own
    private int consumo;
    private final double VALOR_KW=8.6;
    private final double IVA=0.16;

    /**
     * Constructor for objects of class FacturaLuz
     */
    public FacturaLuz(int nuevoConsumo)
    {
        // initialise instance variables
        consumo=nuevoConsumo;
    }

    /** 
     * Accesor para el consumo
     * 
     */
    public int getConsumo()
    {
        return consumo;
        
    }
    
    /**
     * Calcula el imprte total de la factura 
     */
    
    public double getImporteTotal()
    {
        return consumo*VALOR_KW + consumo*VALOR_KW*IVA ;
    }
    
}
