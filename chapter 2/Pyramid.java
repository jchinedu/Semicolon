import java.util.Scanner;
public class Pyramid {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("please insert the estimated number of stones used");
	int EspectedNumberOfStones = input.nextInt();

	System.out.print("please insert the average weight of each stone in tons");
	double AverageWeightOfStones = input.nextDouble();

	System.out.print("please insert the number of years taken to build the pyramid");
	int NumberOfYears = input.nextInt();
	double TotalWeight = EspectedNumberOfStones * AverageWeightOfStones;

	System.out.printf("the total weight of the pyramid is  : %.2f%n", TotalWeight);
	double WeightPerYear = TotalWeight/20.0;

	System.out.printf("the weight of the pyramid built per year is : %.2f%n", WeightPerYear);
	double WeightpPerHour = TotalWeight / (20.0 * 365 * 24.0);

	System.out.printf("the weight of the pyramid built per hour is : %.2f%n", WeightpPerHour);
	double WeightPerMinute = TotalWeight/ (20.0 * 365 * 24.0 * 60);
	System.out.printf("the weight of the pyramid built per year is : %.2f%n", WeightPerMinute);
}
}


