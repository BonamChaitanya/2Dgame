package main;

import charactersPkg.Player;

import javax.swing.*;
import java.awt.*;
import tile.tileManager;
public class GamePanel extends JPanel implements Runnable {

      final int originalTileSize = 24; // 16x16 bit tile
      final int scale = 2;

      public final int tileSize = originalTileSize * scale;
      public  final int maxScreenCol = 16;
      public  final int maxScreenRow = 12;
      final int screenWidth = tileSize *  maxScreenCol;
      final int screenHeight = tileSize *  maxScreenRow;

       //FPS
    int FPS = 60;
    
    tileManager tileM = new tileManager(this);
    
      KeyHandler keyH = new KeyHandler();
      Thread gameThread;
      Player player = new Player(this,keyH);

//      int playerX = 100;
//      int playerY = 100;
//      int playerSpeed = 4;

     public GamePanel() {
         this.setPreferredSize(new Dimension(screenWidth,screenHeight));
         this.setBackground(Color.white);
         this.setDoubleBuffered(true);
         this.addKeyListener(keyH);
         this.setFocusable(true);
     }

     public void startGameThread() {
         gameThread = new Thread(this);
         gameThread.start();
     }

//   @Override
//    public void run() {
//
//         double drewInterval = 1000000000/FPS; // 0.01666 sec
//         double nextDrawTime = System.nanoTime() + drewInterval;
//
//
//         while (gameThread != null) {
//
//
//              update();
//
//              repaint();
//
//              try {
//                  double remainingTime = nextDrawTime - System.nanoTime();
//                  remainingTime = remainingTime/1000000;
//
//                  if(remainingTime <0) {
//                      remainingTime = 0;
//                  }
//                  Thread.sleep((long) remainingTime);
//
//                  nextDrawTime += drewInterval;
//
//              } catch (InterruptedException e) {
//                  e.printStackTrace();
//              }
//
//          }
//    }

    public  void run() {

         double drawInterval = 1000000000/FPS;
         double delta = 0;
         long lastTime = System.nanoTime();
         long currentTime;
         long timer = 0;
         int drewCount =0;

         while (gameThread != null){
             currentTime = System.nanoTime();

             delta += (currentTime - lastTime) /drawInterval;
             timer += (currentTime - lastTime);
             lastTime = currentTime;

             if(delta >=1) {
                 update();
                 repaint();
                 delta--;
                 drewCount++;
             }

             if(timer >= 1000000000) {
                 System.out.println("FPS:"+ drewCount);
                 drewCount=0;
                 timer=0;

             }
         }

    }

    public void update() {

         player.update();


    }
    public void paintComponent(Graphics g) {
         super.paintComponent(g);

         Graphics2D g2 = (Graphics2D)g;

         
         tileM.drew(g2);
         
         player.drew(g2);
         


         g2.dispose();

    }
}
