import java.util.Scanner;
public class Pyramidd {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("please insert the estimated number of stones used");
	int EspectedNumberOfStones = input.nextInt();

	System.out.print("please insert the average weight of each stone in tons");
	double AverageWeightOfStones = input.nextDouble();

	System.out.print("please insert the number of years taken to build the pyramid");
	int NumberOfYears = input.nextInt();
	double TotalWeight = EspectedNumberOfStones * AverageWeightOfStones;
