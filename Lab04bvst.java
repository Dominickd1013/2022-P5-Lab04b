// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE

        g.drawLine(300, 150, 550, 150); // background line top
        g.drawLine(350, 250, 600, 250); // foreground line bottom top
        g.drawLine(300, 150, 350, 250); // background left line top
        g.drawLine(550, 150, 600, 250); // background line right top


        g.drawLine(300, 350, 550, 350); // background line bottom
        g.drawLine(350, 500, 600, 500); // foreground line bottom
        g.drawLine(300, 350, 350, 500); // background left line
        g.drawLine(550, 350, 600, 500); // background line right

        g.drawLine(300, 150, 300, 350); // background vertical line left
        g.drawLine(550, 150, 550, 350); // background vertical line right
        g.drawLine(350, 250, 350, 500); // foreground vertical line left
        g.drawLine(600, 250, 600, 500); // foreground vertical line right



        // DRAW SPHERE

        g.drawOval(750, 750, 500, 500,);




        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE



        // DRAW APCS



        // DRAW PACMEN FLOWER



    }

}


