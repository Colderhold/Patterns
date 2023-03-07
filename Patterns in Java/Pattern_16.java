import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, n, space = 0;
        System.out.print("Enter No of Rows: ");
        n = scan.nextInt();

        for (i = n; i >= 1; i--) {
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space++;
        }
    }
}