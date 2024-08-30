// Lab07stv110.java
// Janee Yeak's work
// 5 November 2020
// This program draws Elsa and Olaf in a snowy background from Frozen.
// The classes 'Elsa', 'Olaf' and 'Background' all have their own file.

import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class Lab07stv110 extends Applet
{
   
	public void init()
   {
      setSize(1100,800);
   }
   
	public void paint(Graphics g) 	
	{	
      Background.nightSky(g);
      Background.nightStars(g);
      Background.snowyGround(g);
      Background.bareTree(g);
      Elsa.drawDress(g);
      Elsa.drawNeck(g);
	   Elsa.drawHair(g);
		Elsa.drawFace(g);
      Elsa.drawCrown(g);	
      Elsa.drawArm(g);
      Olaf.drawLegsArms(g);
      Olaf.drawBody(g);
      Olaf.drawHead(g);
   }
}





