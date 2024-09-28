/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoexamenpro;


/**
 * @author Miguel Ángel
 */
public class Persona implements Comparable<Persona>
{
    private String nombre;
    private int estadoCivil;
    private final int SOLTERO=1,CASADO=2,VIUDO=3,DIVORCIADO=4;
    
    private String fechaNacimiento; // Formato: dd/mm/aaaa
    
    
    public Persona(String nombre, String fechaNacimiento)
    {
        this.nombre = nombre;
        if(estadoCivil<=4 && estadoCivil>=1)
            this.fechaNacimiento = fechaNacimiento;
    }
    
    public Persona(String nombre, int estadoCivil, String fechaNacimiento)
    {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        
        if(estadoCivil<=4 && estadoCivil>=1)
            this.estadoCivil = estadoCivil;
        else
            this.estadoCivil = SOLTERO;
    }
    
    public void setFecha(int dia, int mes, int anio)
    {
        boolean correcto=false;
        if(mes>1 && mes<=12)
        {
            switch(mes)
            {
                case 4:case 6:case 9:case 11: 
                    
                    if(dia>=1 && dia<=30)
                    {
                        correcto=true;
                    }
                     
                    break;
                    
                case 1:case 3:case 5:case 7:case 8:case 10:case 12: 
                        
                    if(dia>=1 && dia<=31)
                    {
                        correcto=true;
                    }
                     
                    break;
                    
                case 2: 
                    if(dia>=1 && dia<=28)
                    {
                        correcto=true;
                    }
                     
                    break; 
                    
                default: correcto=false;
            } 
        }
        
        String formatoFecha="";
        if(correcto==true)
        {
            if(dia<10)
            {
                formatoFecha="0";
            }
            formatoFecha+= dia + "/";
            
            if(mes<10)
            {
                formatoFecha+="0";
            }
            formatoFecha+= mes + "/" + anio;
            
            this.fechaNacimiento=formatoFecha;
        }
    }

    public String getNombre()
    {
        return nombre;
    }
    
    public String getFechaNacimiento()
    {
        return fechaNacimiento;
    }
    
    @Override
    public int compareTo(Persona p)
    {
        if(Integer.parseInt(p.getFechaNacimiento())==Integer.parseInt(fechaNacimiento))
        {
            return 0;
        }
        if(Integer.parseInt(p.getFechaNacimiento())==Integer.parseInt(fechaNacimiento))
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    
    public String getEstadoCivil()
    {
        return switch (estadoCivil) 
        {
            case SOLTERO -> "SOLTERO";
            case CASADO -> "CASADO";
            case VIUDO -> "VIUDO";
            case DIVORCIADO -> "DIVORCIADO";
            default -> "Desconocido";
        };
    }
    
    // Redefiniendo el Equals
    @Override
    public boolean equals(Object o)
    {
        Persona p;
        if(o instanceof Persona)
        {
            p = (Persona) o;
            
            return nombre.equalsIgnoreCase(p.getNombre());
        }
        else
        {
            return false;
        }
    }
    
    public String toString()
    {
        StringBuilder salida = new StringBuilder();
        
        salida.append("Nombre: ").append(nombre).append("\n");
        salida.append("Fecha Nacimiento: ").append(fechaNacimiento).append("\n");
        salida.append("Estado Civil: ").append(getEstadoCivil()).append("\n");

        return salida.toString();
    }
}