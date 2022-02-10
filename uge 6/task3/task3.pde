
void setup(){
size(150,300);
background(0);


}

void draw(){
fill(130,130,130);
ellipse(75,50,75,75);

fill(130,130,130);
ellipse(75,150,75,75);

fill(130,130,130);
ellipse(75,250,75,75);
if(mouseY < 100){
  fill(255,0,0);
  ellipse(75,50,75,75);

  fill(130,130,130);
  ellipse(75,150,75,75);

  fill(130,130,130);
  ellipse(75,250,75,75);
}else if(mouseY >200){
  fill(130,130,130);
  ellipse(75,50,75,75);
  
  fill(130,130,130);
  ellipse(75,150,75,75);
  
  fill(0,255,0);
  ellipse(75,250,75,75);
}else{
fill(130,130,130);
ellipse(75,50,75,75);

fill(255,255,0);
ellipse(75,150,75,75);

fill(130,130,130);
ellipse(75,250,75,75);
}
}
