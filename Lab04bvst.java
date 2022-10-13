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

        int x175  = 175;
        int y25  = 25;
        int x425  = 425;
        int xy225 = 225;
        int y125  = 125;
        int x475  = 475;
        int y375  = 375;


        g.drawLine(x175, y25, x425, y25); // background line top
        g.drawLine(xy225, y125, x475, y125); // foreground line bottom top
        g.drawLine(x175, y25, xy225, y125); // background left line top
        g.drawLine(x425, y25, x475, y125); // background line right top


        g.drawLine(x175, xy225, x425, xy225); // background line bottom
        g.drawLine(xy225, y375, x475, y375); // foreground line bottom
        g.drawLine(x175, xy225, xy225, y375); // background left line
        g.drawLine(x425, xy225, x475, y375); // background line right

        g.drawLine(x175, y25, x175, xy225); // background vertical line left
        g.drawLine(x425, y25, x425, xy225); // background vertical line right
        g.drawLine(xy225, y125, xy225, y375); // foreground vertical line left
        g.drawLine(x475, y125, x475, y375); // foreground vertical line right



        // DRAW SPHERE

        g.drawOval(750, 800, 800, 750);



        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE



        // DRAW APCS



        // DRAW PACMEN FLOWER



    }

}


