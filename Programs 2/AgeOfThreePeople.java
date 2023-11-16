package Bsc;

import java.util.Scanner;

public class AgeOfThreePeople {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the age of first person");  
		int a = sc.nextInt();  
		System.out.println("Enter the age of second person");  
		int b = sc.nextInt();  
		System.out.println("Enter the age of third person");  
		int c = sc.nextInt();  
		
		int temp=a>b?a:b;  
		int largest=c>temp?c:temp;  
		
		int temp1=a<b?a:b;  
		int smallest=c<temp1?c:temp1; 
		
		System.out.println("The oldest age is: "+largest); 
		System.out.println("The youngest age is: "+smallest);  
	}
}
