package Bsc;

public class CountPositiveIntegers {
	
	public static void main(String[] args) {
		int count=0;
		int arr[]= {-1,-2,10,20,30,40};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
			{
				count++;
				System.out.println("Positive integers i "+arr[i]);	
			}
		}
		System.out.println(count);
	}

}
