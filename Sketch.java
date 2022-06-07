import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  // Global Variables

  // Ball Variables
  float ballX = 400;
  float ballY = 300;
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
  int player1Speed = 6;

  // Scoreboard
  int score;
  int player1Score;

  // Wins
  int player1Wins;
  int player2Wins;


  // Keyboard Variables
  int keyPressed;

  // In Game Variables
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
    //close setup
  }


  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    if(stage == 0){
      splash();
    }//close 0
    
    if(stage == 1){ //easy
      game(); //run game
    }//close 1
    
    
    if(stage == 2){
      player1Wins();
    }//close = 2
    
  }//close draw


  private void player1Wins() {
  }


  private void game() {
  }


  private void splash() {
   //Main Screen
	background(235, 230, 247);
	noStroke();
	
	//Name of The Game
	fill(255,0,0);
	textSize(60); 
	text("CHAMPIONS LEAGUE SOLO", 400, 150);
	
	//Creator
	fill(0);
	textSize(30); 
	text("PRESENTED BY SOHAIL", 400, 200);
	
	//Begin to Play
	fill(0);
	textSize(25); 
	text("CLICK SPACE TO BEGIN GAME", 400, 400);

}//close splash
  }

  


                                                                                                  
    
  
    