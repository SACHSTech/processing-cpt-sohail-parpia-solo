import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  // Global Variables

  float S = 200;
  float B = 50;
  int score = 0;
  float locX = 0 + (B/2);
  int gX = 1;
  float speedX = 10;
  float locY = 0 + (B/2);
  int dirY = 1;
  float speedY = 10;

  // Image
  PImage img;


  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 500);
    }
  

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

  public void setup() {
    background (225, 0, 255);
    strokeWeight(4);
  }




/**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
  }
}
 


  
 





















                                                                                                  
    
  
    