import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  // Global Variables

  // Game Variables

  // Ball Variables
  float ballX = 400;
  float ballY = 300;
  float ballSpeed = 3;
  float ballDirectionX = -1;
  float ballDirectionY = -1;

  // Player Variables
  int player1X = 25;
  int player1Y = 250;
  int pX = 780;
  int pY = 250;

  // Location of Player
  int playerWidth = 25;
  int playerHeight = 65;  

  // Speed of Player
  int player1Speed = 6;

  // Scoreboard
  int player1Score = 0;

  // Wins
  int player1Wins;

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
    size(800, 500);
    }
  

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

  public void setup() {
    img = loadImage("TROPHY.jpg");
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


private void splash() {
  img.resize(width, height);
  
}


private void game() {
}
}



  
 





















                                                                                                  
    
  
    