/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import gridlayoutap.GridLayOut;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Miguel Ángel
 */
public class Panel
{
    private JLabel lblNombre,lblApellidos,lblNotas;
    private JTextField txtNombre,txtApellidos,txtNotas;

    public Panel()
    {
        this.setLayOut(new GridLayOut(4,2,5,5));
                
                
        lblNombre=new JLabel("Apellidos:0",JLabel.RIGHT);        
        add(lblNombre);
        
        txtNombre=new JTextField(,JLabel.RIGHT);        
        add(lblNombre);
                
                
                
                
                
    }
    
    
}