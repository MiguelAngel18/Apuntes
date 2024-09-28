/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaficherosap;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author Mariajo
 */
public abstract class ElementoSistemaFicheros implements Comparable<ElementoSistemaFicheros>{
    
    protected String nombre;
    protected String permisos;
    protected String fechaModificacion;
    protected String horaModificacion;
    protected int tamanio;
    private static  Random generador=new Random();

    public ElementoSistemaFicheros(String nombre) {
        
        this.nombre = nombre;
        this.permisos="xxxx--x--";
        guardar();
        tamanio=generador.nextInt(100)+1;
        
    }
    
    private String formatearFecha()
    {
        GregorianCalendar miGregorian=new GregorianCalendar();
        Date fecha=miGregorian.getTime();
        return new SimpleDateFormat("dd/MM/yyyy").format(fecha);
        
        
    }
    
    private String formatearHora()
    {
        GregorianCalendar miGregorian=new GregorianCalendar();
        Date fecha=miGregorian.getTime();
        return new SimpleDateFormat("HH:mm:ss").format(fecha);
    }
    
    protected String formatearSalida()
    {
        return nombre + "\t" + permisos + "\t" + fechaModificacion + "\t" + horaModificacion;
        
    }
    
    public String toString()
    {
        return formatearSalida() + "\t" + tamanio + "KB";
    }
    
    public void guardar()
    {
        fechaModificacion=formatearFecha();
        horaModificacion=formatearHora();
    }

    public String getNombre() {
        return nombre;
    }

    public String getPermisos() {
        return permisos;
    }

    public void renombrar(String nombre) {
        this.nombre = nombre;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }
    
    public int compareTo(ElementoSistemaFicheros otro)
    {
        return nombre.compareTo(otro.getNombre());
    }
    
    public void listar()
    {
        System.out.println(toString());
    }
    
  
    
}
