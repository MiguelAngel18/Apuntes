/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teatroap;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class GestorTeatro 
{
    private static final int MAX_ENTRADAS=5,VENTA_ENTRADAS=1,MOSTRAR_TEATRO=2,SALIR=3;
    private static final String NOMBRE_FIC="vend.txt";
    private Teatro teatro;
    private Scanner teclado;

    public GestorTeatro(Teatro teatro, Scanner teclado) throws IOException 
    {
        this.teatro = teatro;
        teclado = new Scanner(System.in);
        
        try
        {
            teatro.leerVendidos(NOMBRE_FIC);
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    private int menu()
    {
        System.out.println("__________________________________________________");
        System.out.println("Elige una opcion");
        System.out.println("1. Venta de entradas");
        System.out.println("2. Mostrar teatro");
        System.out.println("3. Salir");
        System.out.println("Teclea opcion");
        
        return teclado.nextInt();
    }
    
    public void venderEntradas()
    {
        int opcion=menu();
        while(opcion!=SALIR)
        {
            switch(opcion)
            {
                case VENTA_ENTRADAS: vender(); break;
                case MOSTRAR_TEATRO: mostrar(); break;
                default: menu();
            }
        }
        salir();
    }
        
    
    private boolean numeroCorrecto(int entradas)
    {
        return entradas>0 && entradas<=MAX_ENTRADAS;
    }
    
    public void vender()
    {
        int entradas;
        System.out.println("Introduzca el numero de entradas que desea comprar:");
        entradas=teclado.nextInt();
        
        while(!numeroCorrecto(entradas))
        {
            System.out.println("Valor introducido incorrecto. Introduzca el numero de entradas que desea comprar:");
            entradas=teclado.nextInt();
        }
        if(teatro.venderEntradas(entradas))
        {
            System.out.println("Venta realizada exitosamente");
        }
        else
        {
            System.out.println("La venta no ha posido realizarse correctamente");
        }
    }    
        
    private void mostrar()
    {
        Teatro t=null;
        t.mostrarTeatro();
    }
        
    private void salir()
    {
            
    }
}