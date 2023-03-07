import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Rows: ");
        n = sc.nextInt();
        
        int space = n - 1;
        
        for (i = 0; i < n; i++) {
            for (j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
            space--;
        }
        space = 0;
        for (i = n; i > 0; i--) {
            for (j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }   
            System.out.println();
            space++;
        }
    }
}