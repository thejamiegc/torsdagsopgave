class Dice{
  int value;
  int xPos;
  Dice(int xPos){
    value = 0;
    this.xPos = xPos;
  }
  
  void rollDice(){
    value = (int) random(1,6.9999);
  }
  
  void drawDice(){
  fill(255);
  rect(width/2-50+xPos,height/2-50,100,100);
    switch(value){
      case 1:
      fill(0);
      ellipse(width/2+xPos,height/2,20,20);
      break;
      case 2:
      fill(0);
      ellipse(width/2-25+xPos,height/2-25,20,20);
      ellipse(width/2+25+xPos,height/2+25,20,20);
      break;
      case 3:
      fill(0);
      ellipse(width/2-25+xPos,height/2-25,20,20);
      ellipse(width/2+xPos,height/2,20,20);
      ellipse(width/2+25+xPos,height/2+25,20,20);
      break;
      case 4:
      fill(0);
      ellipse(width/2-25+xPos,height/2-25,20,20);
      ellipse(width/2+25+xPos,height/2+25,20,20);
      ellipse(width/2-25+xPos,height/2+25,20,20);
      ellipse(width/2+25+xPos,height/2-25,20,20);
      break;
      case 5:
      fill(0);
      ellipse(width/2+xPos,height/2,20,20);
      ellipse(width/2-25+xPos,height/2-25,20,20);
      ellipse(width/2+25+xPos,height/2+25,20,20);
      ellipse(width/2-25+xPos,height/2+25,20,20);
      ellipse(width/2+25+xPos,height/2-25,20,20);
      break;
      case 6:
      fill(0);
      ellipse(width/2+25+xPos,height/2,20,20);
      ellipse(width/2-25+xPos,height/2,20,20);
      ellipse(width/2-25+xPos,height/2-25,20,20);
      ellipse(width/2+25+xPos,height/2+25,20,20);
      ellipse(width/2-25+xPos,height/2+25,20,20);
      ellipse(width/2+25+xPos,height/2-25,20,20);
      break;
  
    }
  }

}
