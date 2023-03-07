import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, space;
        char ch = 'A';
        System.out.print("Enter No of Rows: ");
        rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) {
            for (space = 0; space < rows - i; space++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(ch + " ");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            ch++;
        }
    }
}