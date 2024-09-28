/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package repaso_bucles;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Ejercicio_1
{
    public static void Ejercicio_1(int numFilas) 
    {
        System.out.print("Introduce el número de filas: ");
        System.out.println("");
        for(int i=1; i<=numFilas; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void Ejercicio_2(int numFilas) 
    {
        System.out.print("Introduce el número de filas: ");
        System.out.println("");
        for(int i=1; i<=numFilas; i++)
        {
            for(int k=1; k<=numFilas-i; k++)
            {
                System.out.print(" ");
            }
            
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    
    import java.util.Scanner;

public class EscaleraNumeros {

    public static void main(String[] args) {
        // Solicitar la altura por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura de la escalera: ");
        int altura = scanner.nextInt();

        // Llamar al método para dibujar la escalera
        dibujarEscalera(altura);

        // Cerrar el escáner para evitar fugas de recursos
        scanner.close();
    }

    // Método para dibujar la escalera de números
    public static void dibujarEscalera(int altura) {
        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios en blanco para alinear los números
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }

            // Imprimir números de 1 a i en cada línea
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Cambiar de línea después de cada fila
            System.out.println();
        }
    }
}

    
    
    public static void main(String[] args) 
    {
        Ejercicio_1(5);
        Ejercicio_2(5);

    }
    
    
    
}
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   