public class TabularForm {
 public static void main(String[] args) {
    int num = 6;
    int counter = 1;
    int multiple = 1;
    int cube = 1;
    int fourth = 1;
     System.out.printf("%-10s%-10s%-10s%-10s%n", "N", "N2", "N3", "N4");
     while(counter < num) {
        multiple =counter * counter;
	cube =counter * counter * counter;
        fourth =counter * counter * counter * counter;
        System.out.printf("%-10d%-10d%-10d%-10d\n", counter, multiple, cube, fourth);
        counter++;
     

       
   }
    
}
 }
      