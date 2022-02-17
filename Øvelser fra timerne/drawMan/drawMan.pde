
void setup(){
size(400,400);
background(0,150,200);
drawLandscape();
drawArms();
drawLegs();
drawBody();
drawFace();

}

void draw(){
}

void drawLandscape(){
  drawSun();
  drawGround();
}

void drawGround(){
  fill(0,255,0);
  rect(0,height-100,width,height);
  fill(255);
}

void drawFace(){
  ellipse(width/2,height/2-50,40,40);
  drawEyes();
  drawMouth();
}

void drawMouth(){
  line(width/2-10,height/2-40,width/2+10,height/2-40);
}

void drawEyes(){
  fill(0);
  ellipse(width/2-10,height/2-50,5,5);
  ellipse(width/2+10,height/2-50,5,5);
}

void drawBody(){
  ellipse(width/2,height/2,50,100);
}

void drawLegs(){
   line(width/2,height/2,150,height-100);
   line(width/2,height/2,width-150,height-100);
   drawFeet();
}
void drawArms(){
  line(120,height/2-20,width-120,height/2-20);
}

void drawFeet(){
  ellipse(140,height-100,30,20);
  ellipse(width-140,height-100,30,20);
}

void drawSun(){
  fill(255,255,0);
  ellipse(width-20,20,75,75);
  
}
