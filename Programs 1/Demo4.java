package Programs;

import java.util.Scanner;

public class Demo4 {

	public static int findid(int N,int[][] M)
	{
		int result=0;
		if(M[0][0]==0&&M[1][1]==0&&M[2][2]==0)
		{
			result++;
		}else {
			result--;
		}
		
		return result;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N=sc.nextInt();
	int[][] M=new int[N][N];
	for (int i = 0; i <N; i++) {
		for (int j = 0; j < N; j++) {
			M[i][j]=sc.nextInt();
		}
		
	}
	
	System.out.println(findid(N, M));
	sc.close();
	}
}
