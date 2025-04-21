import java.util.Scanner;
public class PositiveInteger {
  public static void main(String[] args) {
	int count = 1;
	int total = 0;
	Scanner input = new Scanner(System.in);
	System.out.print("insert a number: ");
	int number = input.nextInt();
	System.out.printf("%s\t%s\t%s\t\n", "number", "count", "Total");
	while(count <= 12) {
	total = number * count;
	System.out.printf("%d\t%d\t%d\t\n ", number, count, total);
	count++;
	}
}
 }