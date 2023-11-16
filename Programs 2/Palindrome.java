package Bsc;

public class Palindrome {

	public static void main(String[] args) {
	int num=121;
	int rev=0;
	int copy=num;
	
	while(num!=0)
	{
		int k=num%10;
		rev=(rev*10)+k;
		num=num/10;
	}
	if (copy==rev) {
		System.out.println(rev+" is palindrome");
	} else {
		System.out.println(rev+" is not a palindrome");
	}
	}
}
