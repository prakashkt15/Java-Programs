package Bsc;

public class PrimeNumbersBetweenTwoIntegers {
	public static int isprime(int n)
	  {
	      for (int i = 2; i < n; i++)
	      {
	         if(n%i == 0)
	         {
	            return -1;
	         }
	      }
	      return 1;
	   }
	   public static void main(String args[])
	   {
	      int FirstNum= 11, SecondNum = 50;
	      for (int i = FirstNum; i <= SecondNum; i++)
	      {
	         if(isprime(i) == 1)
	         {
	            System.out.print(i+" ");
	         }
	      }
	   }
}
