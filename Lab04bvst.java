// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.

import java.awt.*;
import java.applet.*;
import java.util.Queue;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {

        // DRAW CUBE

        int x175  = 175;
        int y25   = 25;
        int x425  = 425;
        int xy225 = 225;
        int y125  = 125;
        int x475  = 475;
        int y375  = 375;


        g.drawLine(x175, y25, x425, y25);     // background line top
        g.drawLine(xy225, y125, x475, y125);  // foreground line bottom top
        g.drawLine(x175, y25, xy225, y125);   // background left line top
        g.drawLine(x425, y25, x475, y125);    // background line right top


        g.drawLine(x175, xy225, x425, xy225); // background line bottom
        g.drawLine(xy225, y375, x475, y375);  // foreground line bottom
        g.drawLine(x175, xy225, xy225, y375); // background left line
        g.drawLine(x425, xy225, x475, y375);  // background line right

        g.drawLine(x175, y25, x175, xy225);   // background vertical line left
        g.drawLine(x425, y25, x425, xy225);   // background vertical line right
        g.drawLine(xy225, y125, xy225, y375); // foreground vertical line left
        g.drawLine(x475, y125, x475, y375);   // foreground vertical line right


        // DRAW SPHERE


        g.drawOval(200, 50, 250, 275);  // full circle

            // Longitude lines

        g.drawOval(200, 95, 250, 185);   // largest oval
        g.drawOval(200, 130, 250, 115);  // second oval
        g.drawOval(200, 160, 250, 55);   // third oval

            // Latitude lines

        g.drawOval(235, 50, 175, 275);  // first oval
        g.drawOval(272, 50, 100, 275);  // second oval
        g.drawOval(300, 50, 45, 275);   // third oval


        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE


        g.drawOval(650, 266, 260, 260);  // outer circle

        g.drawLine(878, 310, 650, 400); // top line
        g.drawLine(650, 400, 750, 522); // bottom line
        g.drawLine(750, 522, 878, 310); // connecting line

        g.drawOval(687, 368, 112, 112);  // inner circle


        // DRAW APCS


            // A;

        g.fillRect(50, 700, 50,250);
        g.fillRect(50, 700, 100,45);
        g.fillRect(150, 700, 50,250);
        g.fillRect(50, 790, 100,45);

            // P;

        g.fillRect(250, 700, 50,250);
        g.fillRect(250, 700, 100,45);
        g.fillRect(350, 700, 50,135);
        g.fillRect(250, 790, 100,45);

            // C;

        g.fillRect(450, 700, 50,250);
        g.fillRect(450, 700, 150,45);
        g.fillRect(450, 910, 150,45);

            // S;

        g.fillRect(650, 700, 50,135);
        g.fillRect(650, 700, 150,45);
        g.fillRect(650, 910, 150,45);
        g.fillRect(650, 805, 150,45);
        g.fillRect(750, 810, 50,135);


        // DRAW PACMEN FLOWER

        g.fillArc(350, 435, 100,100, 135, 270);
        g.fillArc(350, 550, 100,100, -135, -270);
        g.fillArc(410, 490, 100,100, 45, 270);
        g.fillArc(290, 490, 100,100, 225, 270);

    }

}


