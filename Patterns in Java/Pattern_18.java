import java.util.Scanner;

public class Pattern_18 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter No of Rows: ");
int n = sc.nextInt();
char ch;

    for (int i = 1; i <= n; i++) {
        ch = 'A';
        for (int j = 1; j <= i; j++) {
            System.out.print(ch + " ");
            ch++;
        }
        System.out.println();
    }
}
}