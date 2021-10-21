package week3day1;

public class ReplaceAndPrintSpeci {
	// Write a Java program to replace a specified character with another character
	// and add # to the given string.

	// String sentence = "I am working with Java8"
	// replace 8 to 11
	// Print the characters from 5 to 14(working with Java8)

	public static void main(String[] args) {
		String s1 = "I am working with Java8";
		char charToAdd1 = '#';

		String AddingChar = "I am working with Java8" + charToAdd1;
		System.out.println(AddingChar);
		String replaceString = AddingChar.replace("8", "11");
		System.out.println(replaceString);
		char[] ch = s1.toCharArray();// change the string to array
		for (int i = 5; i <= 14; i++)// use for loop to print the char from index 5 to 14 from the string s1
			System.out.println(ch[i]);
	}

}
