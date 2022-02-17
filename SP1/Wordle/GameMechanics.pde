class GameMechanics{
  String answer;
  int attempts;
  GameMechanics(){
    String[] posibleAnswers = new String[]{"tiger","zebra","bison","kobra","dingo","egern","giraf","hjort","harre","kamel","kanin","lemur","larve","myrer","odder","rotte","tapir","snegl"};
    int value = (int) random(0,posibleAnswers.length);
    answer = posibleAnswers[value];
  }
  
  boolean checkGeuss(String guess){
    if(guess.equals(answer)){
      return true;
    }
    checkLetter(guess);
    return false;
  }
  
  void checkLetter(String guess){
    char[] hint = new char[guess.length()];
    print("these letter are somewhere in the word: ");
    for(int i=0;i<guess.length();i++){
      for(int j=0;j<answer.length();j++){
        if(guess.charAt(i) == answer.charAt(j)){
          for(int k=0; k<hint.length;k++){ 
            if(hint[k]!=guess.charAt(i)){
               hint[i]=guess.charAt(i);
            }
          }
        }
      }
      print(hint[i]);
    }
    println(""); 
  }
  int calulateScore(){
    int score=0;
    score = 550-(attempts*50);
    if(score<0){
      score=0;
    }
    return score;
  }
}
