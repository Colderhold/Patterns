import java.util.Scanner;

public class Pattern_3 {
public static void main(String[] args) {
int rows, space;
Scanner sc = new Scanner(System.in);
System.out.print("Enter No of Rows: ");
rows = sc.nextInt();

for (int i=1, k=0; i<=rows; i++, k=0) {
for (space=1; space<=rows-i; space++) {
System.out.print("  ");
}
while (k != 2*i-1) {
System.out.print("* ");
k++;
}
System.out.println();
}
}
}