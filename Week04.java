package codingProjects;

import java.util.Arrays;

public class Week04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// create an array of int called ages; fill in given values
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	// subtract value in first element from value in last element	
		System.out.println(ages[ages.length-1] - ages[0]);
	//create a second array called ages2 and repeat	
		int[] ages2 = {7, 9, 16, 31, 12, 54, 98, 73, 14};
		System.out.println(ages2[ages2.length - 1] - ages2[0]);
	// use a loop to iterate through the array and find the average
		double sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i]; } {
		double avg = sum / ages.length;
			System.out.println(avg);
		}
	//create an array of string called names; fill in given values
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	//use a loop to iterate through the array and find the average number of letters per name	
		double sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length(); } {
			double avgLetters = sumOfLetters / names.length;  
			System.out.println(avgLetters);
			}
	//access the last element of an array
		System.out.println(names[names.length - 1]);
	//access the first element of an array	
		System.out.println(names[0]);
	//create a new array called nameLengths and iterate over previous array and add lengths to new array
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++ ) {
			nameLengths[i] = names[i].length(); }
			System.out.println(Arrays.toString(nameLengths));
		
	//calculate the sum of the new array		
		int total = 0;	
		for (int j = 0; j < nameLengths.length; j++) { 
			total += nameLengths[j]; } {
			System.out.println(total);
				}
	//write a method that takes a string and concatenates it to itself a specific number of times		
		{
		String string = "Back End";
		System.out.println(string.repeat(6)); } 
			
	}
	
	//write a method to return a concatenated name
	public static String createName(String firstName, String lastName) {
			String fullName = firstName + " " + lastName; {
				return fullName;	}
	}

	//write a method that returns true if the sum of the array is greater than 100
	public static boolean sumOfArray(int[] numbers) {
		for (int number : numbers); 
			int sum = 0;
			sum += number;
			if (sum > 100) {
				return true;	
			} else {
				return false; }
		}
			
		
	//write a method that returns the average of the array
	public static double arrayAverage(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i]; } {
		double avg = sum / array.length;
			return avg;
	}
	}	
	
	//write a method that compares the averages of two arrays
	public static boolean compareArray(double[] array1, double[] array2) {
		double sum1 = 0;
		for (int i = 0; i < array1.length; i++) {
			sum1 += array1[i]; } 
		double sum2 = 0;
		for (int i = 0; i < array2.length; i++) {
			sum2 += array2[i]; } {
		double avg1 = sum1 / array1.length;
		double avg2 = sum2 / array2.length;
		
			if (avg1 > avg2) {
				return true;
			} else {
				return false;
			}
}
}
	//write a method that returns true if both criteria are met
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside = true && moneyInPocket > 10.5) {
			return true;
		} else { return false; }
	}
	
	//write your own method that solves a problem
	public static void shouldIWearAJacket(int temperature, boolean willBeOutside) {
		if (temperature < 60 && willBeOutside) {
			System.out.println("Yes, you should wear a jacket.");
		} else { System.out.println("No jacket needed!");
	}
}
}	


	




