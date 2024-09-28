
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro
{
    // instance variables - replace the example below with your own
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private String numeroReferencia;
    private int vecesPrestado;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String nuevoTitulo,String nuevoAutor, int quePaginas)
    {
        titulo=nuevoTitulo;
        autor=nuevoAutor;
        numeroPaginas=quePaginas;
        numeroReferencia="";
        vecesPrestado=0;
    }
    
    /**
     * Accesor para título
     */
    public String getTitulo()
    {
        return titulo;
    }
    
    /**
     * Accesor para el autor
     */
    public String getAutor()
    {
        return autor;
    }
    
    /**
     * Accesor del numero de paginas
     */
    public int getNumeroPaginas()
    {
        return numeroPaginas;
    }
    
    /**
     * Accesor del numero de referencia
     */
    public String getNumeroReferencia()
    {
        return numeroReferencia;
    }
    
    /**
     * Accesor para las veces prestado
     */
    public int getVecesPrestado()
    {
        return vecesPrestado;
    }
    
    /**
     * Mutador para el numero de referencia
     */
    
    public void setNumeroReferencia(String queNumeroReferencia)
    {
        numeroReferencia=queNumeroReferencia;
    }
    
    /**
     * Incrementa en uno el número de veces prestado
     */
    public void prestar()
    {
        vecesPrestado++;
    }
    
    /**
     * Imprime el título por pantalla
     */
    public void printTitulo()
    {
        System.out.println("Titulo:" + titulo);
    }
    
    /**
     * Imprime el autor por pantalla
     */
    public void printAutor()
    {
        System.out.println("Autor:" + autor);
    }
    
    /**
     * Imprime por pantalla los datos del libro
     */
    public void printDetalles()
    {
        printTitulo();
        printAutor();
        System.out.println("Páginas:" + numeroPaginas);
        System.out.println("Numero de Referencia:" + numeroReferencia);
        System.out.println("Ha sido prestado:" + vecesPrestado);
    }
    
   
}
