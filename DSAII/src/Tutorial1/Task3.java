package Tutorial1;

import java.util.Scanner;

public class Task3 {
	
	
	public static int result (int a, int b, char c){
		
		int sum = 0;
		
		switch(c){
		
		case '-':
		
		sum = a -b;
		break;
		
		case '+':
		
		sum = a +b;
		break;
		
		case '/':
		
		sum = a / b;
		break;
		
		case '*':
		
		sum = a * b;
		break;
		
		}
		
		return sum; 
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a =0;
		int b =0;
		char c;
		
		
		System.out.println("Enter first number");
		
			a = input.nextInt();
		System.out.println("Enter second number");
			
			b = input.nextInt();
		System.out.println("Enter operator");
			
			c = input.next().charAt(0);
			
			System.out.println("result is " + result(a, b, c));
	}

}