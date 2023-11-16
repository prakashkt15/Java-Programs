package Programs;

class Practical {
	
	void name1()
	{
		System.out.println("pkt");
	}
	String name2(String name)
	{
		return name;
	}
	static String name3(String name)
	{
		return name;
	}
	public static void main(String[] args) {

		Practical p = new Practical();
		p.name1();
		
		System.out.println(Practical.name3("pkt"));
	}

}
