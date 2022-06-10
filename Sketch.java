import processing.core.PApplet;
import processing.core.PImage;


public class Sketch extends PApplet {
  // Global Variables

  // Main Screen Image
  PImage img;

  // Soccer Ball Variables
  float ballX = 400;
  float ballY = 300;
  float ballSpeed = 1;
  float ballDirectionX = -1;
  float ballDirectionY = -1;

  // Player Variables
  int player1X = 25;
  int player1Y = 250;
  int player2X = 780;
  int player2Y = 245;

  // Location of Player
  int pWidth = 30;
  int pHeight = 25;  

  // Speed of Player
  int playerSpeed = 6;

  // Scoreboard
  int playerScore;
  int player1Score;

  // Wins
  int player11Wins;

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
  
  if(stage == 2){
    splash();
  }//close 0
  
  if(stage == 0){ 
    game(); 
  }//close 0
  }


private void game() {
}


private void splash() {

// Home Screen Image
  img = loadImage("UEFA-Champions-League.jpg");
  img.resize(width, height);

    //START
  fill(225, 255, 0);
  textSize(40); 
  text("Space To Begin", 400, 400);

}//close splash



}















                                                                                                  
    
  
    