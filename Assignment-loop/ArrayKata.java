public class ArrayKata {
 
public static int maximumin(int[] ArrayOfIntegers) {
int max = ArrayOfIntegers[0];
for(int i = 1; i < ArrayOfIntegers.length; i++) {
    if(ArrayOfIntegers[i] > max) {
      max = ArrayOfIntegers[i];
	
}
}
	return max;
}
public static int minimumin(int[] ArrayOfIntegers) {
int min = ArrayOfIntegers[0];
for(int i = 1; i < ArrayOfIntegers.length; i++) {
    if(ArrayOfIntegers[i] < min) {
      min = ArrayOfIntegers[i];
	
}
}
	return min;
}
public static int sumOf(int[] ArrayOfIntegers) {
int total = 0;
for(int i = 0; i < ArrayOfIntegers.length; i++) {
      total += ArrayOfIntegers[i];
	
}
	return total;

}
public static int sumOfEvenNumbersIn(int[] ArrayOfIntegers) {
int total = 0;
for(int i = 0; i < ArrayOfIntegers.length; i++) {
      if(ArrayOfIntegers[i] % 2 == 0) {
      total += ArrayOfIntegers[i];	
}
}
	return total;
}

public static int sumOfOddNumbersIn(int[] ArrayOfIntegers) {
int total = 0;
for(int i = 0; i < ArrayOfIntegers.length; i++) {
      if(ArrayOfIntegers[i] % 2 != 0) {
      total += ArrayOfIntegers[i];	
}
}
	return total;
}
public static int[] maximumAndMinimumOf(int[] ArrayOfIntegers) {
int min = ArrayOfIntegers[0]; int max = ArrayOfIntegers[0];
for(int i = 0; i < ArrayOfIntegers.length; i++) {
      if(ArrayOfIntegers[i] > max) {
	  max = ArrayOfIntegers[i];
	}
      	if(ArrayOfIntegers[i] < min) {
	  min = ArrayOfIntegers[i];
	}
}
	return new int[]{max, min};
}
public static int noOfOddNumbersIn(int[] ArrayOfIntegers) {
	int count = 0; 
for(int i = 0; i < ArrayOfIntegers.length; i++) {
      if(ArrayOfIntegers[i] % 2 != 0) {
	   count++;
}
	
}
	return count;
}
   public static int noOfEvenNumbersIn(int[] ArrayOfIntegers) {
	int count = 0; 
for(int i = 0; i < ArrayOfIntegers.length; i++) {
      if(ArrayOfIntegers[i] % 2 == 0) {
	   count++;
	  }
}
	return count;
}
public static int[] evenNumbersIn(int[] ArrayOfIntegers) {
	int[] evenNumbers = new int [noOfEvenNumbersIn(ArrayOfIntegers)];
	int count = 0;
        for(int i = 0; i < ArrayOfIntegers.length; i++) {
         if  (ArrayOfIntegers[i] % 2 == 0) {
	 evenNumbers[count++] = ArrayOfIntegers[i];
	     	
} 
}
	return evenNumbers;	
}
public static int[] oddNumbersIn(int[] ArrayOfIntegers) {
	int[] oddNumbers = new int[noOfOddNumbersIn(ArrayOfIntegers)];
	int count = 0;  
        for(int i = 0; i < ArrayOfIntegers.length; i++) {
         if (ArrayOfIntegers[i] % 2 != 0) {
	 oddNumbers[count++] = ArrayOfIntegers[i];
	     	
} 
}
	return oddNumbers;
}
public static int[] squareNumbersIn (int[] ArrayOfIntegers) {
   int[] square = new int[ArrayOfIntegers.length];
   for(int i=0; i < ArrayOfIntegers.length; i++) {
	 square[i] = ArrayOfIntegers[i] * ArrayOfIntegers[i];
}
	return square;
}
	
}

