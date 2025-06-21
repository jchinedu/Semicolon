public class CircleWithStaticMembers {
	double radius;
	static int numberOfObjects = 0;
CircleWithStaticMembers(){
 radius = 1;
 numberofobjects++;
}

CircleWithStaticMembers(double newRadius){
 radius = newRadius;
 numberofobjects++;
}
