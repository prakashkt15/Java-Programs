package Bsc;

import java.util.Scanner;

public class ArithmeticOperationUsingSwitchCase {
	public static void main(String[] args )
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter two numbers");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		System.out.print("Enter an operator (+, -, *, /)");
		char operator = sc.next().charAt(0);
		double result;
		switch(operator)
		{
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
					result = num1 / num2;
					break;
				
				default:
				System.out.printf("operator is not correct");
			return;
		}
		System.out.println(num1+" "+ operator+" "+num2+" = "+result);
	}
}
