import processing.core.PApplet;

public class Sketch extends PApplet {
  // Global Variables

  // Ball Variables
  int ballX = 400;
  int ballY = 300;
  float ballSpeed = 2;
  float ballDirectionX = -2;
  float ballDirectionY = -2;


  // Player Variables
  int player1X = 25;
  int player1Y = 250;
  int player2X = 780;
  int player2Y = 245;

  // Location of Player
  int playerWidth = 30;
  int playerHeight = 25;  

  // Speed of Player
  int player1Speed = 4;

  // Scoreboard
  int score;

  // Keyboard Variables
  int keyPressed;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 450);
    }
  

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

  public void setup() {
    background(255, 59, 20);
    rectMode(CENTER);
    imageMode(CENTER);
    //close setup
  }


  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

  // Soccer Field
  background(52, 235, 94);
  noFill();
  stroke(255);
  strokeWeight(4);
  rect(400, 250, 800, 500);
	line(400, 0, 400, 500); 

  // Soccer Ball
  noStroke();
  fill(255);
  rect(ballX, ballY, 25, 25);

  // Player
  noStroke();
  fill(255, 45, 8);
  rect(player1X, player1Y, playerWidth, playerHeight);

  // Net
  fill(0);

}


  public void keyPressed() {
    if (key == 'w') {
     player1Y = player1Y -player1Speed;
     	}//close w pressed
       
    if (key == 'a') {
      player1Y = player1Y + player1Speed;
      }//close a pressed

    if (key == 's') {
      player1X = player1X - player1Speed;
      }//close s pressed
    
    if (key == 'd') {
      player1X = player1X + player1Speed;
      }//close d pressed
  

    


}
}

                                                                                                  
    
  
    