/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

/**
 *
 * @author miguelhernandezrodriguez
 */
public class S12JTextField2 {
    
    public static void main(String[] args){
        MarcoJTextField2 marco=new MarcoJTextField2();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);        
    }
}
    
class MarcoJTextField2 extends JFrame{
    
    public MarcoJTextField2(){
        setTitle("Eventos de Cuadros de Texto");
        setBounds(600,300,600,350);
        LaminaJTextField2 miLamina=new LaminaJTextField2();
        add(miLamina);
    }   
}

class LaminaJTextField2 extends JPanel{
    private JTextField campo;
    private Document miDoc;
        
    public LaminaJTextField2(){
        campo=new JTextField(20);
        miDoc=campo.getDocument();
        miDoc.addDocumentListener(new EscuchaTexto());
        add(campo);       
    }
    
    private class EscuchaTexto implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            String texto=campo.getText();
            System.out.println("Has insertado texto: "+texto);
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            String texto=campo.getText();
            System.out.println("Has borrado texto: "+texto);
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        
        }    
    }
}
