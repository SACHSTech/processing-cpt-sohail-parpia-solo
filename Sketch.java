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
    rectMode(CENTER);
    textAlign(CENTER);
  }




/**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
  
  // Field
	background(109, 133, 252); 
	noFill();
	stroke(255);
	strokeWeight(4); 
	rect(400, 250, 800, 500); 
	line(400, 0, 400, 500); 
	
	//Ball
	noStroke();
	fill(255); 
	rect(ballX, ballY, 20, 20);
	
	//Player
	noStroke();
	fill(255, 0, 68);
	rect(player1X, player1Y, playerWidth, playerHeight); 
	
	//Goal Net
	fill(238, 255, 0);
	rect(pX, pY, playerWidth, playerHeight); 
	fill(109, 133, 252);
	rect(pX-10, pY, playerWidth, playerHeight-20); 

  // Ball Movement
  ballX = ballX+(ballDirectionX*ballSpeed);
  ballY = ballY+(ballDirectionY*ballSpeed);
  
  if(ballY+10 >= height){ 
    ballDirectionY = ballDirectionY*-1;
  } 
  if(ballY-10 <= 0){ 
    ballDirectionY = ballDirectionY*-1;
  }
  if(ballX-10 <= 0){ 
    ballDirectionX = ballDirectionX*-1;
  }

  //Scoreboard
	noStroke();
	fill(255);
	textSize(30);
	text("POINTS", 100, 35); 
	text(p1Score, 180, 35); 
	
  }
}


  
 





















                                                                                                  
    
  
    