public class AverageCaluclator{
public static double average(int... numbers){
 if(numbers.length == 0){
	System.out.print("no numbers entered");
	return 0.0;
}
	int sum = 0;
	for(int num : numbers){
	sum += num;
}
	return (double) sum / numbers.length;
}
public static void main(String[] args){
System.out.print(average(2,3,4,5,6,7,8,9));
}
}
	 	
	