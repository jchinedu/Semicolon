public class TotalArea {
	public static void main(String[] args) {
	CircleWithPrivateDataFields[] circleArray;

	circleArray = createCircleArray();
	printCircleArray(circleArray);
}
public static CircleWithPrivateDataFields[] circleArray() {
	CircleWithPrivateDataFields[] circleArray= new CircleWithPrivateDataFields[5];

for(int i = 0; i < circleArray.length; i++){
	circleArray[i] = new CircleWithPrivateDataFields(Math.random() * 100);
}

 return circleArray;
}
public static void printCircleArray(CircleWithPrivateDataFields[] circleArray){
 System.out.printf("%-30s%-15s\n","Radius","Area");
 for (int i = 0; i < circleArray.length; i++) {
 System.out.printf("%-30s%-15s\n", cricleArray[i].getRadius(), circleArray[i].getArea());
}
System.out.print("------------------------------------------------------------");

System.out.printf("%-30s%-15f\n", "the total area of circle is", sum(circleArray));
}	
public static double sum(CircleWithPrivateDataFields[] circleArray){
double sum = 0;

for(int i = 0; i < circleArray.length; i++)
	sum += circleArray[i].getArea();

	return sum;
}
 }