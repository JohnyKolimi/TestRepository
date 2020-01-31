package interfaceDemo;

public class AdvanceCal2 implements Calc{

	public static void main(String[] args) {
		
		// You cannot create object of an interface
		//Calc obj1=new Calc();
		
		//AdvanceCal obj1=new Calc();
		// You cannot create object of an interface because it has abstract method
				
		
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
