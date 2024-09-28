
/**
 * Write a description of class Ordenador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ordenador
{
    // instance variables - replace the example below with your own
    private int maxMemoria;
    private int memoriaInstalada;

    /**
     * Constructor for objects of class Ordenador
     */
    public Ordenador(int queMaxMemoria)
    {
        if(queMaxMemoria>0)
            maxMemoria=queMaxMemoria;
        else
            maxMemoria=1024;
          
        
         memoriaInstalada=0;
       
    }

    /**
     * devuelve la memoria máxima permitida
     */
     public int getMaxMemoria()
     {
         return maxMemoria;
     }
     
     /**
      * que devuelve la memoria que queda disponible 
      * (por instalar)
      */
     public int getMemoriaDisponible()
     {
         return maxMemoria-memoriaInstalada;
     }
     /**
      * método sin parámetros que “libera” toda la memoria instalada
      */
     public void vaciarMemoria()
     {
         memoriaInstalada=0;
     }
     
     /**
      * que instala 256 Mb de memoria
      */
     public boolean instalar256Mb() 
     {
         if(getMemoriaDisponible()>=256)
         {
             memoriaInstalada+=256;
             return true;
         }
         else
             return false;
     }
     
     /**
      *  que instala la cantidad de memoria que se le 
      *  pasa al mutador como parámetro.
      */
     public boolean instalarMemoria(int cantidadMemoria)
     {
         if (cantidadMemoria>0 && getMemoriaDisponible()>=cantidadMemoria)
         {
             memoriaInstalada+=cantidadMemoria;
             return true;
        }
        else
            return false;
     }
     
     /**
      * , sin parámetros y sin valor de retorno que visualiza:
      * “Este ordenador puede tener hasta XXXX Mb de memoria.
      * Todavía es posible instalar XXXX Mb”
      * Llama al método getMemoriaDisponible() dentro de este método
      */
     public void printInformacion()
     {
        System.out.println("Este ordenador puede tener hasta" + maxMemoria + "Mb de memoria");
        System.out.println("Todavía es posible instalar" + getMemoriaDisponible() + "Mb");
     }
}
