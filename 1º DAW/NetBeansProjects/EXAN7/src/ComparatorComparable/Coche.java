/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComparatorComparable;

/**
 * @author Miguel Ángel
 * 
 * No se crea una clase nueva para implementar la Comparable
 */
public class Coche implements Comparable<Coche> /* S implementa la interfaz Comparable y se indica que ordenará coches */
{
    private int velocidad;
    private String matricula, duenio;
    
    public Coche(String matricula, int velocidad)
    {
        this.velocidad = velocidad;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public int getVelocidad()
    {
        return velocidad;
    }

    public void setVelocidad(int velocidad) 
    {
        this.velocidad = velocidad;
    }
    
    
    public int compareTo(Coche otro) /* Se usa el método "compareTo" que implementa el interfaz  */
    {
        /* Se comparan los valores de un atributo de el "otro" objeto con el que se está comparando en el main */

        /* Ordena las velocidades de mayor a menor */
        
        if (this.velocidad == otro.getVelocidad())
            return 0;

        if (this.velocidad < otro.getVelocidad())
            return 1;

        return -1;
    }
    
        @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Coche other = (Coche) obj;
        if ((this.matricula == null) ? (other.matricula != null) : !this.matricula.equals(other.matricula)) {
            return false;
        }

        return true;
    }
    
    @Override
    public String toString() 
    {
        return "\nCoche{" + "velocidad=" + velocidad + ", matricula=" + matricula + '}';
    }

    
    
    
}