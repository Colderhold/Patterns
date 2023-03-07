import java.util.Scanner;

public class Pattern_10 {
public static void main(String[] args) {
int i, j, n, c = 1;
Scanner in = new Scanner(System.in);
System.out.print("Enter No of Rows: ");
n = in.nextInt();

    for (i = 1; i <= n; i++) {
        for (j = 1; j <= i; j++) {
            System.out.print(c + " ");
            c++;
        }
        System.out.println();
    }
}
}