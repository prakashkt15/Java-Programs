package Programs;

public class Practise1 {
	static String reverse(String s1)
	{
		String s2="";
		for (int i = s1.length()-1; i>=0; i--) {
			s2=s2+s1.charAt(i);
		}
		return s2;
	}
	public static void main(String[] args) {
		String s1="chandrakala";
		String arr[]=s1.split(" ");
		
		for (int i = 0; i <arr.length; i++) {
			if(i==0)
			{
				System.out.print(reverse(arr[i])+" ");
			}else {
				System.out.print(arr[i]+" ");
			}
			
		}
		
	}
}


