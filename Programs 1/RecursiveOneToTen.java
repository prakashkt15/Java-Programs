package Programs;

public class RecursiveOneToTen {
	
	static void number(int no) {
		if(no<=10)
		{
			System.out.println(no);
			no++;
			number(no);
		}
	}
	
	public static void main(String[] args) {
		number(1);
		
	}
}
