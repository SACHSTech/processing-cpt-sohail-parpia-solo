import processing.core.PApplet;

public class Sketch extends PApplet {
  // Global Variables

  // Soccer Ball Variable
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

  // Scoreboard
  int player1Score = 0;
  int player2Score = 0;

  // Inside Game Variables
  int stage = 0;

  // Other Varibles Included
  int splash;
  int game;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(700, 500);
    }
  

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(141, 221, 252);
    rectMode(CENTER);
    imageMode(CENTER);
    textAlign(CENTER);
    //close setup
  }


  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // In Game Stages to Run
    if(stage == 0){
      splash();
    }//close 0
    
    if(stage == 1){ //easy
      game(); //run game
    }//close 1
    
    
    if(stage == 2){
      p1Wins();
    }//close = 2
    
  }//close draw


  private void p1Wins() {
  }


  private void game() {
  }


  private void splash() {
    //splashscreen
	background(0);
	noStroke();

  // Title of The Game
  fill(255, 253, 252);
  textSize(55);
  text("CHAMPIONS LEAGUE", 400, 150);
  }
  }
                                                                                                 
    
  
    