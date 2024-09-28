/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorarrayapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Mariajo
 */
public class GestorArray {

    public int[] numeros;
    public int elem;
    public String nombre;
    public BufferedReader fichero;
    public PrintWriter ficheroSalida;

    public GestorArray(int elem, String nombre) throws FileNotFoundException, ArgumentoIncorrectoException {

        this.nombre = nombre;
        if (elem <= 0) {
            throw new ArgumentoIncorrectoException(elem);
        } else {
            numeros = new int[elem];
            fichero = new BufferedReader(new FileReader(nombre));
        }
    }

    public void cargarArray() throws IOException, ArrayIndexOutOfBoundsException {
        int i = 0;
        String linea = fichero.readLine();

        while (linea != null) {
            try {
                numeros[i] = Integer.parseInt(linea);
                i++;
            } catch (NumberFormatException e) {
                System.out.println("En el fichero hay datos no numericos");
            }
            linea = fichero.readLine();

        }
        fichero.close();
    }

    public void duplicarArray() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= 2;
        }
    }

    public void volcarArray() throws IOException {
        ficheroSalida = new PrintWriter(new BufferedWriter(new FileWriter(nombre)));
        for (int i = 0; i < numeros.length; i++) {
            ficheroSalida.println(numeros[i]);
        }
        ficheroSalida.close();
    }

    public void demoFile(String nombre) throws IOException {
        File fichero = new File(nombre);
        if (fichero.exists()) {
            System.out.println("Nombre: " + fichero.getName());
            System.out.println("\nRuta completa: " + fichero.getAbsolutePath());
            System.out.println("\nTamaño: " + fichero.length() + " bytes");
            if (fichero.isFile()) {
                System.out.println("\nFichero normal");
            } else if (fichero.isDirectory()) {
                mostrarContenidoDirectorio(fichero);
            }
        } else {
            throw new IOException("El fichero " + nombre
                    + " no existe");
        }
    }

    private void mostrarContenidoDirectorio(File directorio) {
        String[] ficheros = directorio.list();
        for (int i = 0; i < ficheros.length; i++) {
            System.out.println("\t" + ficheros[i]);
        }
    }

}
