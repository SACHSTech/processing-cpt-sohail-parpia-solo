import processing.core.PApplet;

public class Sketch extends PApplet {
  // Global Variables

  // Ball Variables
  int ballX = 400;
  int ballY = 300;
  int ballSpeed = 2;
  int ballDirectionX = -2;
  int ballDirectionY = -2;
  


 

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
    }
  

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 0, 0);
    rectMode(CENTER);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
  }
}                                                                                                    
    
  
    