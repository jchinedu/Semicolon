7public class TabularOutput{
public static void main(String[] args) {
int num = 6;
int n = 1;
System.out.printf("%-10s%-10s%-10s%-10s\n", "N", "N^2", "N^3", "N^4");
for(n = 1; n <= num; n++) {
int n2 = n*n;
int n3 = n*n*n;
int n4 = n*n*n*n;
System.out.printf("%-10d%-10d%-10d%-10d\n", n, n2, n3, n4);
}
}
}