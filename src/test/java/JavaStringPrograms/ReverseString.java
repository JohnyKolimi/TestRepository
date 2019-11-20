// Java program to ReverseString using ByteArray. 

package JavaStringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="Hello World";
		
		byte[] StrAsBytesArray=input.getBytes();
		
		byte[] result=new byte[StrAsBytesArray.length];
		
		for(int i=0;i<StrAsBytesArray.length;i++)
		{
			result[i]=StrAsBytesArray[StrAsBytesArray.length-i-1];
			
		}
		
		System.out.println(new String(result));
	}

}
