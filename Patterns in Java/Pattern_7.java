import java.util.Scanner;

public class Pattern_7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter No of Rows: ");
    int rows = sc.nextInt();
    
    for (int i = 1, k = 0; i <= rows; i++, k = 0) {
      for (int space = 1; space <= rows - i; space++) {
        System.out.print("  ");
      }
      while (k != 2 * i - 1) {
        System.out.print(i + " ");
        k++;
      }
      System.out.println();
    }
  }
}