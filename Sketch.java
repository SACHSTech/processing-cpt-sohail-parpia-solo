import processing.core.PApplet;
import processing.core.PImage;


public class Sketch extends PApplet {
  // Global Variables

  // Ball Variables
  float ballX = 400;
  float ballY = 300;
  float ballSpeed = 2;
  float ballDirectionX = -1;
  float ballDirectionY = -1;

  // Player Variables
  int player1X = 25;
  int player1Y = 250;
  int pX = 780;
  int pY = 245;

  // Location of Player
  int playerWidth = 30;
  int playerHeight = 25;  

  // Speed of Player
  int player1Speed = 6;

  // Scoreboard
  int playerScore;
  int player1Score;

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
    size(800, 450);
    }
  

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

  public void setup() {
    img = loadImage("Candy.jpg");
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


  private void game() {
  // Fantasy Land Game Screen
  img = loadImage("Fantasy Land.jpg"); 
  img.resize(width, height);

  //Rectangular Ball
  noStroke();
  fill(255, 217, 28); 
  rect(ballX, ballY, 20, 20);

  // Player
  noStroke();
	fill(30, 0, 255);
	rect(player1X, player1Y, playerWidth, playerHeight);

  // Candy on Right Side of Field
  fill(255, 42, 0);
	rect(pX, pY, playerWidth, playerHeight); 
	fill(255);
  strokeWeight(4);
	rect(pX, pY, playerWidth, playerHeight-20); 

  // Ball Movement
	ballX = ballX+(ballDirectionX*ballSpeed);
	ballY = ballY+(ballDirectionY*ballSpeed);
	
	if(ballY+10 >= height){ 
		ballDirectionY = ballDirectionY*-1;
	}//close if > height	
	
	if(ballY-10 <= 0){ 
		ballDirectionY = ballDirectionY*-1;
	}
	
	if(ballX-10 <= 0){ 
		ballDirectionX = ballDirectionX*-1;
	}

	//HIT To Make Ball Move
	if(ballX >= player1X-playerWidth/2 && ballX <= player1X+playerWidth/2 && ballY >= player1Y-playerHeight/2 && ballY <= player1Y+playerHeight/2){
		ballDirectionX = ballDirectionX*-1;
		ballSpeed = 5;
	}
	
	
	//Collision Detection With Wall Edges
	if(ballX >= pX-playerWidth/2 && ballX <= pX+playerWidth/2 && ballY >= pY-playerHeight/2 && ballY <= pY+playerHeight/2){
	
		player1Score = player1Score+1;
		ballX = width/2;
		ballY = height/2;
		ballSpeed = 0; 
	}
	
	//Miss Above Candy
	if(ballX >= width && ballY >= 0 && ballY<= pY-playerHeight/2){
		ballDirectionX = ballDirectionX*-1;
	}
	
	// Miss Below Candy
	if(ballX >= width && ballY >= pY+playerHeight/2  && ballY<= height){
		ballDirectionX = ballDirectionX*-1;
	}
		
	
	//Parameters Around Field
	if(player1Y-playerHeight/2 <= 0){
		player1Y = player1Y+5;
	}
	
	if(player1Y+playerHeight/2 >= height){
		player1Y = player1Y-5;
	}
	
	if(player1X-playerWidth/2 <= 0){
		player1X = player1X+5;
	}
	
	if(player1X+playerWidth/2 >= width){
		player1X = player1X-5;
	}
	

  //Points System
	strokeWeight(2);
	fill(255, 0, 204);
	textSize(35);
	text("POINTS:", 100, 35); 
	text(player1Score, 180, 35); 
}


  
  private void splash() {
    img.resize(width, height);

  //START
  fill(225, 255, 0);
  textSize(40); 
  text("Press r To Begin", 400, 400);

}

  public void keyPressed(){
    if (keyCode == 'w') {
      player1Y -= player1Speed;
    }
    if (keyCode == 'a') {
      player1X -= player1Speed;
    }
    if (keyCode == 's') {
      player1Y += player1Speed;
    }
    if (keyCode == 'd') {
      player1X += player1Speed;
    }
    if (keyCode == 'r');
    stage = 1;
  }
}





















                                                                                                  
    
  
    