package Bsc;

public class NegativeOrPostive {
	
	public static void main(String[] args) {
		int arr[]= {-1,-2,0,10,20};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
			System.out.println("Positive integer is "+arr[i]);
			}else if(arr[i]<0) {
			System.out.println("Negative integer is "+arr[i]);
			}else {
			System.out.println("other integer is "+arr[i]);
			}
		}
		
	}

}
