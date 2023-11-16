package Bsc;

	import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		int sum=0;
		int n;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter "+i+" element");
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("sum of 5 numbers "+sum);
		avg=sum/n;
		System.out.println("average of 5 numbers "+avg);
	}
}
