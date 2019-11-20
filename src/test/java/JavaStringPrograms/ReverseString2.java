package JavaStringPrograms;

import org.testng.annotations.Test;

public class ReverseString2 {

	@Test
	public void reverseString()
	{
		String input="Hello world";
		
		char[] charArray=input.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
		}
		   
		System.out.println();
		
	}
}