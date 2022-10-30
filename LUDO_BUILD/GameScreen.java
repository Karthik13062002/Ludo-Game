package LUDO_BUILD;

import javax.swing.JFrame;

public class GameScreen {
   public static void main(String[] args) {
      JFrame jframe = new JFrame();
      jframe.setBounds(10, 10, 1000, 600);
      jframe.setTitle("LUDO");
      jframe.setResizable(false);
      jframe.setDefaultCloseOperation(3);
      GameMoves gm = new GameMoves();
      gm.setFocusable(true);
      gm.addKeyListener(gm);
      gm.addMouseListener(gm);
      jframe.add(gm);
      jframe.setVisible(true);
   }
}
