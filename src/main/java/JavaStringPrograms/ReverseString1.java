// Java program to ReverseString using StringBuilder 

package JavaStringPrograms;

import org.testng.annotations.Test;

public class ReverseString1 {

	@Test
	public void reverseStringWithStrinBuilder()
	{
		String input="Welcome to JAVA world";
		
		StringBuilder input1= new StringBuilder();
		
		input1.append(input);
		
		input1=input1.reverse();
		
		System.out.println(input1);
	}
}
