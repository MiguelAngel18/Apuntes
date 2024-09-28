/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Miguel Ángel
 */
public class Panel extends JPanel
{
    private String[] letras={"ABCDEFGHIJKLMNÑOPQRSTUVWXYZ \b \t"};
    private JButton[] btnLetras;
    private JPanel[] pnlLetras;
    private JPanel pnlTexto;
    private JTextField txtTexto;
    
    public Panel()
    {
        
        setLayout(new GridLayout(6,5));
        btnLetras= new JButton[30];
        
        for(int i=0;i<letras.length;i++)
        {
           if(i<28)
           {
               btnLetras[i]= new JButton(""+letras.charAt(i));
           }
           else
           {
               if(letras.charAt(i)=='\b')
               {
                   btnLetras[i]= new JButton("BS");
               }
               else if(letras.charAt(i)=='\t')
               {
                   btnLetras[i]= new JButton("CL");
               }
           }
        }
        
        pnlTexto = new JPanel();
        
        txtTexto= new JTextField(30);
        pnlTexto.add(txtTexto);
        pnlTexto.setBorder(new TitledBorder("Texto"));
        add(txtTexto);
    }
}
