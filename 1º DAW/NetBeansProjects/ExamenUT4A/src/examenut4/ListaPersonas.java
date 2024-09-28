/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut4;

/**
 * @author Miguel Ángel
 */
public class ListaPersonas // Sin Array o AraayList
{
    private Persona persona1,persona2,persona3,persona4;
    private int cont;
    
    public ListaPersonas()
    {
        this.cont=0;
    }
    
    public void addPersona(String nombre,String fechaNac)
    {
        if(cont<4)
        {
            switch(cont)
            {
                case 0: persona1 = new Persona(nombre,fechaNac); break;
                case 1: persona2 = new Persona(nombre,fechaNac); break;
                case 2: persona3 = new Persona(nombre,fechaNac); break;
                case 3: persona4 = new Persona(nombre,fechaNac); break;
            }
            cont++;
        }
    }
    
    public void mostrarPersonas()
    {
        if(cont==0)
        {
            System.out.println(persona1.toString());
        }
        if(cont==1)
        {
            System.out.println(persona1.toString());
            System.out.println(persona2.toString());
        }
        if(cont==3)
        {
            System.out.println(persona1.toString());
            System.out.println(persona2.toString());
            System.out.println(persona3.toString());
        }
        if(cont==4)
        {
            System.out.println(persona1.toString());
            System.out.println(persona2.toString());
            System.out.println(persona3.toString());
            System.out.println(persona4.toString());
        }
    }
    
    public void borrarPersona(int numPersona)
    {
        switch(numPersona)
        {
            case 1:
                 
                if(persona1!=null)
               {
                    persona1=persona2;
                    persona2=persona3;
                    persona3=persona4;
                    persona4=null;
                    cont--;
                }
                else
                {
                    System.out.println("No hay nadie");
                }
                break;
                  
            case 2:
                   
                if(persona2!=null)
                {
                    persona2=persona3;
                    persona3=persona4;
                    persona4=null;
                    cont--;
                }
                else
                {
                    System.out.println("No hay nadie");
                }
                break;
                   
            case 3:
                   
                if(persona3!=null)
                {
                    persona3=persona4;
                    persona4=null;
                    cont--;
                }
                else
                {
                    System.out.println("No hay nadie");
                }
                break;
                   
            case 4: 
                  
                if(persona4!=null)
                {
                    persona4=null;
                    cont--;
                }
                else
                {
                    System.out.println("No hay nadie");
                }
                break;
        }
    }
    
    public String borrarSolteros()
    {
        int borrados=0;
        
        if(persona4!=null && esSoltero( persona4))
        {
            borrarPersona(3);
            borrados++;
        }
        if(persona3!=null && esSoltero( persona3))
        {
            borrarPersona(2);
            borrados++;            
        }
        if(persona2!=null && esSoltero( persona2))
        {
            borrarPersona(1);
            borrados++;
        }
        if(persona1!=null && esSoltero( persona1))
        {
            borrarPersona(0);
            borrados++;
        }
        return "Solteros borrados de la faz de la Tierra: " + borrados + "\n";
    }
    
    private boolean esSoltero(Persona p)
    {
        return (p.getEstadoCivil().equalsIgnoreCase("SOLTERO"));
    }
}