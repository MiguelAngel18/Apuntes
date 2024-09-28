/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos.S32Controlador;

import graficos.S32Modelo.Copiadora;

/**
 *
 * @author Profesor
 */
public class CtrlCopia {
    private String ficheroFuente;
    private String ficheroDestino;
    private String resultado;
    
    public CtrlCopia(){
        
    }
    
    public String getResultado(){
        return resultado;
    }
    
    public void setFicheroFuente(String f){
        ficheroFuente=f;
    }
    
    public void setFicheroDestino(String f){
        ficheroDestino=f;
    }
    
    public void execute(){
        Copiadora c=new Copiadora();
        int res=c.copiar(ficheroFuente,ficheroDestino);
        switch(res){
            case 0: resultado="Copia realizada con éxito";break;
            case 1: resultado="Archivo fuente no se encuentra";break;
            case 2: resultado="La trayectoria dada para el archivo destino no existe";break;
            case 3: resultado="La copia no se ha podido realizar por causas indeterminadas";break;
        }
    }
}
