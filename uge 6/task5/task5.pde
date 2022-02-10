void setup() {
  MethodOne(); 
  MethodTwo(); 
}

/*
  The following method has an error in it. Fix the error and run it. 
*/

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 
  String output = "";
  int max = 10;
  
  if (i > max)
  {
    output = "i is greater than "+max+".";   
  }
  
  println(output);
   
}

/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/
void MethodTwo() 
{
  int weekDay = 6; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;
  
  if (weekDay < 5)
  {
    weekend = false;
  }
  else 
  {
    weekend = true;
  }
  
  // Print the name of the weekday here: 
  if(weekend == false){
     if(weekDay == 0){
       println("it is monday");
     }else if(weekDay==1){
       println("it is tuesday");
     }else if(weekDay==2){
       println("it is wednesday");
     }else if(weekDay==3){
       println("it is thursday");
     }else if(weekDay==4){
       println("it is friday");
     }
  }  else {// Print if it is weekend here:
    println("it is weekend");  
}
}
