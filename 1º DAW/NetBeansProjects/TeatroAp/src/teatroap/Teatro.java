/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teatroap;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Mariajo
 */
public class Teatro {
    private final int FILAS=10;
    private final int ASIENTOS=10;
    private boolean teatro[][];

    public Teatro() {
        teatro =new boolean[FILAS][ASIENTOS];
        inicializar();
    }
    
    
    public void inicializar()
    {
        for(int i=0; i<FILAS;i++)
            for(int j=0; j<ASIENTOS; j++)
                teatro[i][j]=true;
    }
    
    
    public String toString()
    {
        StringBuilder salida=new StringBuilder();
        for(int i=0; i<FILAS;i++)
        {
            for(int j=0; j<ASIENTOS; j++)
            {
                if(teatro[i][j]==true)
                    salida.append("__\t");
                else
                    salida.append("XX\t");
            }
            salida.append("\n");
        }
        
        return salida.toString();
    }
    
    
    public void mostrarTeatro()
    {
        System.out.println(toString());
    }
    
    public void leerVendidos(String nombre) throws IOException
    {
        String linea;
        Posicion pos;
        
            Scanner fentrada=new Scanner(new File(nombre));
            while(fentrada.hasNextLine())
            {
                linea=fentrada.nextLine();
                pos=procesarLinea(linea);
                teatro[pos.getFila()][pos.getAsiento()]=false;
                
            }
            fentrada.close();
        
    }
    
    
    private Posicion procesarLinea(String linea)
    {
        String[] datos;
        datos=linea.split(":");
        
        return new Posicion(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]));
    }
    
    /**
     * registra en el fichero cuyo nombre se pasa como parámetro la situación actual del teatro, 
filas y asientos vendidos. Puede lanzar una excepción de tipo IOException aunque no se capturará en este 
método.
     */
    public void guardarVendidos(String nombre) throws IOException
    {
        PrintWriter fsalida=new PrintWriter(new BufferedWriter (new FileWriter(nombre)));
         for(int i=0; i<FILAS;i++)
       {
            for(int j=0; j<ASIENTOS; j++)
                if(teatro[i][j]==false)
                    fsalida.println(i +":" + j);
            
         }
         fsalida.close();
        
    }
    
    /**
     *  recibe como parámetro un objeto de tipo Posicion (que representa la fila y primer asiento 
dentro que se han reservado para un usuario) y la cantidad de entradas vendidas y actualiza el teatro 
adecuadamente.

     */
    
    public void actualizarTeatro(Posicion pos, int numEntradas)
    {
        
        for(int i=0; i<numEntradas; i++)
            teatro[pos.getFila()][pos.getAsiento()+i]=false;
        
        
    }
    
    
    /**
     * recibe la cantidad de entradas que se quieren vender y devuelve si se venden y false en otro 
caso. Este método llamada al método hayPlazasSeguidas() que devuelve la primera posición encontrada en el 
teatro que cumple con los requisitos o null si no se encuentra ninguna. Si la posición devuelta no es null se 
actualiza en teatro
     */
    
    public boolean venderEntradas(int numEntradas)
    {
        Posicion pos;
        pos=hayPlazasSeguidas(numEntradas);
        if(pos!=null)
        {
            actualizarTeatro(pos,numEntradas);
            return true;
        }
        else
            return false;
    }
    
    
    /**
     *  - a partir de la cantidad de entradas que se solicitan se devuelve la primera posición 
encontrada en el teatro o null
     */
    public Posicion hayPlazasSeguidas(int entradas)
    {
        int f=0;
        int a=0;
        boolean hay=false;
        Posicion pos=null;
        int asientoInicial;
        int cont;
        while(f<FILAS && !hay)
        {
            a=0;
            while(a<ASIENTOS  && !hay)
            {
                if(teatro[f][a]==true)
                {
                    asientoInicial=a;
                    cont=0;
                    while (a<ASIENTOS && cont<entradas && teatro[f][a]==true){
                        cont++;
                        a++;
                    }
                    if(cont==entradas)
                    {   
                        hay=true;
                        pos=new Posicion(f,asientoInicial);
                    }
                    
                    
                    
                }
                a++;
            }
            f++;
        }
        return pos;
    }
}
