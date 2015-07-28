package interfaces;

import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Chart extends Canvas{  //this is the class to add a cnvas to draw images.   
    
   
    
    public Chart(){       
        this.setIgnoreRepaint(true); 		
    }
    
    public void drawScreen(int noOfP) {//this method uses to draw diiferent image tables at diiferent times
        Graphics2D g = (Graphics2D) this.getGraphics();	
        BufferedImage image=null;
        try {
            image = ImageIO.read(new File("images/"+String.valueOf(noOfP)+".png"));            
        } catch (IOException ex) {
            System.out.println("File not found");//handle the exception when file was not there
        }       
        g.drawImage(image, 0, 0,this);         
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }   
    
    public void drawQueue(String name) {//this method uses to draw ready queue
        Graphics2D g = (Graphics2D) this.getGraphics();	
        BufferedImage image=null;
        try {
            image = ImageIO.read(new File("images/"+name+".png"));            
        } catch (IOException ex) {
            System.out.println("File not found");//handle the exception when file was not there
        }       
        g.drawImage(image, 0, 0,this);         
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }   
    
    public void rect(int x,int y,String l) {//this method uses to draw rectangles as a patition of a process
        Graphics2D g = (Graphics2D) this.getGraphics();
        BufferedImage image=null;
        try {
            image = ImageIO.read(new File("images/"+l+".png"));            
        } catch (IOException ex) {
            System.out.println("File not found");//handle the exception when file was not there
        }       
        g.drawImage(image, x, y,this);          
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }
    
}
