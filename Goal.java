import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Goal {
	private BufferedImage imageRunning;
	private BufferedImage imageOver;
	private BufferedImage imageCurrent;
	
	private int x;
	private int y;
	

	public Goal(int xcoor, int ycoor) {
		
		x = xcoor;
		y = ycoor;
		
		try {
		this.imageRunning = ImageIO
				.read(new File("A2-image-files/goal-alive.png"));
		this.imageOver = ImageIO
				.read(new File("A2-image-files/goal-dead.png"));
		} catch (IOException e) {
		e.printStackTrace();
		}
		this.imageCurrent = this.imageRunning;
	}

	public BufferedImage getCurrentImage() {
		return this.imageCurrent;
	}
	
	public void die() {
		this.imageCurrent = this.imageOver;
	}

	public int  getX(){
		return x;
	}

	public int getY() {
		return y-250;
	}
}

