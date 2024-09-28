
/**
 * Write a description of class Condicional here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Condicional
{
    // instance variables - replace the example below with your own
    private int num1;
    private int num2;

    /**
     * Constructor for objects of class Condicional
     */
    public Condicional(int num1, int num2)
    {
        // initialise instance variables
        this.num1=num1;
        this.num2=num2;
        
    }

    
    /**
     * El método esIgual() que devolverá true si los números son iguales, false en caso 
        contrario
     */
    public boolean esIgual()
    {
        return num1==num2;
    }
    
    /**
     * , este método mostrará un mensaje informando si los números son 
        negativos o positivos
     */
     public void esPositivo()
     {
         if(num1>=0)    
             System.out.println("El num1 es positivo");
         else
             System.out.println("El num1 es negativo");
        
         if(num2>=0)    
             System.out.println("El num2 es positivo");
         else
             System.out.println("El num2 es negativo"); 
             
     }
     
     /**
      * , este método mostrará un mensaje y especificará si uno es múltiplo del otro.
      */
     public void esMultiplo()
     {
         if (esIgual())
             System.out.println( "Son multiplos porque son el mismo numero");
        else
        {
         if (num2!=0 && num1%num2==0)
               System.out.println( num1 + " es multiplo de " + num2);
             
         
         else if(num1!=0 && num2%num1==0)
                 System.out.println( num2 + " es multiplo de " + num1);
             else
                 System.out.println("No son multiplos");
        }
        
     }
     
     /**
      * , devuelve el número mayor.
      */
    public int getMayor()
    {
        
        if(num1>=num2)
            return num1;
        
        else 
                return num2;
                
    }
    
    /**
     * , muestra un mensaje informando si los números son iguales o, de no 
serlo, muestra el mayor.
     */
    public void comparar()
    {
        if (esIgual())
            System.out.println("Los numeros son iguales");
        else
            System.out.println("El mayor es el " + getMayor());
    }
    
    /**
     * , devuelve una String que ordena ambos números de mayor a menor.
     */
    public String ordenar()
    {
        if(num1>=num2)
            return num1 + "-" + num2;
        else
            return num2 + "-" + num1;
    }
    
    /**
     * , devuelve una String que ordena los tres números de mayor a menor.
     */
    public String ordenaAdicional(int num3)
    {
        String resul="";
        if(num1>=num2 && num2>=num3)
            resul+= num1 +"-" + num2 +"-" +num3;
        else if(num1>=num3 && num3>=num2)
                resul+= num1 +"-" + num3 +"-" +num2;
            else if (num2>=num1 && num1>=num3)
                    resul+= num2 +"-" + num1 +"-" +num3;
                 else if (num2>=num3 && num3>=num1)
                         resul+= num2 +"-" + num3 +"-" +num1;
                     else if(num3>=num1 && num1>=num2)
                             resul+= num3 +"-" + num1 +"-" +num2;
                         else
                             resul+= num3 +"-" + num2 +"-" +num1;
        return resul;          
    }
}
