/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalap;

/**
 *
 * @author Mariajo
 */
public class Granja {
    
    private Animal[] animales;
    private int pos;

    public Granja() {
        animales=new Animal[20];
        pos=0;
    }
    
    public void addAnimal(Animal a)
    {
        if(a!=null)
        {
            animales[pos]=a;
            pos++;
        }
    }
    
    public void mostraAnimales()
    {
        
        for(int i=0; i<pos; i++)
            System.out.println(animales[i].toString());
    }
    
    
    public Animal getAnimal(int i) 
    {
        if(i<pos)
            return animales[i];
        else
            return null;
    }
    
    public int cuantosPerros()
    {
        int cont=0;
        for(int i=0; i<pos;i++)
            if(animales[i] instanceof Perro)
                cont++;
        
        return cont;
    }
}
