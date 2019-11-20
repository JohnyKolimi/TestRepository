package JavaStarPattern;

import org.testng.annotations.Test;

public class Pattern1 {
	@Test
	public void starPattern1()
	{
		for(int i=0;i<=8;i++) 
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("Test Complete.");
	}

}

/* Output

*
**
***
****
*****
******
*******
********
*********

*/