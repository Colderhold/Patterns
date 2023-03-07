import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        int i, j, k, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Rows: ");
        n = sc.nextInt();
        
        for (i = 1; i <= n; i++) {
            for (j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}