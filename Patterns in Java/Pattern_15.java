import java.util.Scanner;

public class Pattern_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No of Rows ");
		int n = sc.nextInt();
		int i, j, k, l = 1;
		
		for (i = 1; i <= n; i++) {
			for (j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			
			for (k = 1; k <= l; k++) { 
				System.out.print(k);
			}            
			l = l + 2;    
			System.out.println();
		}
	}
}