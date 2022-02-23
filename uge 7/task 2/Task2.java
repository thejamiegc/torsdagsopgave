class Main{
  public static boolean happy = true;

public static void main(String [] args) {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands"); 
   }
   System.out.println(getSum(10,5));
   System.out.println(strToUpperCase("hej med dig"));
   if(firstCase("hej")){
     	System.out.println("it is uppercase");
   }else{
	System.out.println("it is not uppercase");
   }
}


public static boolean iAmHappy()
{
  // fill out what is missing here: 
  return happy;
}

public static int getSum(int a, int b){
  return a+b;
}
public static String strToUpperCase(String str){
  return str.toUpperCase();
}

public static boolean firstCase(String str){

 if(Character.isUpperCase(str.charAt(0))){
	return true;
}
return false;
}

}

