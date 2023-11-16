package Programs;

import java.util.Scanner;

public class Demo2 {
	
	public static int difference(int N,int []arr,int x,int y)
	{
		int result=0;
		result=
				y-x;
		
		return result;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N=sc.nextInt();
	int[] Arr=new int[N];
	for (int i = 0; i < N; i++) {
		Arr[i]=sc.nextInt();
	}
	int x=sc.nextInt();
	int y=sc.nextInt();
	System.out.println(difference(N, Arr, x, y));
	sc.close();
	}
}
