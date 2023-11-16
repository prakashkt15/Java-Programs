package Bsc;

public class AreaOfTraingle {
	public void area(int b,int h)
	{
		double result=0.5*b*h;
		System.out.println("Area of Traingle is "+result);
	}
	public static void main(String[] args) {
		AreaOfTraingle area=new AreaOfTraingle();
		area.area(10, 20);
	}

}
