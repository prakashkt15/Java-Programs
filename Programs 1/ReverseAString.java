package Programs;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.next();
		String s2="";
		
		for(int i=5;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);

	}

}
