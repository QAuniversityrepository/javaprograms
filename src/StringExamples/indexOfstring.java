package StringExamples;

public class indexOfstring {

	public static void main(String[] args) {

		String str = "My name is Ramesh ramesh";

		System.out.println("Charcter 's' first occurence in the string: "
				+ str.indexOf('s'));
		System.out.println("String 'Ramesh' first occurence in the string: "
				+ str.indexOf("Ramesh"));

		/* Returns the first occurance from specified start index */

		System.out
				.println("First occurance of char 's' from 4th index onwards : "
						+ str.indexOf('s', 10));
		System.out
				.println("First occurance of String 'Ramesh' from 6th index onwards: "
						+ str.indexOf("Ramesh", 6));
	}

}
