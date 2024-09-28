/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cdsydvdsap;

/**
 *
 * @author Mariajo
 */
public class CD extends Articulo{
    private String artista;
    private int numPistas;

    public CD(String artista, int numPistas, String titulo, int duracion) {
        super(titulo, duracion);
        this.artista = artista;
        this.numPistas = numPistas;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getNumPistas() {
        return numPistas;
    }

    public void setNumPistas(int numPistas) {
        this.numPistas = numPistas;
    }
    
    public double getPrecio()
    {
        return 10 + 10*0.05;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "Artista:" + artista + " Num Pistas:" + numPistas;
    }
    
    @Override
    public boolean equals(Object o)
    {
        CD cd;
        if(!(o instanceof CD))
            return false;
        else
        {
            cd=(CD)o;
            if(artista.equals(cd.getArtista() )&& (super.getTitulo().equals(cd.getTitulo())))
                return true;
            else
                return false;
        }
            
    }
    
}
