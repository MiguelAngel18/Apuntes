/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

/**
 *
 * @author miguelhernandezrodriguez
 */
public class S13JTextField3 {
    
    public static void main(String[] args){
        MarcoJTextField3 marco=new MarcoJTextField3();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);        
    }
}
    
class MarcoJTextField3 extends JFrame{
    
    public MarcoJTextField3(){
        setTitle("Eventos de Cuadros de Texto");
        setBounds(600,300,300,350);
        LaminaJTextField3 miLamina=new LaminaJTextField3();
        add(miLamina);
    }   
}

class LaminaJTextField3 extends JPanel{
    private JTextField campoUsu;
    private JPasswordField campoContra;
    private Document miDoc;
    private JLabel etiqueta1, etiqueta2;
    private JButton enviar;
        
    public LaminaJTextField3(){
        etiqueta1=new JLabel("Usuario");
        etiqueta2=new JLabel("Contraseña");
        campoUsu=new JTextField(15);
        campoContra=new JPasswordField(15);
        add(etiqueta1);
        add(campoUsu);
        add(etiqueta2);
        add(campoContra);
        enviar=new JButton("Enviar");
        add(enviar);
        enviar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Nombre: "+campoUsu.getText());
                System.out.println("Contraseña: "+campoContra.getPassword());
            }            
        });
        
        miDoc=campoContra.getDocument();
        miDoc.addDocumentListener(new EscuchaTexto2());  
    }
    
    private class EscuchaTexto2 implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            char[] contrasena=campoContra.getPassword();
            if(contrasena.length<8 || contrasena.length>12)campoContra.setBackground(Color.red);
            else campoContra.setBackground(Color.white);
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            char[] contrasena=campoContra.getPassword();
            if(contrasena.length<8 || contrasena.length>12)campoContra.setBackground(Color.red);
            else campoContra.setBackground(Color.white);
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        
        }    
    }
}
