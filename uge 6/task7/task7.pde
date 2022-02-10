int input = -40;

if(input >= 0){
  for(int i=0;i<=input;i++){
    if(i==6){
      println("six");
    }else if(i==input/2){
      println(i + " HALF!" );
    }else{
      println(i);
    }
  }
}else{
  for(int i=0;i>=input;i--){
    if(i==-6){
      println("minus six");
    }else if(i==input/2){
      println(i + " HALF!" );
    }else{
      println(i);
    }
  }
}
