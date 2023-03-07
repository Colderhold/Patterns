import java.util.Scanner;

public class Pattern_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter No of Rows: ");
    int rows = sc.nextInt();
    
    for (int i = rows; i >= 1; i--) {
      for (int space = 0; space < rows - i; space++) {
        System.out.print("  ");
      }
      for (int j = i; j <= 2 * i - 1; j++) {
        System.out.print(j + " ");
      }
      for (int j = 1; j < i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}