public class MinMaxAverage{
public static void main(String[] args){
   if (args.length == 0){
     System.out.print("no argument entered");
	return;
}
	try{
	int first = Integer.parseInt(args[0]);
	int min = first;
	int max = first;
	for(String arg : args){
	int num = Integer.parseInt(arg);

	if(num > max){
	max = num;
	}
	if(num < min){
	min = num;
	}
 }
 double average = (min + max) / 2;
System.out.println("the minimun is " + min);
System.out.println("the maximum is " + max);
System.out.println("the average is " + average);
}catch(NumberFormatException e){
System.out.print("the number entered is invalid, sorry");
}
}
}
	
