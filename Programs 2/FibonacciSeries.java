package Bsc;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num=10;
		
		int fib1 = 0;
		int fib2 = 1;
		int fib3 = 1;
		System.out.print(fib1 + " " + fib2 + " ");
		for(int i=1;i<=num;i++)
		{
			fib3 = fib1+fib2;
			fib1 = fib2;
			fib2 = fib3;
			System.out.print(fib3 + " ");		
		}
	}
}
