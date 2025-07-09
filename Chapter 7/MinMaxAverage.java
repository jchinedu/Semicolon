public class MinMaxAverage{
public static void main(String[] args){
   if (args.length == 0){
     System.out.print("no argument entered");
	return;
}
	try{
	int first = Integer.parseInt(arg[0]);
	int min = first;
	int max = first;
	for(String arg : args){
	int num = Integer.parseInt(arg)

	if(num > max){
	max = num;
	}
	if(num < min){
	min = num;
	}
 }
 double average = (min + max) / 2;
System.out.print("the minimun is " + min);
System.out.print("the maximum is " + max);
System.out.print("the average is " + average);
}catch(NumberFormatExceotion e){
System.out.print("the number entered is invalid, sorry");
	
