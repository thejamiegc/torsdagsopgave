Boolean gameWon = false;
GameMechanics game = new GameMechanics();
String finalGuess = "";
void setup (){

  println("Welcome to wordle danish animals edition! \nTry to geuss the animals name the spelling will be in danish. \nThe name is not longer then " + game.answer.length() + " charaters long");
}

void draw(){
}

void keyTyped(){
  if(gameWon==false){
    finalGuess = finalGuess + key;
    println(finalGuess);
    if(finalGuess.length() == game.answer.length()){
      game.attempts++;
      if(game.checkGeuss(finalGuess)){
        gameWon=true;
      }
      finalGuess = "";
    }
  }
  if(gameWon==true){
    println("--------- you won! the answer was " + game.answer + " ---------");
    println("it took you " + game.attempts + " attempts thereby giving you a score of " + game.calulateScore()); 
  }
}
