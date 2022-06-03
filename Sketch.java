import processing.core.PApplet;

public class Sketch extends PApplet {
  // Game Variables

 float[]brickX = new float[20];
 int x = 250;
 int y = 350;
 int speedX = 4;
 int speedY = -4;
 int paddleX = 250;
 int paddleY = 350;
 int score = 0;
 int level = 1;
 int waitTime = 1;
 int i;
 int x_Temp;
 int y_Temp;
 int blocks_Gone;
 

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
    rectMode(CENTER);
    }
  

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 0, 0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    x = x + speedX;
    y = y + speedY;

    if (x>width || x<0)  
    speedX = -speedX;

  if (y<0)
    speedY = -speedY;
  }