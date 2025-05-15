public class primeNumber {
 public static void main(String[] args) {
	int count= 0;
	int num = 10;
	int index;
     for( index = 2; index <= num; index++) {
      	count = 0;	
	for(int j = 1; j <= num; j++){
	if(index % j == 0) {
	count++;
	}
	}
	if(count == 2) {
	System.out.println(index);
	}
	}
	
}
 }