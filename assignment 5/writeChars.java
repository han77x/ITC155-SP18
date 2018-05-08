package Assignment5;

public class writeChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("<");
		String str2 = new String("*");
		String str3 = new String(">");
		
		
		
		for (int index=1;index<=10;index++)
			System.out.println("writeChars("+index+");"
					+ "\t"+writeChars(index));
			
		}
	
	public static String writeChars(int n) {
		//base case
		String asterick="*";
		String doubleAsterick="**";
		String less="<";
		String greater=">";
		
	        if(n==1)
	        	return asterick;
	        else if(n==2)
	        	return doubleAsterick;
	        else 
	        	return less+writeChars(n-2)+greater;
	}
}
				
