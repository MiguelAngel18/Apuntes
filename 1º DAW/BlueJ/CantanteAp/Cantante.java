
/**
 * Write a description of class Cantante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cantante
{
   
    private boolean feliz;
    /**
     * Constructor for objects of class Cantante
     */
    public Cantante()
    {
       feliz=true;
    }
    
    /**
     * cuando se le envía el mensaje cantar() alobjeto se examina su estado de ánimo. Si está feliz se emite el
    mensaje “Cantando bajo la lluvia”, si está triste se escribe “No tiene
    ánimo para cantar”
     */
    public void cantar() 
    {
      if (feliz)  
          System.out.println("Cantando bajo la lluvia");
      else
          System.out.println("No tengo animos para cantar");
    
    }
/**
 * Version 1 dice si está triste o no
 */
    public boolean estaTriste()
    {
        if(!feliz)
            return true;
        else
            return false;
    }
    
    /**
 * Version 2 dice si está triste o no
 */
    public boolean estaTristeV2()
    {
        return !feliz;
    }
    
    /**
     * Cambia esdtado de animo
     */
    public void cambiarEstadoAnimo() 
    {
        if(feliz)
            feliz=false;
        else
            feliz=true;
    }
    
    /**
     * 
     */
     public void cambiarEstadoAnimoV2() 
    {
        feliz=!feliz;
    }
}
