package Bsc;

public class SumOfOddNaturalNumbers2 {
	
	public static void main(String[] args) {
		int num=50;
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(i%2==1)
			{
			sum=sum+i;
			}
		}
		System.out.println("Sum of first 50 odd natural numbers is "+ sum);
	}

}
