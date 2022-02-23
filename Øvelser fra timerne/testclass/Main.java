public class Main{
	
	public static void main(String[] args){
		//System.out.println("hey");
		Person jamie = new Person("Jamie", "Callan","420420-6969");
		System.out.println("Hello " + jamie.getFullName() + " your cpr-numbers is " + jamie.getCPR());
		jamie.changeName("James","Bond");
		System.out.println("your new name is " + jamie.getFullName());
	}
}