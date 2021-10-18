package week3day1;

public class IndexforCharacter {

	public static void main(String[] args) {
		// Write a Java program to get the character at the given index within the
		// String.
		// String text = Java Exercise
		// Index for character E and s
		String str = "Java Exercise";
		int char1 = str.indexOf("E");
		int char2 = str.indexOf("s");
		
		
		System.out.println("print the index of E is "+(int)char1);
		System.out.println("print the index of s is "+(int)char2);

	}
}
