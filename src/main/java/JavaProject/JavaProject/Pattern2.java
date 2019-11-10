package JavaProject.JavaProject;

import org.testng.annotations.Test;

public class Pattern2 {
	@Test
	public void starPattern2()
	{
		for(int i=8;i>=0;i--) 
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		}

}
