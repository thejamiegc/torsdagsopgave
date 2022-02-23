public class Main{
	public static void main(String[] args){
		printStr("Hello World!");
		printNameAge("Jamie",23);
	}

	static void printStr(String myString){
		System.out.println(myString);
	}
	
	static void printNameAge(String name,int age){
		System.out.println("My name is " + name + ", I am " + age + " years old");
	}
}