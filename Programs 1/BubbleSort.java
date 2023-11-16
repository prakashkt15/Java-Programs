package Programs;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int []arr= {10,8,5,2,1};
		
		for (int i = 0; i < arr.length-1; i++) //Number of passes
		{
			
			for (int j = 0; j < arr.length-1; j++) //iterations in each pass
			{
				if (arr[j]>arr[j+1]) 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-2]);

	}

}
