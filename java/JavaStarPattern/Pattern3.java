package JavaStarPattern;

import org.testng.annotations.Test;

public class Pattern3 {

	@Test
	public void starpattern3()
	{
		
		for(int i=0;i<=8;i++)
		{
			
			for(int j=8;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
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