package LUDO_BUILD;

import java.awt.Graphics2D;

public class Player {
   int height;
   int width;
   int status = -1;
   int coin = 0;
   Pawn[] pa = new Pawn[4];

   public Player(int height, int width) {
      for(int i = 0; i < 4; ++i) {
         this.pa[i] = new Pawn(height, width);
      }

   }

   public void draw(Graphics2D g) {
   }
}
