/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorarrayapp;

/**
 *
 * @author Mariajo
 */
public class ArgumentoIncorrectoException extends RuntimeException{

    private int tamanio;
    public ArgumentoIncorrectoException(int tamanio) {
        
        super("EL " + tamanio + " es incorrecto");
        this.tamanio=tamanio;
    }
    
    
    
}
