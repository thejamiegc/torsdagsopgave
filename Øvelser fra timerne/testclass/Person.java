public class Person{
	//1. fields
	private String firstName;
	private String lastName;
	private String cpr;
	
	//2.constructor
	public Person(String fn,String ln,String cpr){
		this.firstName = fn;
		this.lastName = ln;
		this.cpr = cpr;
	}
	//3.methods
	public String getFullName(){
		return this.firstName + " " + this.lastName;
	}
	
	public String getFirstName(){
		return this.firstName;
	}

	public String getLastName(){
		return this.lastName;
	}
	
	public void changeName(String newFirstName, String newLastName){
		this.firstName = newFirstName;
		this.lastName = newLastName;
	}
	
	public String getCPR(){
		return this.cpr;
	}
}