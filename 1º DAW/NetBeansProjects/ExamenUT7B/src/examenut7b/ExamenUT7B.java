/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenut7b;

/**
 * @author Miguel Ángel
 */
public class ExamenUT7B
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        Almacen a = new Almacen("Mi casa","+34 928188018");
        
        Producto p = new Fresco("3767/56/12","KiwiMandarina", "Amor", "2024/06/22", "España | China", 100.05);
        
        Fresco f;
        Refrigerado r;
        Congelado c;
        
        System.out.println(p.toString());
    }
}
