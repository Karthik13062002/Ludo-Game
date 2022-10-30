package LUDO_BUILD;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Pawn {
   int x = -1;
   int y = -1;
   int current = -1;
   int height;
   int width;

   public Pawn(int h, int w) {
      this.height = h;
      this.width = w;
   }

   public void draw(Graphics2D g, int i, int j, int play) {
      if (this.current == -1) {
         int temp1 = 80 + this.height / 2;
         int temp2 = 50 + this.width / 2;
         this.x = i;
         this.y = j;
         if (play == 0) {
            g.setColor(Color.RED);
         } else if (play == 1) {
            g.setColor(Color.GREEN);
         } else if (play == 2) {
            g.setColor(Color.YELLOW);
         } else if (play == 3) {
            g.setColor(Color.BLUE);
         }

         g.fillOval(temp1 + 5 + i * this.width, temp2 + 5 + j * this.height, this.width - 10, this.height - 10);
         g.setStroke(new BasicStroke(2.0F));
         g.setColor(Color.BLACK);
         g.drawOval(temp1 + 5 + i * this.width, temp2 + 5 + j * this.height, this.width - 10, this.height - 10);
      } else {
         int temp1 = 80;
         int temp2 = 50;
         this.x = Path.ax[play][this.current];
         this.y = Path.ay[play][this.current];
         if (play == 0) {
            g.setColor(Color.RED);
         } else if (play == 1) {
            g.setColor(Color.GREEN);
         } else if (play == 2) {
            g.setColor(Color.YELLOW);
         } else if (play == 3) {
            g.setColor(Color.BLUE);
         }

         g.fillOval(temp1 + 5 + this.x * this.width, temp2 + 5 + this.y * this.height, this.width - 10, this.height - 10);
         g.setStroke(new BasicStroke(2.0F));
         g.setColor(Color.BLACK);
         g.drawOval(temp1 + 5 + this.x * this.width, temp2 + 5 + this.y * this.height, this.width - 10, this.height - 10);
      }

   }
}
