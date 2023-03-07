import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Rows: ");
        n = sc.nextInt();
        
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}