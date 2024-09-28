
/**
 * Write a description of class CartaBaraja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CartaBaraja
{
    // instance variables - replace the example below with your own
    private int palo;
    private int valor;
    private final int OROS=1;
    private final int COPAS=2;
    private final int ESPADAS=3;
    private final int BASTOS=4;

    /**
     * Constructor for objects of class CartaBaraja
     */
    public CartaBaraja(int queValor, int quePalo)
    {
        if(queValor>=1 && queValor<=12)
            valor=queValor;
        else
        //Si el valor es incorrecto se inicializa a 1
            valor=1;
        if(quePalo>=1 && quePalo<=4)
            palo=quePalo;
        else
        //Si el palo es incorrecto se inicia a ORO
            palo=OROS;
    }

    /** 
     * Accesor para el  palo
     */
    public String getPalo()
    {
        String elPalo;
        switch(palo)
        {
            case OROS: elPalo="Oro";
                break;
            case COPAS: elPalo="Copas";
                break;
            case ESPADAS: elPalo="Espadas";
                break;
            case BASTOS: elPalo="Bastos";
                break;

            default: elPalo="Incorrecto";
                break;
        }
        return elPalo;
    }

    /**
     * Accesor para el valor
     */
    public String getValor()
    {
        String elValor="";
        if(valor==1)
            elValor="Uno";
        else if(valor==2)
            elValor="Dos";
        else if (valor==3)
            elValor="Tres";
        else if(valor==4)
            elValor="Cuatro";
        else if (valor==5)
            elValor="Cinco";
        else if(valor==6)
            elValor="Seis";
        else if (valor==7)
            elValor="Siete";
        else if(valor==8)
            elValor="Ocho";
        else if (valor==9)
            elValor="Nueve";
        else if(valor==10)
            elValor="Sota";
        else if (valor==11)
            elValor="Caballo";
        else if(valor==12)
            elValor="Rey";
        return elValor;

    }
    
    /**
     * Devuelve la String con el valor y el palo
     */
    public String toString()
    {
        return getValor() + " de " + getPalo();
    }
    
    /**
     * Imprime por pantalla
     */
    public void imprimir()
    {
        System.out.println(toString());
    }
}
