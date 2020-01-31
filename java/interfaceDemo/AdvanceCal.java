package interfaceDemo;

public class AdvanceCal implements Calc{

	public static void main(String[] args) {
		
		AdvanceCal obj1=new AdvanceCal();
		
		obj1.add();
		obj1.sub();
		obj1.calculateSin();
		obj1.calculateCos();
		
	}

	public void calculateSin()
	{
		System.out.println("Sin method");
	}
	
	public void calculateCos()
	{
		System.out.println("Cos method");
	}
	
	public void add()
	{
		System.out.println("add method");
		
	}

	public void sub() 
	{
		System.out.println("sub method");
		
	}

}
