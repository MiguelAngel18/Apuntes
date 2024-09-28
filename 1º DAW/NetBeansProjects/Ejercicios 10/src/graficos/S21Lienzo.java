/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Image;
import java.awt.geom.Line2D;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Profesor
 */
public class S21Lienzo {
    
    public static void main(String[] args){
        MarcoLienzo marco=new MarcoLienzo();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    }
}

class MarcoLienzo extends JFrame{
    
    public MarcoLienzo (){
        setBounds(400,200,600,450);
        setTitle("Imagenes y dibujos");
        add(new LaminaLienzo());
    }
}

class LaminaLienzo extends JPanel{
    private Graphics2D g2;
    private Image imagen, imagen2;
    
    public LaminaLienzo(){
        try{
            imagen=ImageIO.read(new File("src/graficos/littleblueball.gif"));
            imagen2=ImageIO.read(new File("src/graficos/batmanicono.png"));
        }
        catch(IOException e){
            System.out.println("Archivo no encontrado");
        }
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g2=(Graphics2D)g;
        setBackground(Color.PINK);//color del panel
        addTexto();
        addDibujo();
        addImagen();
    }
    
    public void addTexto(){
        //setForeground(Color.GREEN);//color de texto
        g2.setColor(Color.GREEN);//color del pincel
        Font font=new Font("Arial",Font.BOLD,28);
        g2.setFont(font);
        g2.drawString("Estamos aprendiendo Swing",100,75);
    }
    
    public void addDibujo(){
        g2.setColor(Color.RED);
        Rectangle2D rectangulo=new Rectangle2D.Double(100,100,300,300);
        g2.draw(rectangulo);
        g2.setColor(Color.DARK_GRAY);
        g2.fill(new Ellipse2D.Double(100,100,300,300));
        g2.setColor(Color.ORANGE);
        g2.setStroke(new BasicStroke(15));//ancho del pincel
        g2.draw(new Line2D.Double(40,40,200,40));
    }
    
    public void addImagen(){
        g2.drawImage(imagen,0,0,null);//el ultimo parámetro es null porque no queremos informar a nadie de la carga
        g2.copyArea(0,0,25,25,25,0);
        g2.drawImage(imagen2,450,300,null);//el ultimo parámetro es null porque no queremos informar a nadie de la carga
        
        /*int ancho=imagen.getWidth(null);//podemos poner this
        int alto=imagen.getHeight(null);//podemos poner this
        for(int i=0;i<getWidth()/ancho;i++)
            for(int j=0;j<getHeight()/alto;j++)
                if(i+j>0)g2.copyArea(0,0,ancho,alto,i*ancho,j*alto);//lo del if es para que no la copie encima de la propia imagen (0,0)*/
    }
}
