package JavaProgramsExamples;

import java.io.File;

public class AllFileOperations {

	public static void main(String[] args) {

		try {
			
	
		File file = new File("C:\\Users\\vgeddam\\Desktop\\MyFiles\\Practice\\Ramesh.txt");

		//to print the file name
		System.out.println(file.getName());
		
		//to check its executable - returns boolean true/false
		System.out.println(file.canExecute());
		
		//to check can read the file - returns boolean true/false
		System.out.println(file.canRead());
		
		//to check can write the file - returns boolean true/false
		System.out.println(file.canWrite());
		
		//Tests whether the application can modify the file
		System.out.println(file.createNewFile());
				
		//Tests whether the file exists or not
		System.out.println(file.exists());		
		
		// //Deletes the file or directory
		//System.out.println(file.delete());
		
		//to get the file path
		System.out.println(file.getPath());
		
		//to get the total space
		System.out.println(file.getTotalSpace());
		
		//to get the list files
		System.out.println(file.list());
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
