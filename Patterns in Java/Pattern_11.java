import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        int i, n, c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Rows: ");
        n = sc.nextInt();
        
        for (i = 1; i <= n; i++) {
            if (i == 1) {
                c = i;
            } else {
                c = c * 11;
            }
            System.out.println(c);
        }
    }
}