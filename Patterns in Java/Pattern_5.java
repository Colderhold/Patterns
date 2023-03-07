import java.util.Scanner;

public class Pattern_5 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter No of Rows: ");
int n = input.nextInt();

for (int i = 1; i <= n; i++) {
  for (int j = n; j >= i; j--) {
    System.out.print("* ");
}
  System.out.println();
}
}
}