import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  // Global Variables

  // Lava
  int L1X=0;
  
  // Blocks
  int B1=10;

  // Locations
  int e1=200;
  int e2=200;

  // Keyboard Variables
  boolean keyPressed;

  // Screens
  int stage;

  // Image
  PImage img;




  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 600);
    }
  

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

  public void setup() {
    img = loadImage("Dark City.jpg");
    img.resize(width, height);

    rectMode(CENTER);
    textAlign(CENTER);

  }

/**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
  }
}
    




  
 





















                                                                                                  
    
  
    