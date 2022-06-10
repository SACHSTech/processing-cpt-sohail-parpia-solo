import processing.core.PApplet;



public class Sketch extends PApplet {
  // Global Variables

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
    background(0);
    rectMode(CENTER);
    textAlign(CENTER);
}
  



/**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

  //Soccer Field
  background(21, 143, 82); 
  noFill();
  stroke(255);
  strokeWeight(4); 
  rect(400, 250, 800, 500); 
  line(400, 0, 400, 500); 
  
  //Soccer Ball
  noStroke();
  fill(255, 217, 28); 
  rect(ballX, ballY, 20, 20);

  // Main Player
  noStroke();
	fill(255);
	rect(player1X, player1Y, pWidth, pHeight);
}




}















                                                                                                  
    
  
    