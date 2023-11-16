package Bsc;

public class CountDigitsInInteger {
	public static void main(String[] args) {
		
		int num = 15041999;
	    int count = 0;

	    while (num != 0) {
	      num = num/10;
	      ++count;
	    }
	    System.out.println("Number of digits: " + count);
	}
}
