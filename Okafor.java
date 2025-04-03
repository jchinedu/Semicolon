import java.util.Scanner;

public class Okafor {
	public static void main(String[] args){
	 Scanner input = new Scanner(System.in);
	  int mileageCounter = 1;
	  int TotalMileageDriven = 0;
	  int TotalGallonUsed = 0;
	  int milesPerGallon = 0;
	  int totalMilesPerGallon = 0;
	  int TotalMilesDriven = 0;
		while(mileageCounter <= 3) {
		   System.out.print("Enter the Miles driven: ");
		int MilesDriven = input.nextInt();
		   System.out.println("Enter Gallon Used: ");
		int GallonUsed = input.nextInt();
		milesPerGallon = MilesDriven / GallonUsed;
		TotalMilesDriven += MilesDriven;
		TotalGallonUsed  += GallonUsed;
		totalMilesPerGallon = TotalMilesDriven / TotalGallonUsed;
		mileageCounter++;
                }
          System.out.printf("this is mileage per gallon : %d%n", milesPerGallon);
	  System.out.printf("this is total MPG : %d%n", totalMilesPerGallon);
}
 } 

			 
		