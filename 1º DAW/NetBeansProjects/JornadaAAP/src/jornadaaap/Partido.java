/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jornadaaap;

/**
 *
 * @author Miguel Ángel
 */
public class Partido 
{
    private String local,visitante;
    private int resulLocal,resulVisitante;

    public Partido(String local, String visitante, int resulLocal, int resulVisitante) 
    {
        this.local = local;
        this.visitante = visitante;
        this.resulLocal = resulLocal;
        this.resulVisitante = resulVisitante;
    }

    @Override
    public String toString() 
    {
        return "Partido{" + "local=" + local + ", visitante=" + visitante + ", resulLocal=" + resulLocal + ", resulVisitante=" + resulVisitante + '}';
    }

    public String getEquipoLocal() 
    {
        return local;
    }

    public String getEquipoVisitante() 
    {
        return visitante;
    }

    public int getGolesLocal() 
    {
        return resulLocal;
    }

    public int getGolesVisitante() 
    {
        return resulVisitante;
    }
    
    public char getResultadoPartido() 
    {
        char salida = '0';
        
        if(getGolesLocal()==getGolesVisitante())
        {
            salida= 'X';
        }
        if(getGolesLocal()>getGolesVisitante())
        {
            salida= '1';
        }
        if(getGolesLocal()<getGolesVisitante())
        {
            salida= '2';
        }
        
        return salida;
    }
}