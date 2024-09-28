/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Miguel Ángel
 */
public class Panel extends JPanel implements ActionListener
{    
    private JLabel lblNombre,lblApellido,lblNota;
    private JTextField txtNombre,txtApellido,txtNota;
    private JButton btnEnviar;
    private JTextArea txtArea;
    private JPanel pnlForm;
    
    public Panel()
    {
        setLayout(new BorderLayout());
        setBackground(Color.red);
        lblNombre=new JLabel("Nombre",JLabel.CENTER);
        add(lblNombre,new GridLayout(1,2,3,33));
        
        btnEnviar=new JButton("Enviar");
        btnEnviar.setBackground(Color.BLACK);
        btnEnviar.setFont(new Font("Comic Sans MS",Font.BOLD+Font.ITALIC,24));
        
        btnEnviar.addActionListener(this);
 
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String nombre=txtNombre.getText();
            String apellido=txtApellido.getText();
            String nota=txtNota.getText();
            
            if(e.getSource()==btnEnviar)
            {
                System.exit(0);
            }
            else
            {
                if(nombre.equals("") | apellido.equals(nombre) | nota.equals(""))
                {
                    JOptionPane.showMessageDialog(this, "Se deben introducir todos los valores");
                }
                else
                {
                    txtArea.append("*");
                    txtArea.append(nombre);
                    txtArea.append("*");
                    txtArea.append(apellido);
                    txtArea.append(" - ");
                    txtArea.append(nota);
                    txtArea.append("\n");
                    
                    txtNombre.setText("");
                    txtApellido.setText("");
                    txtNota.setText("");
                    
                    txtNombre.requestFocus();
                }
            }
        }
    }
    
    
    
    
    
    
    
    
    
    

}
