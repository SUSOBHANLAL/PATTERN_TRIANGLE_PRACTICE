package practice;

public class susobhan {
	public static void main(String args[]) {
		
		int n =4;
		for(int i=n;i>=1;i--) {
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
		
	}

}
