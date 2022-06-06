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

  // Location of Players
  int playerWidth = 30;
  int playerHeight = 25;  

  // Speed of Players
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
    size(800, 600);
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
    // Game Stages to Run
    if(stage == 0){
      splash();
    }//close 0
    
    if(stage == 1){ //easy mode of the game
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
    // Beginning Game Screen
	background(0);
	noStroke();

  // Name of Game
  fill(255, 253, 252);
  textSize(55);
  text("CHAMPIONS LEAGUE FINAL", 400, 150);

//Host of Game
fill(0,255, 255);
textSize(25); 
text("UEFA", 400, 200);


//Begin Game
fill(12, 222, 237);
textSize(30); 
text("Start to Play", 400, 400);
}
}

                                                                                                 
    
  
    