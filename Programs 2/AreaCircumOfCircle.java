package Bsc;

public class AreaCircumOfCircle {
	final double pi=3.142;
	
	public void areaOfCircle(int r)
	{
		double result=pi*r*r;
		System.out.println("Area Of Circle is "+result);
	}
	
	public void circumferenceOfCircle(int r)
	{
		double result=2*pi*r;
		System.out.println("Circumference Of Circle is "+result);
	}
	
	public static void main(String[] args) {
		AreaCircumOfCircle area = new AreaCircumOfCircle();
		area.areaOfCircle(5);
		area.circumferenceOfCircle(6);
	}
}
