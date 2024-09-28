/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productosap;

/**
 *
 * @author Mariajo
 */
public class Tienda {
    
    private final int MAX=10;
    private String nombre;
    private ProductoInventariado[] inventario;
    private int ultimaEntrada;
    private double caja;

    public Tienda(String nombre, double caja) {
        this.nombre = nombre;
        this.caja = caja;
        inventario=new ProductoInventariado[MAX];
        ultimaEntrada=-1;
    }
    
    /**
     *  – busca un producto a
partir de su identificador y devuelve su posición 0 -1 si no se
encuentra
     */
    public int buscarProducto(String id)
    {
        boolean encontrado=false;
        int i=0;
        while(!encontrado && i<=ultimaEntrada)
        {
            if(inventario[i].getId().equals(id))
                encontrado=true;
            else
                i++;
        }
        if(encontrado)
            return i;
        else
            return -1;
    }
    
    /**
     * – un nuevo producto llega a la tienda. Si ya existe únicamente se modifican sus datos, si no existe es un nuevo producto que hay que
inventariar. Si hay sitio en la tienda y dinero en la caja se añade el nuevo producto haciendo las
modificaciones necesarias a la tienda. Si no se pude añadir se emite un mensaje que indique la causa.
     */
    
    public void addproducto(String id, double precio, int cantidad, int beneficio) 
    {
        int pos=buscarProducto(id);
        if(caja>=precio*cantidad)
        {
            if(pos!=-1)
            {
                inventario[pos].setPrecioBase(precio);
                inventario[pos].setCantidad(cantidad);
                inventario[pos].setBeneficio(beneficio);

            }
            else
            {
                ultimaEntrada++;
                
                inventario[ultimaEntrada]=new ProductoInventariado(cantidad,beneficio,id, precio);
            }
            caja-=precio*cantidad;
        }
        else
            System.out.println("NO hay dinero suficio¡ente");

        
            
        
    }
    
    /**
     * – se vende un producto cuyo identificador es id. Si no
existe se visualiza un mensaje. Si está en la tienda y hay suficiente cantidad se
* vende haciendo las
modificaciones necesarias.
     */
    public void venderProducto(String id, int cantidad) 
    {
        int pos=buscarProducto(id);
        if(pos!=-1)
        {
            if(inventario[pos].getCantidad()>=cantidad)
            {
                inventario[pos].setCantidad(inventario[pos].getCantidad()-cantidad);
                caja+=inventario[pos].calcularPrecioFinal()*cantidad;
            }
            else
                System.out.println("NO hay cantidad suficio¡ente");
        }
        else
            System.out.println("EL articulo no existe");
    }
    
    public String toString()
    {
        StringBuilder salida=new StringBuilder("LA tienda:\n");
        salida.append("Caja:").append(caja);
      
        for(int i=0; i<=ultimaEntrada;i++)
            salida.append(inventario[i].toString());
        
        return salida.toString();
            
    }
    public void listar()
    {
        System.out.println(toString());
    }
}
