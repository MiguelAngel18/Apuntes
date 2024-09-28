/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jornadaaap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel Ángel
 */
public class Jornada
{
    private String fechaJornada;
    private List<Partido> partidos;

    public Jornada()
    {
        partidos = new ArrayList<Partido>();
    }
    
    public void leerJornada(String nombre) throws FileNotFoundException
    {
        BufferedReader fentrada;
        File f = new File(nombre);
        String linea;
        
        if(!f.exists())
        {
            System.out.println("El fichero no existe");
        }
        else
        {
            try
            {
                                fentrada=new BufferedReader(new FileReader(f));
                fechaJornada=leerFechaJornada(fentrada);
                linea=fentrada.readLine();
            
            }
            catch(IOException e)
            {
                System.out.println("Error al leer el fichero");
            }
        }
    }
    
    public String leerFechaJornada(BufferedReader f) throws IOException
    {
        return f.readLine();
    }

    public Partido procesarLinea(String linea)
    {
        String[] datos=linea.split(":");
        
        try
        {
            return new Partido(datos[0],datos[1],Integer.parseInt(datos[2]),Integer.parseInt(datos[3]));
        }
        catch(NumberFormatException e)
        {
            System.out.println("Hay datos incorrectos en el archivo");
        }
        return null;
    }
    
    public void listarQuinielaJornada()
    {
        System.out.println("Fecha de la jornada" + fechaJornada);
        
        for(Partido p: partidos)
        {
            System.out.println(p.getEquipoLocal() + "-" + p.getEquipoVisitante() + "\t" + p.getResultadoPartido());
        }
    }
    
    private Resultado maximo(int[][] resultados)
    {
        int maxFila=0;
        int maxColumna=0;
        
        for(int i=0;i<resultados.length;i++)
        {
            for(int j=0;j<resultados.length;j++)
            {
                if(resultados[i][j]>resultados[maxFila][maxColumna])
                {
                    maxFila=i;
                    maxColumna=j;
                }
            }
        }
        return new Resultado(maxFila,maxColumna);
    }
    
    
    
    public void listarResultadoMasRepetido()
    {
        int[][] resultados=new int[10][10];
        int cont=0;
        Resultado resul;
        
        for(Partido p: partidos)
        {
            resultados[p.getResultadoPartido()][p.getGolesVisitante()]++;
        }
        
        resul=maximo(resultados);
        System.out.println("El resultado mas repetido fue" + resul.getLocal() + "-" + resul.getVisitante());
        
        for(Partido p: partidos)
        {
            if(p.getGolesLocal()==resul.getLocal() && p.getGolesVisitante()==resul.getVisitante())
            {
                cont++;
                
            }
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
