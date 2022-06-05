import processing.core.PApplet;

public class Sketch extends PApplet {
  // Global Variables

  // Ball Variables
  int ballX = 400;
  int ballY = 300;
  int ballSpeed = 2;
  int ballDirectionX = -2;
  int ballDirectionY = -2;


  // Player 1 Variables
  int player1X = 25;
  int player1Y = 250;

  // Player 2 Variables
  int player2X = 750;
  int player2Y = 65;

  // Player 1&2 Width and Height (Location)
  int playerWidth = 30;
  int playerHeight = 25;  

  // Player 1&2 (Speed)
  int player1Speed = 4;
  int player2Speed = 4;

  


  


 

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
    
  
    