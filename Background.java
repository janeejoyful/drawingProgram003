// Lab07stv110.java
// Janee Yeak
// 5 November 2020
// This program creates the class 'Background'

import java.awt.*;
import java.applet.*;

class Background
{
   public static void snowyGround(Graphics g)
	{
     g.setColor(new Color(228,247,255));  
     g.fillRect(0,400,1100,400);     /// Ground 
	}
   public static void bareTree(Graphics g)
	{
      g.setColor(new Color(173,140,140));
      g.fillRect(900,10,15,410);    //// Tree #1
              
      g.drawLine(900,380,750,345);   //// Branches #1
      g.drawLine(900,345,760,310);   //
      g.drawLine(900,310,770,275);   //
      g.drawLine(900,275,780,240);   //
      g.drawLine(900,240,790,205);   //
      g.drawLine(900,205,800,170);   //
      g.drawLine(900,170,810,135);   //
      g.drawLine(900,145,820,100);   //
      g.drawLine(900,110,830,65);    //
      g.drawLine(900,75,840,30);     // 
      g.drawLine(900,45,850,10);     //
      
      
      g.drawLine(910,380,1070,360);   //// Branches #2
      g.drawLine(910,345,1060,325);   //
      g.drawLine(910,310,1050,290);   //
      g.drawLine(910,275,1040,255);   //
      g.drawLine(910,240,1030,220);   //
      g.drawLine(910,205,1020,185);   //
      g.drawLine(910,170,1010,150);   //
      g.drawLine(910,145,1000,115);   //
      g.drawLine(910,110,990,80);     //
      g.drawLine(910,75,980,45);      // 
      g.drawLine(910,45,970,10);      // 

     
    	}  
   
   public static void nightSky(Graphics g)
	{
      g.setColor(new Color(60,60,120)); //// Night Sky
      g.fillRect(0,0,1100,400);
                
	}
   public static void nightStars(Graphics g)
	{
      for(int j = 1; j < 101; j++)////////////////// Randomly placed stars
      {
         int hi = (int)(Math.random() * 1096);    //
         int hihi = (int)(Math.random() * 296);   //
         g.setColor(new Color(251,255,255));      //
         g.fillRect(hi,hihi,3,3);                 //  
      }
          
	}

}
