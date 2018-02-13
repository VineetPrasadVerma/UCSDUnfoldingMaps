import processing.core.*;
public class MyPApplet extends PApplet{
	PImage img; 
	public void setup() {
		size(200,200);
		background(200);
		img = loadImage("palmTrees.jpg","jpg");
	}
	public void draw() {
		img.resize(0, height);
		image(img,0,0);
		ellipse(width/4,height/5,width/5,height/5);
		fill(255,209,0);
	}
	
}
