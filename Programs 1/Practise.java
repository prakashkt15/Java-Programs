package Programs;

public class Practise{
	
	static void purchase() throws FlipkartException {
		int price=1000;
		if (price<=999) {
			System.out.println("Buy product");
		} else {
			throw new FlipkartException("Price is too much");
		}
	}
	public static void main(String[] args) {
		try {
			purchase();
		} catch (FlipkartException e) {
			// TODO Auto-generated catch block
			System.out.println(e.msg);
		}
	}
	
}
class FlipkartException extends Throwable{
	
	String msg;
	public FlipkartException(String message) {
		msg=message;
	}
public String message(){
	return msg;
}
}
