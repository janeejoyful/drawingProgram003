// Lab07stv110.java
// This is the 110 point version
// Janee Yeak
// 5 November 2020
// APCS, Chris Robinson
// This program creates the class 'Elsa'

import java.awt.*;
import java.applet.*;

public class Elsa
{  
      
	public static void drawDress(Graphics g)
	{
      g.setColor(new Color(72,146,244));
      Polygon cape = new Polygon(); // cape of the dress
      cape.addPoint(100,135);
      cape.addPoint(1,375);
      cape.addPoint(274,375);
      cape.addPoint(175,135);
      g.fillPolygon(cape);

      g.setColor(new Color(137,207,240));
      Polygon topHalf = new Polygon(); // Top-half of the dress
      topHalf.addPoint(100,135);
      topHalf.addPoint(115,230);
      topHalf.addPoint(160,230);
      topHalf.addPoint(175,135);
      g.fillPolygon(topHalf);
      
      g.setColor(new Color(198,230,251));
      g.fillRect(115,230,45,15); // band across
      
      g.setColor(new Color(137,207,240));
      Polygon bottomHalf = new Polygon(); // bottom-half of the dress
      bottomHalf.addPoint(115,245);
      bottomHalf.addPoint(70,420);
      bottomHalf.addPoint(205,420);
      bottomHalf.addPoint(160,245);
      g.fillPolygon(bottomHalf);
      
 	}
   public static void drawNeck(Graphics g)
	{
      g.setColor(new Color(236,188,180));
      g.fillArc(120,121,40,25,0,-180); // neck
      g.fillRect(130,115,20,20);        
	}

   public static void drawHair(Graphics g)
	{
	   g.setColor(Color.white);
      g.fillOval(101,56,70,70); // drawing the hair
      g.fillOval(100,105,30,40); // braid
   	g.fillOval(110,140,30,40); // braid
      g.fillOval(120,175,30,40); // braid
      g.fillOval(130,210,30,40); //braid
      
     }
   
   
	public static void drawFace(Graphics g)
	{
	   g.setColor(new Color(236,188,180));
      g.fillOval(115,75,50,50);  // drawing the face
      
      g.setColor(Color.black); // Drawing the eyes 
      g.drawOval(125,90,10,5);
      g.drawOval(145,90,10,5);
      
      g.setColor(Color.white); // colouring the eyes
      g.fillOval(126,90,9,5);
      g.fillOval(146,90,9,5);
      
      g.setColor(new Color(128,128,255)); 
      g.fillOval(128,90,5,5);  //drawing pupils
      g.fillOval(148,90,5,5);
      
      g.setColor(Color.black);
      g.drawArc(125,85,10,5,0,180); // drawing eyebrows
      g.drawArc(145,85,10,5,0,180);
      
      g.setColor(new Color(197,140,133)); 
      g.drawLine(140,90,143,105);  // drawing a nose
      g.drawLine(143,105,140,105);
      
      g.setColor(new Color(255,105,180));
      g.fillArc(133,108,15,10,0,-180); // drawing a mouth
      
	}
   
   public static void drawCrown(Graphics g)
	{
	   g.setColor(new Color(188,229,245)); // (137,207,240)
      g.fillArc(121,53,30,25,0,180); // crown
      
//////////////////////////////////// Embellishments      
      int x = 136;
      int y = 64;
      int xx = 120;
      int yy = 64;
      
      for(int k = 1; k < 6; k++)
      {
         g.setColor(new Color(72,146,244));
         g.drawLine(x,y,xx,yy);
         yy -= 5;
         xx += 4;
      }
      
      int x1 = 136;
      int y1 = 64;
      int x2 = 158;
      int y2 = 64;
      
      for(int a = 1; a < 6; a++)
      {
         g.setColor(new Color(72,146,244));
         g.drawLine(x1,y1,x2,y2);
         y2 -= 4;
         x2 -= 4;
      }
      
//////////////////////////////////// Embellishments 
 	
	}
   
	public static void drawArm(Graphics g)
	{
      g.setColor(new Color(236,188,180));  ///////// Left hand
      g.fillOval(90,220,20,25);   
       
      g.setColor(new Color(198,230,251)); 
	   Polygon leftSleeve = new Polygon();	  ////// Left Sleeve  
      leftSleeve.addPoint(100,135);
      leftSleeve.addPoint(115,225);
      leftSleeve.addPoint(75,225);
      g.fillPolygon(leftSleeve);
                 
      g.setColor(new Color(198,230,251)); 
	   Polygon rightSleeve = new Polygon();	  ////// Right Sleeve
      rightSleeve.addPoint(175,135);
      rightSleeve.addPoint(200,190);
      rightSleeve.addPoint(240,170);
      rightSleeve.addPoint(265,170);
      rightSleeve.addPoint(200,220);
      rightSleeve.addPoint(190,220);
      rightSleeve.addPoint(165,190);
      g.fillPolygon(rightSleeve);
      
      g.setColor(new Color(236,188,180));
      g.fillOval(245,160,25,15);             ////// Right hand
      
////////////////////////////////////////////////// Magic!!       
      g.setColor(new Color(198,230,251));
      g.drawLine(260,155,250,125);        //// Arctic Blue
      g.drawLine(270,130,290,110);  
      g.drawLine(290,105,300,100);
      g.drawLine(300,118,295,125); 
      ///////
      g.drawLine(245,105,240,93);
      g.drawLine(235,100,230,110);     
      
      g.setColor(new Color(72,146,244));
      g.drawLine(268,160,270,140);         //// sky Blue
      g.drawLine(260,135,275,100);
      g.drawLine(280,110,295,95);
      g.drawLine(291,110,310,115);
      ///////
      g.drawLine(255,120,243,107);
      g.drawLine(240,100,225,87);
      g.drawLine(225,105,228,115);
      
      g.setColor(new Color(137,207,240));     ////// Dress Blue
      g.drawLine(265,155,250,65);
      g.drawLine(255,155,275,65);
///////////////////////////////////////////////////  Magic!!!     
	}
}   
