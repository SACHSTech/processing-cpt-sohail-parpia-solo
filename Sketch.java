import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  // Global Variables

  // Game Variables
  int r;
  int d;
  int e;
  int e1;

  // Keyboard Variables
  int keyPressed;

  // Screens
  int stage;

  // Image
  PImage img;

  
 



  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
    }
  

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

  public void setup() {

    img = loadImage("CITY.jpg");
    img.resize(width, height);

    rectMode(CENTER);
    textAlign(CENTER);
  }

/**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    image(img, 0, 0);

    if(stage == 0){
      splash();
    }
    
    if(stage == 1){ 
      game();
    }
  }


  private void splash() {
    //Home Screen
 img = loadImage("Fantasy Land.jpg"); 
 img.resize(width, height);

	
	//Name of Game
	fill(255,0,0);
	textSize(60); 
	text("DANGER FALL", 400, 150);
	
	//START
	fill(255, 250, 0);
	textSize(40); 
	text("r To Start", 400, 400);

}

  private void game() {
  }
}



  
 





















                                                                                                  
    
  
    