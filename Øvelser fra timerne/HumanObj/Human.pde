class Human{
  int humanHeight;
  int humanWeight;
  String gender;
  String eyeColor;
  String hairColor;
  
  Human(int tempHeight,int tempWeight,String sex, String eyes,String hair){
    humanHeight = tempHeight;
    humanWeight = tempWeight;
    gender = sex;
    eyeColor = eyes;
    hairColor = hair;
  }
  
  void sleep(){
    println("Sleep");
  }
  
  void wakeUp(){
    println("Wake up");
  }
  
  void eat(){
    println("Eat pizza");
  }
  
  void rideBike(){
  println("ride bike");
  }

}
