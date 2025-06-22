public class TotalArea {
	public static void main(String[] args) {
	CircleWithPrivateDataFields[] circleArray;

	circleArray = createCircleArray();
	printCircleArray(circleArray);
}
public static CircleWithPrivateDataFields[] circleArray() {
	CircleWithPrivateDataFields[] circleArray= new CircleWithPrivateDataFields[5];

for(int i = 0; i < circleArray.length; i++){
