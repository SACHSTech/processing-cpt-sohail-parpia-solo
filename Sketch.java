import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  // Global Variables

  // Images
  PImage img;

  // Ball Variables
  float ballX = 400;
  float ballY = 300;
  float ballSpeed = 1;
  float ballDirectionX = -1;
  float ballDirectionY = -1;


  // Player Variables
  int p1X = 25;
  int p1Y = 250;
  int p2X = 780;
  int p2Y = 245;

  // Location of Player
  int pWidth = 30;
  int pHeight = 25;  

  // Speed of Player
  int pSpeed = 6;

  // Scoreboard
  int pScore;
  int p1Score;

  // Wins
  int p11Wins;
  int p2Wins;


  // Keyboard Variables
  int keyPressed;

  // Screens
  int stage;
  


  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 500);
    }
  

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

  public void setup() {
    img = loadImage("UEFA-Champions-League.jpg");
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
	}//close 0
	
	if(stage == 1){ 
		game(); 
	}//close 1
  }


public void game() {
  //call functions
	keyTyped();
	
	
	//Soccer Field
	background(0); 
	noFill();
	stroke(255);
}





public void splash() {
  img = loadImage("UEFA-Champions-League.jpg");
    img.resize(width, height);

  	//START
	fill(225, 255, 0);
	textSize(40); 
	text("Space To Begin", 400, 400);

}//close splash



public void keyPressed(){
  if (keyCode == 'w') {
    p1Y -= pSpeed;
  }
  if (keyCode == 'a') {
    p1X -= pSpeed;
  }
  if (keyCode == 's') {
    p1Y += pSpeed;
  }
  if (keyCode == 'd') {
    p1X += pSpeed;
  }
  if (keyCode == 'e' ){
  stage = 0;
  }//close space
}
}












                                                                                                  
    
  
    