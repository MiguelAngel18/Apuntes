/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos.S32Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import graficos.S32Controlador.CtrlCopia;

/**
 *
 * @author Profesor
 */
public class LaminaMVC extends JPanel{    
    private JLabel etiFuen, etiDest, etiRes;
    private JTextField fuente, destino;
    private JButton boton;
    
    public LaminaMVC(){
        etiFuen=new JLabel("Fichero  fuente:");
        add(etiFuen);
        fuente=new JTextField(20);
        add(fuente);
        etiDest=new JLabel("Fichero destino:");
        add(etiDest);
        destino=new JTextField(20);
        add(destino);
        boton=new JButton("Pulsar");
        add(boton);
        etiRes=new JLabel();
        add(etiRes);
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String fFuente="";
                String fDestino="";
                fFuente=fuente.getText();
                fDestino=destino.getText();
                if(fFuente!=null && fDestino!=null){
                    CtrlCopia copiador=new CtrlCopia();
                    copiador.setFicheroFuente(fFuente);
                    copiador.setFicheroDestino(fDestino);
                    copiador.execute();
                    String res=copiador.getResultado();
                    etiRes.setText(res);
                }
            }   
        });
    }
}