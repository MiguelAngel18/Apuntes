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
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Miguel Ángel
 */
public class Panel extends JPanel implements ActionListener
{
    private JMenu menuInicio,menuCerrar;
    private JLabel lblHola,lblDado;
    private JButton btnPosicionar, btnSalir, btnPulsar, btnAbeja, btnPul, btnSar;
    private JPanel pnlCentral,pnlPulsar;
    
    public Panel()
    {
        setLayout(new BorderLayout());
        setBackground(Color.red);
        lblHola=new JLabel("Hola",JLabel.CENTER);
       
        add(lblHola,BorderLayout.NORTH);
        
        btnPosicionar=new JButton("Posicionar");
        btnPosicionar.setBackground(Color.green);
        btnPosicionar.setFont(new Font("Comic Sans MS",Font.BOLD+Font.ITALIC,24));
        
        btnPosicionar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
              if(btnAbeja.getHorizontalTextPosition()==JButton.LEFT)
                  btnAbeja.setHorizontalTextPosition(JButton.RIGHT);
              else
                  btnAbeja.setHorizontalTextPosition(JButton.LEFT);
            }
        });
        
        add(btnPosicionar, BorderLayout.WEST);
        
        btnSalir=new JButton("Salir");
        btnSalir.setBackground(Color.YELLOW);
        
        btnSalir.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               System.exit(0);
            }
        });
        
        add(btnSalir, BorderLayout.EAST);
        
        pnlCentral=new JPanel();
        pnlCentral.setLayout(new GridLayout(2,1));
        lblDado=new JLabel("Etiqueta", JLabel.CENTER);
        lblDado.setIcon(new ImageIcon("src/Vista/dado.png"));
        pnlCentral.add(lblDado);
        
        btnAbeja=new JButton("Botón", new ImageIcon("src/Vista/abeja.png"));
        btnAbeja.setHorizontalTextPosition(JButton.LEFT);
        pnlCentral.add(btnAbeja);
        
        add(pnlCentral,BorderLayout.CENTER);
        
        pnlPulsar=new JPanel();
        pnlPulsar.setLayout(new FlowLayout());
        
        btnPulsar=new JButton("Pulsar");
        btnPulsar.setBackground(Color.BLUE);
        btnPulsar.setForeground(Color.yellow);
        btnPulsar.addActionListener(this);
        pnlPulsar.add(btnPulsar);
        
        add(pnlPulsar,BorderLayout.SOUTH);
        
        btnPul=new JButton("Pul");
        btnPul.setBackground(Color.BLUE);
        btnPul.setForeground(Color.yellow);
        btnPul.setVisible(false);
        btnPul.addActionListener(this);
        pnlPulsar.add(btnPul);
        
        
        btnSar=new JButton("Sar");
        btnSar.setBackground(Color.BLUE);
        btnSar.setForeground(Color.yellow);
        btnSar.setVisible(false);
        btnSar.addActionListener(this);
        pnlPulsar.add(btnSar);    
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()==menuInicio)
       {
           btnPulsar.setVisible(false);
           btnPul.setVisible(true);
           btnSar.setVisible(true);
       }
       else
       {
           btnPulsar.setVisible(true);
           btnPul.setVisible(false);
           btnSar.setVisible(false);
       }
    }   
}





