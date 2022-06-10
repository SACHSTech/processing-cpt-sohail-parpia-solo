import processing.core.PApplet;
import processing.core.PImage;




public class Sketch extends PApplet {
  // Global Variables

  // Soccer Ball Variables
  float ballX = 400;
  float ballY = 300;
  float ballSpeed = 1;
  float ballDirectionX = -1;
  float ballDirectionY = -1;

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
    size(800, 500);
    }
  

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

  public void setup() {
    img = loadImage("UEFA-Champions-League.jpg");
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
    // Soccer Field
  background(24, 242, 31); 
  noFill();
  stroke(255);
  strokeWeight(6); 
  rect(400, 250, 800, 500); 
  line(400, 0, 400, 500); 
  
  //Soccer Ball
  noStroke();
  fill(255, 217, 28); 
  rect(ballX, ballY, 20, 20);

  // Player
  noStroke();
	fill(30, 0, 255);
	rect(player1X, player1Y, playerWidth, playerHeight);

  // Country Goal
  fill(255, 42, 0);
	rect(player2X, player2Y, playerWidth, playerHeight); 
	fill(255);
  strokeWeight(4);
	rect(player2X, player2Y, playerWidth, playerHeight-20); 

  // Ball Movement
	ballX = ballX+(ballDirectionX*ballSpeed);
	ballY = ballY+(ballDirectionY*ballSpeed);
	
	if(ballY+10 >= height){ 
		ballDirectionY = ballDirectionY*-1;
	}//close if > height	
	
	if(ballY-10 <= 0){ 
		ballDirectionY = ballDirectionY*-1;
	}//close if < 0	
	
	if(ballX-10 <= 0){ 
		ballDirectionX = ballDirectionX*-1;
	}//close if < 0	

	//collision with player 1
	
	//HIT To Make Ball Move
	if(ballX >= player1X-playerWidth/2 && ballX <= player1X+playerWidth/2 && ballY >= player1Y-playerHeight/2 && ballY <= player1Y+playerHeight/2){
		//hit player 
		ballDirectionX = ballDirectionX*-1;
		ballSpeed = 5;
	}
	
	
	//Collision Detection With Wall Edges
	if(ballX >= player2X-playerWidth/2 && ballX <= player2X+playerWidth/2 && ballY >= player2Y-playerHeight/2 && ballY <= player2Y+playerHeight/2){
	
		player1Score = player1Score+1;
		ballX = width/2;
		ballY = height/2;
		ballSpeed = 0; 
	}
	
	//Goal Miss Above
	if(ballX >= width && ballY >= 0 && ballY<= player2Y-playerHeight/2){
		ballDirectionX = ballDirectionX*-1;
	}
	
	// Goal Miss Below
	if(ballX >= width && ballY >= player2Y+playerHeight/2  && ballY<= height){
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





















                                                                                                  
    
  
    