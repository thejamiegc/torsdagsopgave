
public class Main {


    	public static void main(String[] args) {
		int[] intArray = new int []{4,2,3,1};
		String[] strArray = new String[]{"Hej","med","dig","!"};
		boolean[] bolArray = new boolean[]{true,false,false,true};

		printArray(strArray);
		System.out.println(getSum(intArray));
		System.out.println(getAverage(intArray));
		printArray1(intArray);
		intArray = sortArray(intArray);
		printArray1(intArray);
	}

	static void printArray(String[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	static void printArray1(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	static int getSum(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+= arr[i];
		}
		return sum;
	}

	static float getAverage(int[] arr){
		float sum = getSum(arr);
		return sum/arr.length;
	}

	static int[] sortArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[j]<arr[i]){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}