package JavaProgramsExamples;

public class ArrayComplete {

	public static void main(String[] args) {

		int[] inputarray = { 10, 20, 30, 40, 50, 60 };
		getmaxnumber(inputarray);
		getminnumber(inputarray);
		getsum(inputarray);
		getaverage(inputarray);

	}

	public static int getmaxnumber(int[] inputarray) {

		int maxnumber = inputarray[0];
		for (int i = 0; i <= inputarray.length - 1; i++) {
			if (inputarray[i] > maxnumber) {
				maxnumber = inputarray[i];
			}
		}
		System.out.println("The max number from the array is :" + maxnumber);
		return maxnumber;

	}

	public static int getminnumber(int[] inputarray) {

		int minnumber = inputarray[0];
		for (int i = 0; i <= inputarray.length - 1; i++) {
			if (inputarray[i] < minnumber) {
				minnumber = inputarray[i];
			}
		}
		System.out.println("The max number from the array is :" + minnumber);
		return minnumber;

	}

	public static int getsum(int[] inputarray) {

		int sum = 0;
		for (int i = 0; i < inputarray.length - 1; i++) {

			sum = sum + inputarray[i];

		}
		System.out.println("Sum of all array numbers :" + sum);
		return sum;

	}

	public static double getaverage(int[] inputarray) {

		int arraysize = inputarray.length;
		int sum = 0;
		for (int i = 0; i < inputarray.length - 1; i++) {

			sum = sum + inputarray[i];

		}
		double average = sum / arraysize;
		System.out.println("The average value of given array :"+average);
		return average;
		
	}
	
	

}
