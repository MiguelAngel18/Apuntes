/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Profesor
 */
public class S27Dialogos {
    
    public static void main(String[] args){
        MarcoDialogos marco=new MarcoDialogos();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true); 
    }       
}

class MarcoDialogos extends JFrame{
    
    public MarcoDialogos(){
        setTitle("Ventanas de dialogo");
        setBounds(300,300,500,300);
        add(new LaminaDialogos());
    }    
}

class LaminaDialogos extends JPanel{
    private JButton[] botones;
    private String[] nombres={"Message","Input","Confirm","Option","No-Modal","FileChooser","ColorChooser"};

    public LaminaDialogos(){
       botones=new JButton[nombres.length];
       for(int i=0;i<botones.length;i++){
           botones[i]=new JButton(nombres[i]);
           add(botones[i]);
           botones[i].addActionListener(new ListenerBotones());
       }
    }

    private class ListenerBotones implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e){
            Toolkit mipantalla=Toolkit.getDefaultToolkit();
            Image miImagen=mipantalla.getImage("src/graficos/batmanicono.png");
            Icon miIcono=new ImageIcon(miImagen);
            String nombre="";
            String[] opciones={"Miguel","Pedro","Juana","Rosa","Luis"};
            int opcion=0;

            if(e.getSource()==botones[0]){
                JOptionPane.showMessageDialog(null,"Ventana de mensaje");//Por defecto INFORMATION_MESSAGE
                //JOptionPane.showMessageDialog(LaminaDialogos.this,"Ventana de mensaje");
                //JOptionPane.showMessageDialog(null,"Ventana de mensaje", "Titulo mio",JOptionPane.ERROR_MESSAGE);
                //JOptionPane.showMessageDialog(null,"Ventana de mensaje", "Titulo mio",JOptionPane.INFORMATION_MESSAGE);
                //JOptionPane.showMessageDialog(null,"Ventana de mensaje", "Titulo mio",JOptionPane.WARNING_MESSAGE);
                //JOptionPane.showMessageDialog(null,"Ventana de mensaje", "Titulo mio",JOptionPane.QUESTION_MESSAGE);
                //JOptionPane.showMessageDialog(null,"Ventana de mensaje", "Titulo mio",JOptionPane.PLAIN_MESSAGE);
                //JOptionPane.showMessageDialog(null,"Ventana de mensaje", "Titulo mio",JOptionPane.PLAIN_MESSAGE,miIcono);
            }
                
            if(e.getSource()==botones[1]){
                nombre=JOptionPane.showInputDialog(null,"Introduzca su nombre:");
                //nombre=JOptionPane.showInputDialog(null,"Introduzca su nombre:","Miguel");
                //nombre=JOptionPane.showInputDialog(null,"Ventana de mensaje", "Titulo mio",JOptionPane.ERROR_MESSAGE);
                /*nombre=(String)JOptionPane.showInputDialog(null,"Ventana de mensaje", "Titulo mio",
                        JOptionPane.ERROR_MESSAGE,miIcono,opciones, opciones[0]);*/
            }
                
            if(e.getSource()==botones[2]){
                opcion=JOptionPane.showConfirmDialog(null,"¿Desea continuar con el borrado?");//Sí(0)-No(1)-Cancelar(2) por defecto YES_NO_CANCEL_OPTION
                //opcion=JOptionPane.showConfirmDialog(null,"¿Desea continuar con el borrado?","Titulo mio", JOptionPane.YES_NO_OPTION);
                //opcion=JOptionPane.showConfirmDialog(null,"¿Desea continuar con el borrado?","Titulo mio", JOptionPane.YES_NO_CANCEL_OPTION);
                //opcion=JOptionPane.showConfirmDialog(null,"¿Desea continuar con el borrado?","Titulo mio", JOptionPane.OK_CANCEL_OPTION);
                /*opcion=JOptionPane.showConfirmDialog(null,"¿Desea continuar con el borrado?","Titulo mio", 
                        JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);*/
                /*opcion=JOptionPane.showConfirmDialog(null,"¿Desea continuar con el borrado?","Titulo mio", 
                        JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE,miIcono);*/
            //YES_NO_OPTION, YES_NO_CANCEL_OPTION, or OK_CANCEL_OPTION
            }
            if(e.getSource()==botones[3]){
                opcion=JOptionPane.showOptionDialog(null,"Ventana de mensaje", "Titulo mio",JOptionPane.YES_NO_OPTION,
                        JOptionPane.ERROR_MESSAGE,miIcono,opciones, opciones[0]);
                /*opcion=JOptionPane.showOptionDialog(null,"Ventana de mensaje", "Titulo mio",JOptionPane.YES_NO_OPTION,
                        JOptionPane.ERROR_MESSAGE,miIcono,null,null);*/
            }
                
            if(e.getSource()==botones[4]){
                JOptionPane pane=new JOptionPane();
                JDialog dialog = pane.createDialog(null, "Titulo mio");//no es static
                dialog.setModal(false); // es modal por defecto
                dialog.setVisible(true);
            }
            
            if(e.getSource()==botones[5]){
                JFileChooser browser=new JFileChooser();//directorio actual. se le puede pasar otro como parámetro (File)
                browser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);//por defecto es FILES_ONLY
                int resultado = browser.showOpenDialog(LaminaDialogos.this);//Elegido archivo(0)-Cancelar(1)
                if(resultado==0){
                    File archivo = browser.getSelectedFile();
                    System.out.println(archivo.getName());
                }
                
            }
            
            if(e.getSource()==botones[6]){
                JColorChooser browser=new JColorChooser();
                Color color = browser.showDialog(LaminaDialogos.this,"Mi titulo",Color.GREEN);//Cancelar(null)
                System.out.println(color);
            }
        }
    }
}