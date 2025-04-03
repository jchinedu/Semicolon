import java.util.Scanner;
public class GasMileage {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int TotalMilesDriven = 0;
int TotalGallonsUsed = 0;
int counter =0;
int increament =0;
double AverageMiles = 0;
double AverageGallons = 0;
int GallonsUsed = 0;
System.out.print("ENTER MILES DRIVEN OR -1 TO QUIT: ");
int MilesDriven = input.nextInt();
while(MilesDriven != -1) {
TotalMilesDriven += MilesDriven;
counter = counter + 1;
System.out.print("ENTER MILES DRIVEN OR -1 TO QUIT: ");
MilesDriven = input.nextInt();
}
while(GallonsUsed != -1) {
TotalGallonsUsed += GallonsUsed;
increament = increament + 1;
System.out.print("ENTER THE NUMBER OF GALLONS OR -1 TO QUIT: ");
GallonsUsed = input.nextInt();
}
if(counter != 0) {
AverageMiles= (double) TotalMilesDriven / counter;
System.out.printf("%n total of the %d Miles entered is %d%n", counter, TotalMilesDriven);
System.out.printf("Miles average is %.2f%n", AverageMiles);}
else {
System.out.println("sorry no miles was entered");
}
if(increament != 0) {
AverageGallons= (double) TotalGallonsUsed / increament;
System.out.printf("%n total of the %d gallons entered is %d%n", increament, TotalGallonsUsed);
System.out.printf("gallons average is %.2f%n", AverageGallons);}
else {
System.out.println("sorry no gallons used");
}
double MilesPerGallon = AverageMiles / AverageGallons;
System.out.printf("%n the milespergallon of the figures entered is %.2f%n", MilesPerGallon);
}
}