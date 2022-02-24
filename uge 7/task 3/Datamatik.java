
 public class Datamatik {

	public static void main(String [] args) {
		Student stud1 = new Student("Jamie",23,false,"dat1");
		Student stud2 = new Student("Line",20,true,"dat1");
		Teacher teach1 = new Teacher("Tobias",36,false);

		System.out.println(stud1.getName() + " " + stud1.getAge() + " " + stud1.getGender() + " " + stud1.getTeam());
		System.out.println(stud2.getName() + " " + stud2.getAge() + " " + stud2.getGender() + " " + stud2.getTeam());
		System.out.println(teach1.getName() + " " + teach1.getAge() + " " + teach1.getGender());
	}
}

