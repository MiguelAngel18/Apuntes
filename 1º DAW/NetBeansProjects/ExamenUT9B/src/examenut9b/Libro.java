/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenut9b;

/**
 * @author Miguel Ángel
 */
public class Libro
{
    private String titulo,autor,ISBN;
    private int fechaPublicacion;
    private double precio;

    public Libro(String titulo, String autor, String ISBN, int fechaPublicacion, double precio)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.fechaPublicacion = fechaPublicacion;
        this.precio = precio;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public String getISBN()
    {
        return ISBN;
    }

    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }

    public int getFechaPublicacion()
    {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(int fechaPublicacion)
    {
        this.fechaPublicacion = fechaPublicacion;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro{");
        sb.append("titulo=").append(titulo);
        sb.append(", autor=").append(autor);
        sb.append(", ISBN=").append(ISBN);
        sb.append(", fechaPublicacion=").append(fechaPublicacion);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
