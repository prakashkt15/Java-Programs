package Bsc;

public class CalculateThePowerOfNNumbers {

	public static void main(String[] args) {
	      int base = 5;
	      int temp = base;
	      int exp = 2;

	      for (int i=1; i<exp; i++){
	         temp = temp*temp;
	      }
	      System.out.println("Result of "+base+" power "+exp+" is "+temp);

	}

}
