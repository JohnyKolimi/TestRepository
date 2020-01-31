package interfaceDemo;

public class AdvanceCal1 implements Calc{

	public static void main(String[] args) {
		
		Calc obj1=new AdvanceCal1();
		
		
		obj1.add();
		obj1.sub();
		
		
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
