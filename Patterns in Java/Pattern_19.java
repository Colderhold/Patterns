import java.util.Scanner;

public class Pattern_19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows, space;
    char ch = 'A';
    System.out.print("Enter No of Rows: ");
    rows = sc.nextInt();

    for (int i = 1, k = 0; i <= rows; i++, k = 0) {
      for (space = 1; space <= rows - i; space++) {
        System.out.print("  ");
      }
      while (k != 2 * i - 1) {
        System.out.print(ch + " ");
        k++;
      }
      System.out.println();
      ch++;
    }
  }
}