// Create a Student class
public class Student {

	private String name;
	private int age;
	private boolean isFemale;
	private String team;

	public Student(String name,int age,boolean isFemale,String team){
		this.name = name;
		this.age = age;
		this.isFemale = isFemale;
		this.team = team;
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public String getGender(){
		if(this.isFemale){
			return "Female";
		}
		return "Male";
	}
	
	public String getTeam(){
		return this.team;
	}
} 
