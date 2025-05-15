public class Numbers {
 public static void main(String[] args) {
	for (int asterisks = 7; asterisks >= 1; asterisks--){
		for (int index = 1; index <= 7 - asterisks; index++) {
			System.out.print(" ");
		}
		for (int number = 1; number <= asterisks; number++){
			System.out.print(number);
		}
		System.out.println();
	}

	System.out.println("Pattern D");
	for (int asterisks = 1; asterisks <= 7; asterisks++){
		for(int next = 1; next <= 7 - asterisks ; next++){
			System.out.print(" ");
		}
		for (int number = 1; number <= asterisks; number++){
			System.out.print(number);
		}
		System.out.println();
	}
}
 }