package writeSequence;


public class writeSequence {

	public static void main(String[] args) {
		writeSequence(1);
		System.out.println();
		writeSequence(2);
		System.out.println();
		writeSequence(3);
		System.out.println();
		writeSequence(4);
		System.out.println();
		writeSequence(5);
		System.out.println();
		writeSequence(6);
		System.out.println();
		writeSequence(7);
		System.out.println();
		writeSequence(8);
		System.out.println();
		writeSequence(9);
		System.out.println();
		writeSequence(10);
		System.out.println();
		}

	
	
	public static int writeSequence(int n) {
		//base case

	        if(n<1){
				return n;
			}
			if (n==1){
				System.out.print(n);
			}else if(n==2){
				System.out.print(n/2 + " ");
				System.out.print(n/2 + " ");
				
			}else if(n%2==0){
				System.out.print(n/2 + " ");
				writeSequence(n-2);
				System.out.print(n/2 + " ");
				
			}else if(n%2 ==1){
				System.out.print((n/2+1) + " ");
				writeSequence(n-2);
				System.out.print(" " + (n/2 + 1));


			}
			return n;
	}
	
}