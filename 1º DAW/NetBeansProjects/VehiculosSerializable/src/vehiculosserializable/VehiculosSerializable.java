/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculosserializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Mariajo
 */
public class VehiculosSerializable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String matricula, marca,modelo;
        double deposito;
        Vehiculo vehiculo;
        Scanner teclado=new Scanner(System.in);
        int respuesta;
        try{
            ObjectOutputStream fout=new ObjectOutputStream(new FileOutputStream("vehiculos.txt", true));
            System.out.println("Desea introducir datos de vehículos? 1:Si 2:No");
             respuesta=teclado.nextInt();
             teclado.nextLine();
            while (respuesta!=2)
            {
                    System.out.println("Matricula?");
                    matricula=teclado.nextLine();
                    System.out.println("Marca?");
                    marca=teclado.nextLine();
                    System.out.println("Modelo?");
                    modelo=teclado.nextLine();
                    System.out.println("Deposito?");
                    deposito=teclado.nextDouble();
                    vehiculo=new Vehiculo(matricula, marca, modelo, deposito);
                    fout.writeObject(vehiculo);
                    System.out.println("Desea introducir datos de vehículos? 1:Si 2:No");
                     respuesta=teclado.nextInt();
                     teclado.nextLine();
            }
            fout.close();
            mostrarDatos();
        }
        catch(IOException e)
        {
             System.out.println("Error al escribir");
        }
            
        
    }
    
    public static void mostrarDatos()
    {
        String matricula, marca,modelo;
        double deposito;
        Vehiculo vehiculo;
        ObjectInputStream fin=null;
        try{
            fin=new ObjectInputStream(new FileInputStream("vehiculos.txt"));
            Object o;
            o=fin.readObject();
            while(o!=null)
            {
                 
                if(o instanceof Vehiculo)
                {
                    vehiculo=(Vehiculo) o;
                    System.out.println(vehiculo.toString());
                }
                o=fin.readObject();
                
            }
        }
        catch(ClassNotFoundException e)
       {
           System.out.println("Los datos no tienen formato correcto");
       }
       
         catch(FileNotFoundException e)
        {
            System.out.println("EL archivo no existe");
        }
        catch (IOException e)
        {
            try{
                fin.close();
            }
            catch(IOException ex)
            {
                System.out.println("Error al cerrar el archivo");
            }
        }
    }
    

}