import processing.core.PApplet;

public class Sketch extends PApplet {
  // Global Variables
  int Height = 300;
  int Width = 300;
  int DOT_SIZE = 10;
  int ALL_DOTS = 900;
  int RANDOM_POSITION = 29;
  int DELAY = 150;
  int X[] = new int[ALL_DOTS];
  int Y[] = new int[ALL_DOTS];

	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  
  }
  
  // define other methods down here.
}