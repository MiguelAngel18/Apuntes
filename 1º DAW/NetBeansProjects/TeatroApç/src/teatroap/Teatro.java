/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teatroap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Teatro
{
    private static int Nfilas,Nasientos;
    private boolean[][] teatro;

    public Teatro() 
    {
        teatro= new boolean[9][9];
        inicializar();
    }
    
    public void inicializar()
    {
        System.out.println("Todos los asientos están libres: \n");
        for(int i=0;i<teatro.length;i++)
        {
            System.out.println("Fila: " + i + " ");
            for(int j=0;j<teatro.length;j++)
            {
                if(teatro[i][j]!=true)
                {
                    System.out.println(" __ "); // Para poner todos los asientos libres
                }
            }
        }
    }
        
    @Override
    public String toString() 
    {
        StringBuilder salida = new StringBuilder();
        
        for(int i=0;i<teatro.length;i++)
        {
            System.out.println("Fila: " + i + " ");
            for(int j=0;j<teatro.length;j++)
            {
                if(teatro[i][j]==true)
                {
                    System.out.println(" __ "); // Imprime los asientos libres
                }
                if(teatro[i][j]!=true)
                {
                    System.out.println("XX"); // Imprime los asientos ocupados
                }
            }
        }
        return salida.toString();
    }
    
    public String mostrarTeatro()  
    {
        StringBuilder salida = new StringBuilder();
        salida.append("Teatro: ");
        salida.append(" Filas = ");
        salida.append(Nfilas);
        salida.append(" | Asientos = ");
        salida.append(Nasientos);
        salida.append("\nTeatro{ ");
        salida.append(toString());

        return salida.toString();
    }
    
    public void leerVendidos(String nombre) throws IOException
    {
        String linea;
        Posicion p;
        
        Scanner Fentrada = new Scanner(new File(nombre));
        while(Fentrada.hasNextLine())
        {
            linea=Fentrada.nextLine();
            p=procesarLinea(linea);
            teatro[p.getFila()][p.getAsiento()]=false;
        }
        Fentrada.close();    
    }
    
    
    private Posicion procesarLinea(String linea)
    {
        String[] datos;
        datos=linea.split(":");
        
        return new Posicion(Integer.parseInt(datos[0]),Integer.parseInt(datos[1]));
    }
    
    public void guardarVendidos(String nombre) throws IOException
    {
        PrintWriter fsalida = new PrintWriter(new BufferedWriter(new FileWriter(nombre)));
        for(int i=0;i<teatro.length;i++)
        {
            System.out.println("Fila: " + i + " ");
            for(int j=0;j<teatro.length;j++)
            {
                if(teatro[i][j]!=true)
                {
                    fsalida.print(i + ":" + j);
                }
            }
        }
        fsalida.close();
    }
    
    public void actualizarTeatro(Posicion p, int numEntradas)
    {
        for(int i=0;i<numEntradas;i++)
        {
            teatro[p.getFila()][p.getAsiento()+i]=false;
        }
    }
    
    public boolean venderEntradas(int numEntradas) 
    {
        Posicion p = null;
        p=hayPlazasSeguidas(numEntradas);
        if(p!=null)
        {
            actualizarTeatro(p,entradas());
        }

        return false;
    }
    
    
    public Posicion hayPlazasSeguidas(int entradas)
    {
        int f=0,a=0,asientoInicial=0,cont=0;
        boolean hay=false;
        Posicion p = null;
        
        while(f<Nfilas && !hay)
        {
            a=0;
            while(a<Nasientos && !hay)
            {
                if(teatro[f][a]==true)
                {
                    asientoInicial=a;
                    cont=0;
                    
                    while(a<Nasientos && cont<entradas && teatro[f][a]==true)
                    {
                        cont++;
                        a++;
                    }
                    
                    if(cont==entradas)
                    {
                        hay=true;
                        p=new Posicion(f,asientoInicial);
                    }
                }
                a++;
            }
            f++;
        }
        
        return p;
    }
}