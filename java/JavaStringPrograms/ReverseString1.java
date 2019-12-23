// Java program to ReverseString using StringBuilder 

package JavaStringPrograms;

import org.testng.annotations.Test;

public class ReverseString1 {

	@Test
	public void reverseStringWithStrinBuilder()
	{
		String input="Welcome to JAVA world";
		
		StringBuilder input1= new StringBuilder(input);
				
		input1=input1.reverse();
		
		System.out.println(input1);
					
	}
	@Test
	public void reverseStringWithStrinBuffer()
	{
		String input="Welcome to Automation";
		
        StringBuffer input2=new StringBuffer(input);
		
		input2=input2.reverse();
		
		System.out.println(input2);
	}
}
