/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Profesor
 */
public class S04MarcoConEtiquetas
{
    public static void main(String[] args)
    {        
        MarcoConEtiqueta marco=new MarcoConEtiqueta();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
}

class MarcoConEtiqueta extends JFrame
{
    private JLabel etiqueta;
    
    public MarcoConEtiqueta()
    {        
        setTitle("Mi ventana con etiqueta");
        setSize(500,300);       
        etiqueta = new JLabel("Soy una etiqueta");   // creamos una componente etiqueta
        add(etiqueta);
        pack();
    }
}

/*class MarcoConEtiqueta extends JFrame{
    
    public MarcoConEtiqueta(){        
        setTitle("Mi ventana con etiqueta");
        setBounds(200,200,500,300);       
        MiPanel panel=new MiPanel();
        add(panel);
        //pack();
    }
}

class MiPanel extends JPanel{
    private JLabel etiqueta;

    public MiPanel(){
        etiqueta = new JLabel("Soy una etiqueta");
        add(etiqueta);
    }
}*/