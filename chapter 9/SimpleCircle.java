public class SimpleCircle {
 double radius;
SimpleCircle() {
	radius = 1;
}
public static double SimpleCircle(double newRadius) {
 radius = newRadius;
}

public static double getArea(){
 return radius * radius * math.pi;
}

public static double getPerimeter(){
 return 2 * radius * math.pi;
}

public static void setRadius(double newRadius){
  radius = newRadius;
}
}