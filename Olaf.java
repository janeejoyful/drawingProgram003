// Lab07stv110.java
// This is the 110 point version
// Janee Yeak
// 5 November 2020
// APCS, Chris Robinson
// This program creates the class 'Olaf'

import java.awt.*;
import java.applet.*;

public class Olaf
{
   public static void drawLegsArms(Graphics g)
	   {
         g.setColor(new Color(173,140,140)); /// Stick Arms
         g.drawLine(525,290,505,245);     // Left Arm
         g.drawLine(524,289,504,244);     // 
         g.drawLine(526,291,506,246);     //
         g.drawLine(565,290,585,245);  //// Right Arm
         g.drawLine(564,289,584,244);  ////
         g.drawLine(566,291,586,246);  ////
         
         g.setColor(new Color(243,255,254)); 
         g.fillOval(510,375,35,30);
         g.fillOval(550,375,35,30);
         g.setColor(new Color(50,50,50));
         g.drawOval(510,375,35,30);
         g.drawOval(550,375,35,30);
        
  	   }
            
   public static void drawBody(Graphics g)
	   {
         g.setColor(new Color(243,255,254)); // Body snowballs
         g.fillOval(500,300,85,85);          // and outlines
         g.setColor(new Color(45,41,48));    //
         g.drawOval(500,300,85,85);          //
         g.setColor(new Color(243,255,254)); //        
         g.fillOval(520,265,45,45);          //
         g.setColor(new Color(45,41,48));    //
         g.drawOval(520,265,45,45);          //      

         Polygon rock1 = new Polygon(); // First Stone
         rock1.addPoint(540,280);       //
         rock1.addPoint(550,280);       //
         rock1.addPoint(555,290);       //
         rock1.addPoint(550,300);       //
         rock1.addPoint(540,300);       //
         rock1.addPoint(535,290);       //
         g.fillPolygon(rock1);          //
         
         Polygon rock2 = new Polygon(); // Second Stone
         rock2.addPoint(540,320);       //
         rock2.addPoint(550,320);       //
         rock2.addPoint(555,330);       //
         rock2.addPoint(550,340);       //
         rock2.addPoint(540,340);       //
         rock2.addPoint(535,330);       //
         g.fillPolygon(rock2);          //
         
         Polygon rock3 = new Polygon(); // Third Stone
         rock3.addPoint(540,350);       //
         rock3.addPoint(550,350);       //
         rock3.addPoint(555,360);       //
         rock3.addPoint(550,370);       //
         rock3.addPoint(540,370);       //
         rock3.addPoint(535,360);       //
         g.fillPolygon(rock3);          // 

      }
      
      public static void drawHead(Graphics g)
	   {
         g.setColor(new Color(243,255,254)); // Head snowball
         g.fillOval(520,210,50,65);          //
         
         g.setColor(new Color(45,41,48)); // Outline
         g.drawOval(520,210,50,65);       // 
         
         g.setColor(new Color(50,50,50));     // Mouth
         g.fillArc(532,240,25,25,0,-180);     //
         g.setColor(new Color(243,255,254));  //
         g.fillRect(540,253,10,5);            //
         g.setColor(new Color(50,50,50));     //
         g.drawLine(540,253,550,253);         //
         
         g.setColor(new Color(255,131,0));    // Carrot Nose
         Polygon carrotNose = new Polygon();  //
         carrotNose.addPoint(542,235);        //
         carrotNose.addPoint(562,240);        //
         carrotNose.addPoint(542,245);        //
         g.fillPolygon(carrotNose);           //
         
         g.setColor(new Color(45,41,48)); // Eyes         
         g.fillRect(535,225,5,5);         //
         g.fillRect(554,225,5,5);         //
         
         g.setColor(new Color(173,140,140));  /// Hair
         g.drawLine(535,215,525,185);         /// 
         g.drawLine(534,214,524,184);         ///
         g.drawLine(536,216,526,186);         ///
         g.drawLine(545,215,545,190);         ///
         g.drawLine(544,214,544,189);         ///
         g.drawLine(546,216,546,191);         ///
         g.drawLine(550,215,560,180);         ///
         g.drawLine(551,216,561,181);         ///
         g.drawLine(549,214,559,179);         /// 
         
	   }

   
}

 
	



    
 