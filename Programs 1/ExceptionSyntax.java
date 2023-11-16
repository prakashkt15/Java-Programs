package Programs;

public class ExceptionSyntax {

	public static void main(String[] args) {
		
		try{
			
			int arr[]= {10,20};
			int i=1/0;
			
			try {
				System.out.println(arr[5]);
			}catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("caught");
			}
		}
		catch(ArithmeticException e) {
			System.out.println("handled");
		}
		finally {
			System.out.println("Finally");
		}
	}
}
