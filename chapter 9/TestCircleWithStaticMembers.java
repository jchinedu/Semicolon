public class TestCircleWithStaticMembers {
	public static void main(String[] args) {
	System.out.println("before creating objects"); 
	System.out.println("the number of circle object is " + CircleWithStaticMember.numberOfObjects);

	CircleWithStaticMember c1 = new CircleWithStaticMember();
	System.out.println("/nAfter creating c1");
	System.out.println("c1: radius (" + c1.radius + ") and number of circle objects (" + c1.numberOfObjects + ")");

	CircleWithStaticMember c1 = new CircleWithStaticMember(5);
	c1.radius = 9;

	System.out.println("/nAfter creating c2 and modifying c1");
	System.out.println("c1: radius (" + c1.radius + ") and number of circle objects c" + c1.numberOfObjects + ")");
	System.out.println("c2: radius (" + c2.radius + ") and number of circle objects (" + c2.nnumberOfObjects + ")")


	