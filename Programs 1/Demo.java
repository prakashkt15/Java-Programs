package Programs;

import java.util.Scanner;

public class Demo {
	
	public static int ArithmeticProgression(int N,int Array[])
	{
		int sum=0;
		for(int i=0;i<N;i++)
		{
			sum=sum+Array[i];
		}
		return sum;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N=sc.nextInt();
	int[] Array=new int[N];
	for (int i = 0; i < N; i++) {
		Array[i]=sc.nextInt();
	}
	System.out.println(ArithmeticProgression(N, Array));
	sc.close();
	}
}
