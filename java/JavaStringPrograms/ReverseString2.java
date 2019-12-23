//@Author : Johny Hussain
// Java program to ReverseString using CharArray. 

package JavaStringPrograms;

import org.testng.annotations.Test;

public class ReverseString2 {

	@Test
	public void reverseEachWordOfAString()
	{
		String str="Welcome to coding world";
		
		String revstr="";
		
		String[] strArray=str.split(" ");
		
		System.out.println("String divided into "+strArray.length+" words.");
		
		for(int i=0;i<=strArray.length-1;i++) 
		{
			String word=strArray[i];
			String revword="";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				revword=revword+word.charAt(j);
			}
			
			revstr=revstr+revword+" ";
		}
		
		System.out.println(revstr);
	}
}
