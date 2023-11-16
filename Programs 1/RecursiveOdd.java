package Programs;

public class RecursiveOdd {
	static void disp(int no)
	{
		if(no>=1)
		{
			if(no%2==1)
			{
				System.out.println(no);
			}
			no--;
			disp(no);
		}
	}
	public static void main(String[] args) {
		disp(15);
	}
}
