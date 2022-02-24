
 public class Datamatik {

	public static void main(String [] args) {
		Student[] studArr = new Student[10];
		studArr[0] = new Student("Jamie",23,false,"dat1");
		studArr[1] = new Student("Thorsen",23,false,"byg");
		studArr[2] = new Student("Jose",25,true,"optik");
		studArr[3] = new Student("Niklas",23,false,"byg");
		studArr[4] = new Student("Emma",22,true,"Kok");
		studArr[5] = new Student("Zagarias",21,false,"fysik");
		studArr[6] = new Student("Gudme",24,false,"fysik");
		studArr[7] = new Student("Nicklas",21,false,"pas");
		studArr[8] = new Student("Caspar",23,false,"Kemi");
		studArr[9] = new Student("Jakob",23,false,"datalog");
		nameSearch(studArr,0);
		nameSearch(studArr,2);	
		nameSearch(studArr,5);
		nameSearch(studArr,7);
		nameSearch(studArr,9);
		indexSearch(studArr,"Thorsen");
		indexSearch(studArr,"Niklas");
		indexSearch(studArr,"Emma");
		indexSearch(studArr,"Gudme");
		indexSearch(studArr,"Caspar");
	}

	static String nameSearch(Student[] arr, int num){
		System.out.println(arr[num].getName());
		return arr[num].getName();
	}

	static int indexSearch(Student[] arr, String name){
		for(int i=0;i<arr.length;i++){
			if(arr[i].getName() == name){
				System.out.println(i);
				return i;
			}
		}
		return -1;
	}
}

