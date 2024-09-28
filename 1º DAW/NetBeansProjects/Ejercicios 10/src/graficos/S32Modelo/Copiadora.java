/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos.S32Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Profesor
 */
public class Copiadora {
    
    public Copiadora(){
        
    }
    
    public int copiar(String f, String d){
        File fuente=new File(f);
        if(!fuente.exists()) return 1;
        
        File destino=new File(d);
        int pos=destino.getPath().lastIndexOf("\\");
        if(pos<0)return 2;
        String path=destino.getPath().substring(0,pos);
        File camino=new File(path);
        if(!camino.exists())return 2;
        
        try{
            BufferedReader reader=new BufferedReader(new FileReader(fuente));
            PrintWriter writer=new PrintWriter(new BufferedWriter(new FileWriter(destino)));
            do{
                String linea=reader.readLine();
                if(linea==null)break;
                writer.println(linea);
            }while(true);
            reader.close();
            writer.close();
        }
        catch(Exception e){
            return 3;
        }
        
        return 0;
    }
}
        