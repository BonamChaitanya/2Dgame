package tile;

import java.awt.Graphics2D;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class tileManager {
	
	GamePanel gp;
	Tile[] tile;
	
	public tileManager(GamePanel gp) {
		
		this.gp = gp;
		
		tile = new Tile[10];
		
		getTileImage();
	}
	
	public void getTileImage() {
		try {
			
			tile[0] = new Tile();
			tile[0].image = ImageIO.read(getClass().getResourceAsStream("/tiles/grass .png"));
					
			
			
			tile[1] = new Tile();
			tile[1].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall.png"));
					
			tile[2] = new Tile();		
			tile[2].image = ImageIO.read(getClass().getResourceAsStream("/tiles/water.png"));
					
			tile[3] = new Tile();		
			tile[3].image = ImageIO.read(getClass().getResourceAsStream("/tiles/flowergrass.png"));
		}		
		catch(IOException e) {
			
			e.printStackTrace();
		}
		
		
		}
	
	public void drew(Graphics2D g2) {
		
		int col = 0;
		int row = 0;
		int x = 0;
		int y = 0;
		
		while(col < gp.maxScreenCol && row < gp.maxScreenRow ) {
			
			g2.drawImage(tile[0].image,x,y,gp.tileSize,gp.tileSize, null);
			col++;
			
			x += gp.tileSize;
			
			if(col == gp.maxScreenCol) {
				col = 0;
				x = 0;
				row++;
				y += gp.tileSize;
			}
		
		}
		
//		g2.drawImage(tile[1].image, 0, 0,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 0, 48,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 0, 48*2,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 0, 48*3,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 0, 48*4,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 0, 48*5,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 0, 48*6,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 48*5, 0,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 48*6, 0,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 48*6, 48,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 48, 48*6,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 48*2, 48*6,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 48*3, 48*6,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 48*4, 48*6,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 48*5, 48*6,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[0].image, 48*6, 48*2,gp.tileSize,gp.tileSize,null);
//	
//		g2.drawImage(tile[1].image, 48*6, 48*3,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 48*6, 48*4,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 48*6, 48*5,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 48*6, 48*6,gp.tileSize,gp.tileSize,null);
//		
//		g2.drawImage(tile[1].image, 48, 0,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 48*2, 0,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 48*3, 0,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[1].image, 48*4, 0,gp.tileSize,gp.tileSize,null);
//		
//		
//	
//		g2.drawImage(tile[0].image, 48, 48,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[0].image, 48, 48*2,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[0].image, 48, 48*3,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[0].image, 48, 48*4,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[3].image, 48, 48*5,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[0].image, 48, 48,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[0].image, 48*2, 48,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[3].image, 48*3, 48,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[0].image, 48*4, 48,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[0].image, 48, 48,gp.tileSize,gp.tileSize,null);
//		
//		g2.drawImage(tile[0].image, 48*5, 48,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[0].image, 48*5, 48*2,gp.tileSize,gp.tileSize,null);
//
//		
//		
//		g2.drawImage(tile[0].image, 48*2, 48,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[0].image, 48*2, 48*2,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[0].image, 48*2, 48*3,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[0].image, 48*2, 48*4,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[0].image, 48*2, 48*5,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[0].image, 48*2, 48,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[0].image, 48*2, 48*2,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[0].image, 48*3, 48*2,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[0].image, 48*4, 48*2,gp.tileSize,gp.tileSize,null);
//		
//		
//		g2.drawImage(tile[2].image, 48*3, 48*3,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[2].image, 48*4, 48*3,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[2].image, 48*5, 48*3,gp.tileSize,gp.tileSize,null);
//	
//		
//		g2.drawImage(tile[2].image, 48*3, 48*4,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[2].image, 48*3, 48*5,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[2].image, 48*4, 48*4,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[2].image, 48*5, 48*4,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[2].image, 48*4, 48*5,gp.tileSize,gp.tileSize,null);
//		g2.drawImage(tile[2].image, 48*5, 48*5,gp.tileSize,gp.tileSize,null);
	
	}
}
