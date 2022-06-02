import processing.core.PApplet;

public class Sketch extends PApplet {
  // Game Settings
 int x = 250;
 int y = 350;
 int speedX = 4;
 int speedY = -4;
 int paddleX = 250;
 int paddleY = 350;
 int paddle_width_half = 45;
 int score = 0;
 int level = 1;
 int waitTime = 1;
 int i;
 int bricks;




  

	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
    rectMode(CENTER);
    for (int i = 0; i<20; i++) {
      bricks{i} = 2;      
  }
}


  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 255, 204);
  
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
  }
}
