public class Teacher {


	private String name;
	private int age;
	private boolean isFemale;

	public Teacher(String name,int age,boolean isFemale){
		this.name = name;
		this.age = age;
		this.isFemale = isFemale;
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
}