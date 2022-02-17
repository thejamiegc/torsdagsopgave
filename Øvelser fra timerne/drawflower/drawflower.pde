void setup(){
  size(400,400);
  writeVerse(35,35);
  writeVerse(45,-25);
  writeVerse(0,-50);
  writeVerse(-45,-25);
  writeVerse(-35,35);
  writeVerse(0,0);
}

void writeVerse(int xPos, int yPos){
  fill(255,0,0);
  ellipse(width/2+xPos,height/2-yPos,80,80);
  writeChorus(xPos, yPos);
}

void writeChorus(int xPos, int yPos){
  fill(255,0,100);
  ellipse(width/2+xPos,height/2-yPos,40,40);
  
}
