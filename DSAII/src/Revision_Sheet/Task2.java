package Revision_Sheet;

import java.util.Scanner;

public class Task2 {
	
	
	public static int average (int a [],int b){
		
		int average, i,sum =0;
		
		for(i = 0; i < a.length; i++){
			
			sum = sum + a[i];
			
		}
		average = sum /b;
		
		return average;
	}
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int divide;
		
		System.out.println("Average of how many numbers?");
		divide = input.nextInt();
		

		int[] array = new int [divide];
		int i;
		for (i =0; i < divide; i++){
			
			System.out.println("Enter an integer");
			array[i] = input.nextInt();
		}
		
		System.out.println("Average number is " + average(array, divide));
		
	}

}
