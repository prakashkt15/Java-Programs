package Programs;

import java.util.Scanner;

public class Demo3 {

	public static int MinNum(String first,String second)
	{
		int result=0;
		for (int i = 0; i < second.length(); i++) {
			char c='a';
			if(second.charAt(i)==c) {
				result++;
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String first=sc.nextLine();
	String second=sc.nextLine();
	
	System.out.println(MinNum(first, second));
	sc.close();
	}

}
