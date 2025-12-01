/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilitario;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

/**
 *
 * @author thiag
 */
public class EscritorioVendedor extends  JDesktopPane {
    private BufferedImage imgV;
    
    public EscritorioVendedor(){
        try {
            imgV = ImageIO.read(getClass().getResourceAsStream("/zimagenes/fondoAutorVendedor.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imgV, 0, 0, getWidth(), getHeight(), this);
    }
    
}
