/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teatroap;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Mariajo
 */
public class GestorTeatro {
 
        private static final int MAX_ENTRADAS = 5; // máximo nº de entradas que se pueden vender
        private static final int VENTA_ENTRADAS = 1;
        private static final int MOSTRAR_TEATRO  = 2;
        private static final int SALIR = 3;
        private static final String NOMBRE_FIC = "vend.txt";
        private Teatro teatro;
        private Scanner teclado;

    public GestorTeatro(Teatro teatro) {
        this.teatro=teatro;
        teclado=new Scanner(System.in);
        try{
            teatro.leerVendidos(NOMBRE_FIC);
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    
    private int menu()
    {
            
        
            System.out.println(" .........................");
            System.out.println(" Elige una opción ......");
            System.out.println(" .......................");
            System.out.println(" 1.- Venta de entradas");
            System.out.println(" 2.- Mostrar teatro");
            System.out.println(" 3.- Salir");
            System.out.print(" Teclea opción....>");
            
            return teclado.nextInt();
    }
        
    
    public void venderEntradas()
    {
        int opcion=menu();
        while(opcion!=SALIR)
        {
            switch(opcion)
            {
                case VENTA_ENTRADAS: vender();
                                    break;
                case MOSTRAR_TEATRO: mostrar();
                                    break;
                
                default:    System.out.println("Opcion incorrecta");
                    break;
            }
            opcion=menu();
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
        System.out.println("Introduzca el numero de entradas que quiere:");
        entradas=teclado.nextInt();
        while(!numeroCorrecto(entradas))
        {
            System.out.println("Introduzca el numero de entradas que quieres:");
            entradas=teclado.nextInt();
        }
        if (teatro.venderEntradas(entradas))
            System.out.println("Venta realizada");
        else
            System.out.println("Venta NO realizada");
        
    }
    
    private void mostrar()
    {
        teatro.mostrarTeatro();
    }
    
    
    /**
     * guarda en el fichero la nueva situación del teatro. El fichero es el mismo que al cargar (se destruye su 
contenido cada vez que guardamos la nueva situación del teatro
     */
    private void salir() 
    {
        try{
            teatro.guardarVendidos(NOMBRE_FIC);
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
