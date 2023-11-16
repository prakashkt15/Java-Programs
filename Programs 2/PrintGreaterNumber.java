package Bsc;

import java.util.Scanner;

public class PrintGreaterNumber {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter first number");  
		int a = sc.nextInt();  
		System.out.println("Enter second number");  
		int b = sc.nextInt();  
		System.out.println("Enter third number");  
		int c = sc.nextInt();  
		
		int temp=a>b?a:b;  
		int largest=c>temp?c:temp;  
		
		System.out.println("The largest number is: "+largest);  
	}

}
