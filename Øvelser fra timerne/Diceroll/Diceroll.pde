void setup(){
  size(400,400);
  Dice myDice = new Dice(100);
  Dice yourDice = new Dice(-100);
  int sum = 0;
  
  //while(sum != 12){
    myDice.rollDice();
    yourDice.rollDice();
    println("the value of the right dice: " + myDice.value);
    println("the value of the Left dice: " + yourDice.value);
    myDice.drawDice();
    yourDice.drawDice();
    sum = myDice.value + yourDice.value;
    println("the sum is: " + sum);
  //}
}
