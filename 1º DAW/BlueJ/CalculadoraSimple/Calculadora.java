
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    private int num1;
    private int num2;

    /**
     * Constructor Calculadora
     */
    public Calculadora()
    {

    }

    /**
     * Calcular suma de los números insertados
     */
    public int suma(int num1, int num2)
    {
        return num1 + num2;
    }
    
    /**
     * Calcular resta de los números insertados
     */
    public int resta(int num1, int num2)
    {
        return num1 - num2;
    }
    
    /**
     * Calcular multiplicación de los números insertados
     */
    public int multiplicación(int num1, int num2)
    {
        return num1 * num2;
    }
    
    /**
     * Calcular dividir(enteros) de los números insertados
     */
    public int dividir(int num1, int num2)
    {
        return num1 / num2;
    }
    
    /**
     * Calcular dividir(reales) de los números insertados
     */
    public double dividirReales(int num1, int num2)
    {
        return (1.0*num1)/(num2);
    }
    
    /**
     * Calcular la potencia de los números insertados, donde num1 es la base
     * y num2 es el exponente
     */
    public int potencia(int num1, int num2)
    {
        return num1^num2;
    }

    /**
     * Calcular la potencia de los números insertados, donde num1 es la base
     * y num2 es el exponente
     */
    public void potencia2(int num1, int num2)
    {
        double potencia = Math.pow(num1,num2);
    }

    /**
     * Calcular la raíz cuadrada de los números insertados, donde num1 es la base
     * y num2 es el exponente
     */
    public void raizCuadrada(int num3)
    {
        double raizCuadrada = Math.sqrt(num3);
    }
}