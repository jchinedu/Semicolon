  public class Interest {
    public static void main(String[] args) {
       double principal = 1000.0; 
       double rate = 0.05;
       double rate2 = 0.06;
       double rate3 = 0.07;
       double rate4 = 0.08;
       double rate5 = 0.09;
       double rate6 = 0.1;               
         System.out.printf("%-10s%-10s%n", "Year", "Amount on deposit");
        for(int year = 1; year <= 10; ++year) {
         double amount = principal * Math.pow(1.0 + rate, year);
        System.out.printf("%-10d%,10.2f%n", year, amount);
} 
    System.out.printf("\n%-10s%-10s%n", "Year2", "Amount on deposit");
        for(int year2 = 1; year2 <= 10; ++year2) {
         double amount = principal * Math.pow(1.0 + rate2, year2);
        System.out.printf("%-10d%,10.2f%n", year2, amount);
} 
       System.out.printf("\n%-10s%-10s%n", "Year3", "Amount on deposit");
        for(int year3 = 1; year3 <= 10; ++year3) {
         double amount = principal * Math.pow(1.0 + rate3, year3);
        System.out.printf("%-10d%,10.2f%n", year3, amount);
} 
           
        System.out.printf("\n%-10s%-10s%n", "Year4", "Amount on deposit");
        for(int year4 = 1; year4 <= 10; ++year4) {
         double amount = principal * Math.pow(1.0 + rate4, year4);
        System.out.printf("%-10d%,10.2f%n", year4, amount);
} 
       System.out.printf("\n%-10s%-10s%n", "Year5", "Amount on deposit");
        for(int year5 = 1; year5 <= 10; ++year5) {
         double amount = principal * Math.pow(1.0 + rate5, year5);
        System.out.printf("%-10d%,10.2f%n", year5, amount);
} 
       System.out.printf("\n%-10s%-10s%n", "Year6", "Amount on deposit");
        for(int year6 = 1; year6 <= 10; ++year6) {
         double amount = principal * Math.pow(1.0 + rate6, year6);
        System.out.printf("%-10d%,10.2f%n", year6, amount);
} 

}
}
       
 

       



           