package JavaIntegerPrograms;

public class FindMissingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {-1,0,1,2,3,4,6,7,8,9,10}; 
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum);
		
		int sum1=0;
		for(int i=-1;i<=10;i++)
		{
			 sum1=sum1+i;
		}
		System.out.println(sum1);
		
		System.out.println("Missing number is "+(sum1-sum));
	}

}
