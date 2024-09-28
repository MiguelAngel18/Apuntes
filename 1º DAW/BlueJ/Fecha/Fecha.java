
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{
    // instance variables - replace the example below with your own
    private int dia;
    private int mes;
    private int anio;

    /**
     * Constructor for objects of class Fecha
     */
    public Fecha(int dia, int mes, int anio)
    {
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        if(!esCorrecta())
        {
            this.dia=1;
            this.mes=1;
            this.anio=2000;
                
        }
    }
    
    /**
     * Mutador para el año
     */
    public void setAnio(int anio)
    {
        this.anio=anio;
    }
    
    /**
     * un método  que devuelve true si el año es bisiesto, false en otro caso. Un
    año es bisiesto si es múltiplo de 4 pero no de 100 aunque si de 400. (No utilices en
    este método la sentencia if)
     */
    public boolean esBisiesto()
    {
        return (anio%4==0 && anio%100!=0) || (anio%400==0);
    }
    
    /**
     * el método diasMes() que devuelve la cantidad de días que tiene el mes (influirá si
año es bisiesto en el caso de febrero). Utiliza la sentencia switch.
     */
    public int diasMes()
    {
        int dias=0;
        switch(mes)
        {
            case 1,3,5,7,8,10,12: dias=31;
                                  break;
            case 4,6,9,11: dias=30;
                            break;
            case 2: if(esBisiesto())
                        dias=29;
                    else
                        dias=28;
                    break;
            default: break;
        }
        return dias;
    }
    
    /**
     * un método printCorta() que escribe la fecha en formato corto: “3 – 11 – 2005”
     */
    public void printCorta()
    {
        System.out.println(dia +" - " + mes + " - " + anio);
    }
    
/**
 * un método printLarga() que escribe la fecha en formato largo: “3 de Noviembre de
2005”. Utiliza la sentencia switch.
 */
    public void printLarga()
    {
        String nombreMes="";
        switch(mes)
        {
            case 1: nombreMes="Enero";
                    break;
            case 2: nombreMes="Febrero";
                    break;
            case 3: nombreMes="Marzo";
                    break;
            case 4: nombreMes="Abril";
                    break;
            case 5: nombreMes="Mayo";
                    break;
            case 6: nombreMes="Junio";
                    break;
            case 7: nombreMes="Julio";
                    break;
            case 8: nombreMes="Agosto";
                    break;
            case 9: nombreMes="Septiembre";
                    break;
            case 10: nombreMes="Octubre";
                    break;
            case 11: nombreMes="Noviembre";
                    break;
            case 12: nombreMes="Diciembre";
                    break;
        }
        System.out.println(dia + " de " + nombreMes + " de " + anio);
    }
    
    
    /**
     * Añade un método esCorrecta() que devuelva true si la fecha que contiene el objeto
    es correcta. Una fecha se considera correcta si:
    - el día está comprendido entre 1 y 31
    - el mes está entre 1 y 12
    - si el mes no es febrero el día estará bien en relación al nº de mes, es decir,
    entre 1 y 31 o entre1 y 30
    - si el mes es febrero el día estará entre 1 y 28 o entre 1 y 29 si el año es
    bisiest
     */
    public boolean esCorrecta()
    {
        return (mes>0 && mes <=12) && (dia >0 && dia<=diasMes());
    }
}
