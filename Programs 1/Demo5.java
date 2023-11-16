package Programs;

import java.util.Scanner;

public class Demo5 {
	
	public static String reverse(String s1) {
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		return s2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		String arr[]=s1.split(" ");
		
		for (int i=arr.length-1;i>=0;i--) {
			System.out.print(reverse(arr[i])+" ");
			//System.out.println(arr[i]);
		}
	}

}
