/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut5a;

/**
 * @author Miguel Ángel
 */
public class Jugador
{
    private String nombre;
    private int edad;
    
    private int dorsal;
    private static int contDorsales=0;
    
    private Puesto puesto;

    public Jugador(String nombre, int edad, Puesto puesto)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
        
        contDorsales++; // Incrementa el valor estático de la cantidad tal de Jugadores
        dorsal=contDorsales; // Se asigna el valor anterior
    }
    
    public Jugador(String datos) // Formato: nombre:edad
    {
        if(datos!=null && datos.contains(":"))
        {
            String[] valores = datos.split(":");
        
            this.nombre = valores[0];
            this.edad = Integer.parseInt(valores[1]);
        
            this.puesto = puesto.DELANTERO;
        
            contDorsales++;
            dorsal=contDorsales;
        }
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public int getDorsal()
    {
        return dorsal;
    }

    public Puesto getPuesto()
    {
        return puesto;
    }
    
    public String toString()
    {
        StringBuilder salida = new StringBuilder();
        
        salida.append("Nombre: ").append(nombre).append(" (Dorsal: ").append(dorsal).append(")").append("\n");
        salida.append("Edad: ").append(edad).append("\n");
        salida.append("Puesto: ").append(puesto);
        return salida.toString();
    }
    
}
