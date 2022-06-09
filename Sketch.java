import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  // Global Variables

  // Images
  PImage img;

  // Ball Variables
  float ballX = 400;
  float ballY = 300;
  float ballSpeed = 1;
  float ballDirectionX = -1;
  float ballDirectionY = -1;


  // Player Variables
  int player1X = 25;
  int player1Y = 250;
  int pZX = 780;
  int pZY = 245;

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
  int playerZWins;


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
    background(255, 59, 20);
    img = loadImage("Stadium.jpg");
    img.resize(width, height);
}


/**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    image(img, 0, 0);

    //determine what stage to run
	
	if(stage == 0){
		splash();
	}//close 0
	
	if(stage == 1){ //easy
		game(); //run game
	}//close 1
  }


private void game() {
}


private void splash() {
  img = loadImage("Stadium.jpg");
    img.resize(width, height);

    //Name of Game
	fill(255, 250, 0);
	textSize(60); 
	text("UEFA FOOTBALL", 400, 150);

  	//START
	fill(255, 250, 0);
	textSize(25); 
	text("Space To Begin", 400, 400);

}//close splash

}









                                                                                                  
    
  
    