import java.util.Random;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;
import java.lang.*;


public class Sierpinski extends Canvas {
  public void paint (Graphics g) {

    Random r = new Random();

    int x1 = 512;                                                               //The seeds have been assigned to guarantee a more or less
    int y1 = 109;                                                               //equilateral triangle.
    int x2 = 146;
    int y2 = 654;
    int x3 = 876;
    int y3 = 654;
    int x = 512;                                                                //Initial x and y kind of in the middle of the canvas.
    int y = 382;

    for (int i = 0; i < 1000000; i++) {
      g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));    //Assigns random color to make it prettier looking.
      g.drawLine(x, y, x, y);
      int num = 1 + r.nextInt(3);                                               //Chooses randomly among one of the three sets.
      int dx = 0;
      int dy = 0;
      if (num == 1) {
        dx = x - x1;
        dy = y - y1;
      }
      else if (num == 2) {
        dx = x - x2;
        dy = y - y2;
      }
      else if (num == 3) {
        dx = x - x3;
        dy = y - y3;
      }
      x = x - dx/2;                                                             //Sets x and y values for next iteration.
      y = y - dy/2;
    }

  }

  public static void main (String[] args) {

      JFrame win = new JFrame("Sierpinski Triangle");
      win.setSize(1024, 768);
      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Sierpinski canvas = new Sierpinski();
      win.add(canvas);
      win.setVisible(true);

  }

}
