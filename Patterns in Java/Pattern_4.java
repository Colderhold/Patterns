import java.util.Scanner;

public class Pattern_4 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter No of Rows: ");
int rows = input.nextInt();

for (int i = rows; i >= 1; i--) {
  for (int space = 0; space < rows - i; space++) {
    System.out.print("  ");
  }
  for (int j = i; j <= 2 * i - 1; j++) {
    System.out.print("* ");
  }
  for (int j = 0; j < i - 1; j++) {
    System.out.print("* ");
  }
  System.out.println();
}
}
}



