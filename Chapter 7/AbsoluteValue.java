public class AbsoluteValue{
public static void main(String[] args) {
 System.out.print("Absolute value for input numbers: ");
	for(String arg : args){
	try{
	int number = Integer.parseInt(arg);
	int absolute = Math.abs(number);
	System.out.println("Absolute value of" + number +" is " + absolute);
	}catch(NumberFormatException e) {
	System.out.println("Invalid number format: " + arg);
            }
        }
    }
}