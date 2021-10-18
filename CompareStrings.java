package week3day1;

public class CompareStrings {

	public static void main(String[] args) {
		//Write a Java program to compare a given string to another string, ignoring case considerations.

		//String 1="I am Learning Java" 
		//String 2="I am learning java?   
		  //Explore with == operator
		    //           equals
		      //         equalsignorecase  
		String String1="I am Learning Java"; 
		String String2="I am learning java?";
		if(String1.equalsIgnoreCase(String2))
		{
			System.out.println("both Strings are equal");

		}
		else
			System.out.println("both Strings are not equal ");
		

	}

}
