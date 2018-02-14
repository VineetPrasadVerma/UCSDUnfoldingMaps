import processing.core.*;
public class MyPApplet extends PApplet{
	PImage img; 
	
	public void setup() {
		
		size(200,200);
		background(200);
		img = loadImage("palmTrees.jpg","jpg");
		img.resize(0, height);
		image(img,0,0);
	}
	
	public void draw() {
		
		int[] color = sunColorSec(second());
		fill(color[0], color[1], color[2]);
		ellipse(width/4,height/5,width/5,height/5);
		
	}
	
	public int[] sunColorSec(float seconds) {
		
		int rgb[] =  new int[3];
		float differFrom30 = Math.abs(30 - seconds);
		float ratio = differFrom30/30;
		rgb[0] = (int)(ratio*255);
		rgb[1] = (int)(ratio*255);
		rgb[2] = 0;
		return rgb;
		
	}
	
	
	
}
