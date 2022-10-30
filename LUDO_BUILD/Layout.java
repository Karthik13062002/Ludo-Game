package LUDO_BUILD;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Layout {
  int x;
  
  int y;
  
  int width;
  
  int height;
  
  public Layout(int xi, int yi) {
    this.x = xi;
    this.y = yi;
    this.width = 30;
    this.height = 30;
  }
  
  public void draw(Graphics2D g) {
    g.setColor(Color.WHITE);
    g.fillRect(this.x, this.y, 15 * this.width, 15 * this.height);
    int i;
    for (i = 0; i < 6; i++) {
      g.setColor(Color.RED);
      g.fillRect(this.x + i * this.width, this.y, this.width, this.height);
      g.fillRect(this.x, this.y + i * this.height, this.width, this.height);
      g.fillRect(this.x + i * this.width, this.y + 5 * this.height, this.width, this.height);
      g.fillRect(this.x + 5 * this.width, this.y + i * this.height, this.width, this.height);
      g.setColor(Color.GREEN);
      g.fillRect(this.x + (i + 9) * this.width, this.y, this.width, this.height);
      g.fillRect(this.x + 9 * this.width, this.y + i * this.height, this.width, this.height);
      g.fillRect(this.x + (i + 9) * this.width, this.y + 5 * this.height, this.width, this.height);
      g.fillRect(this.x + 14 * this.width, this.y + i * this.height, this.width, this.height);
      g.setColor(Color.YELLOW);
      g.fillRect(this.x + (i + 9) * this.width, this.y + 9 * this.height, this.width, this.height);
      g.fillRect(this.x + 9 * this.width, this.y + (i + 9) * this.height, this.width, this.height);
      g.fillRect(this.x + (i + 9) * this.width, this.y + 14 * this.height, this.width, this.height);
      g.fillRect(this.x + 14 * this.width, this.y + (i + 9) * this.height, this.width, this.height);
      g.setColor(Color.BLUE);
      g.fillRect(this.x + i * this.width, this.y + 9 * this.height, this.width, this.height);
      g.fillRect(this.x, this.y + (i + 9) * this.height, this.width, this.height);
      g.fillRect(this.x + i * this.width, this.y + 14 * this.height, this.width, this.height);
      g.fillRect(this.x + 5 * this.width, this.y + (i + 9) * this.height, this.width, this.height);
    } 
    for (i = 1; i < 6; i++) {
      g.setColor(Color.RED);
      g.fillRect(this.x + i * this.width, this.y + 7 * this.height, this.width, this.height);
      g.setColor(Color.YELLOW);
      g.fillRect(this.x + (8 + i) * this.width, this.y + 7 * this.height, this.width, this.height);
      g.setColor(Color.GREEN);
      g.fillRect(this.x + 7 * this.width, this.y + i * this.height, this.width, this.height);
      g.setColor(Color.BLUE);
      g.fillRect(this.x + 7 * this.width, this.y + (8 + i) * this.height, this.width, this.height);
    } 
    g.setColor(Color.RED);
    g.fillRect(this.x + 1 * this.width, this.y + 6 * this.height, this.width, this.height);
    g.setColor(Color.YELLOW);
    g.fillRect(this.x + 13 * this.width, this.y + 8 * this.height, this.width, this.height);
    g.setColor(Color.GREEN);
    g.fillRect(this.x + 8 * this.width, this.y + 1 * this.height, this.width, this.height);
    g.setColor(Color.BLUE);
    g.fillRect(this.x + 6 * this.width, this.y + 13 * this.height, this.width, this.height);
    int temp1 = this.x + 45, temp2 = this.y + 45;
    for (int j = 0; j < 2; j++) {
      for (int m = 0; m < 2; m++) {
        g.setColor(Color.RED);
        g.fillRect(temp1 + 2 * j * this.width, temp2 + 2 * m * this.height, this.width, this.height);
        g.setColor(Color.YELLOW);
        g.fillRect(temp1 + 2 * j * this.width + 9 * this.width, temp2 + 2 * m * this.height + 9 * this.height, this.width, this.height);
        g.setColor(Color.GREEN);
        g.fillRect(temp1 + 2 * j * this.width + 9 * this.width, temp2 + 2 * m * this.height + 0 * this.height, this.width, this.height);
        g.setColor(Color.BLUE);
        g.fillRect(temp1 + 2 * j * this.width + 0 * this.width, temp2 + 2 * m * this.height + 9 * this.height, this.width, this.height);
      } 
    } 
    g.setColor(Color.RED);
    int[] xpoints0 = { this.x + 6 * this.width, this.x + 6 * this.width, this.x + 15 + 7 * this.width };
    int[] ypoints0 = { this.y + 6 * this.height, this.y + 9 * this.height, this.y + 15 + 7 * this.width };
    int npoints = 3;
    g.fillPolygon(xpoints0, ypoints0, npoints);
    g.setColor(Color.YELLOW);
    int[] xpoints1 = { this.x + 9 * this.width, this.x + 9 * this.width, this.x + 15 + 7 * this.width };
    int[] ypoints1 = { this.y + 6 * this.height, this.y + 9 * this.height, this.y + 15 + 7 * this.width };
    int npoints1 = 3;
    g.fillPolygon(xpoints1, ypoints1, npoints1);
    g.setColor(Color.GREEN);
    int[] xpoints2 = { this.x + 6 * this.width, this.x + 9 * this.width, this.x + 15 + 7 * this.width };
    int[] ypoints2 = { this.y + 6 * this.height, this.y + 6 * this.height, this.y + 15 + 7 * this.width };
    int npoints2 = 3;
    g.fillPolygon(xpoints2, ypoints2, npoints2);
    g.setColor(Color.BLUE);
    int[] xpoints3 = { this.x + 6 * this.width, this.x + 9 * this.width, this.x + 15 + 7 * this.width };
    int[] ypoints3 = { this.y + 9 * this.height, this.y + 9 * this.height, this.y + 15 + 7 * this.width };
    int npoints3 = 3;
    g.fillPolygon(xpoints3, ypoints3, npoints3);
    g.setStroke(new BasicStroke(2.0F));
    g.setColor(Color.BLACK);
    int k;
    for (k = 0; k < 3; k++) {
      for (int m = 0; m < 6; m++) {
        g.drawRect(this.x + (k + 6) * this.width, this.y + m * this.height, this.width, this.height);
        g.drawRect(this.x + m * this.width, this.y + (k + 6) * this.height, this.width, this.height);
        g.drawRect(this.x + (k + 6) * this.width, this.y + (m + 9) * this.height, this.width, this.height);
        g.drawRect(this.x + (m + 9) * this.width, this.y + (k + 6) * this.height, this.width, this.height);
      } 
    } 
    g.drawRect(this.x + 1 * this.width, this.y + 1 * this.height, 4 * this.width, 4 * this.height);
    g.drawRect(this.x + 10 * this.width, this.y + 1 * this.height, 4 * this.width, 4 * this.height);
    g.drawRect(this.x + 1 * this.width, this.y + 10 * this.height, 4 * this.width, 4 * this.height);
    g.drawRect(this.x + 10 * this.width, this.y + 10 * this.height, 4 * this.width, 4 * this.height);
    g.drawRect(this.x, this.y, 15 * this.width, 15 * this.height);
    for (k = 0; k < 2; k++) {
      for (int m = 0; m < 2; m++) {
        g.drawRect(temp1 + 2 * k * this.width, temp2 + 2 * m * this.height, this.width, this.height);
        g.drawRect(temp1 + 2 * k * this.width + 9 * this.width, temp2 + 2 * m * this.height + 9 * this.height, this.width, this.height);
        g.drawRect(temp1 + 2 * k * this.width + 9 * this.width, temp2 + 2 * m * this.height + 0 * this.height, this.width, this.height);
        g.drawRect(temp1 + 2 * k * this.width + 0 * this.width, temp2 + 2 * m * this.height + 9 * this.height, this.width, this.height);
      } 
    } 
    g.drawPolygon(xpoints0, ypoints0, npoints);
    g.drawPolygon(xpoints1, ypoints1, npoints1);
    g.drawPolygon(xpoints2, ypoints2, npoints2);
    g.drawPolygon(xpoints3, ypoints3, npoints3);
    g.drawOval(this.x + 5 + 6 * this.width, this.y + 5 + 2 * this.height, this.width - 10, this.height - 10);
    g.drawOval(this.x + 5 + 12 * this.width, this.y + 5 + 6 * this.height, this.width - 10, this.height - 10);
    g.drawOval(this.x + 5 + 8 * this.width, this.y + 5 + 12 * this.height, this.width - 10, this.height - 10);
    g.drawOval(this.x + 5 + 2 * this.width, this.y + 5 + 8 * this.height, this.width - 10, this.height - 10);
    g.setFont(new Font("serif", 1, 40));
    g.drawString("Player 1", 90, 35);
    g.drawString("Player 2", 370, 35);
    g.drawString("Player 4", 90, 540);
    g.drawString("Player 3", 370, 540);
    g.drawString("Instruction:", 550, 300);
    g.drawString("1.Press enter to roll dice.", 550, 350);
    g.drawString("2.Click on coin to move.", 550, 400);
  }
}