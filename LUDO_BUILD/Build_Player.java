package LUDO_BUILD;

import java.awt.Graphics2D;

public class Build_Player {
   Player[] pl = new Player[4];
   int[][] initialx = new int[][]{{1, 1, 3, 3}, {10, 10, 12, 12}, {10, 10, 12, 12}, {1, 1, 3, 3}};
   int[][] initialy = new int[][]{{1, 3, 1, 3}, {1, 3, 1, 3}, {10, 12, 10, 12}, {10, 12, 10, 12}};

   public Build_Player(int height, int width) {
      for(int i = 0; i < 4; ++i) {
         this.pl[i] = new Player(height, width);
      }

   }

   public void draw(Graphics2D g) {
      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            this.pl[i].pa[j].draw(g, this.initialx[i][j], this.initialy[i][j], i);
         }
      }

   }
}
