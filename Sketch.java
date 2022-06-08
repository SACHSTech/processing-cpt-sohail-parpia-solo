import processing.core.PApplet;

public class Sketch extends PApplet {
  // Global Variables

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
  int player1Wins;
  int player2Wins;


  // Keyboard Variables
  int keyPressed;

  //Other Variables
  int stage = 0;



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
    background(255, 59, 20);
    rectMode(CENTER);
    imageMode(CENTER);
    textAlign(CENTER);
}



  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	
	//Soccer Field
	background(75, 255, 10); 
	noFill();
	stroke(255);
	strokeWeight(2); 
	rect(400, 250, 800, 500); 
	line(400, 0, 400, 500); 

}
}







                                                                                                  
    
  
    