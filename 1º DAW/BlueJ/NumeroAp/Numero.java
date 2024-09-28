
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
    public Numero(int num)
    {
        numero=num;
    }

    /**
     * - si el valor que guarda el objeto es mayor que el nº pasado como parámetro
     * devuelve true, en caso contrario false
     */
     public boolean esMayorQue(int otroNumero)
     {
         /*if(numero>otroNumero)
             return true;
        else
            return false;*/
        
            return numero>otroNumero;
            
            
     }
     
     /**
      *  - si el valor que guarda el objeto es menor que el nº pasado como parámetro 
      *  devuelve true, en caso contrario false
      */
     public boolean esMenorQue(int otroNumero)
     {
         return numero<otroNumero;
     }
     
     /**
      * - si el nº que se pasa como parámetro es igual que el atributo del 
      * objeto devuelve true, en 
      * caso contrario false
      */
     public boolean esIgualQue(int otroNumero) 
     {
         return numero==otroNumero;
     }
     
     /**
      * - si el atributo es mayor
    que el nº que se pasa como parámetro devuelve la cadena “Más
    grande”, si es menor devuelve la cadena “Es menor”, si son iguales
    devuelve “Son iguales”
      */
     public String comprobar(int otroNumero) 
     {
         if(numero>otroNumero)
             return "Mas grande";
        else if(numero<otroNumero)
                return "Es menor";
            else
                return "Son iguales";
     }
     
     public String comprobar2(int otroNumero) 
     {
         if(esMayorQue(otroNumero))
             return "Mas Grande";
         else if(esMenorQue(otroNumero))
                return "Es menor";
              else
                 return "Son iguales";
         
         
     }
}
