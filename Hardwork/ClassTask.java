public class ClassTask{
public static int Array(int[] number){
number = {9,6,8,11,12};
int largest = number[0];
int secondlargest = number[0];
 for(int i = 0; i < number.length; i++){
    if(number[i] > largest) {
      secondlargest = largest;
      largest = number[i];
     }else if(number[i] >= secondlargest && number[i] != largest){
        secondlargest = number[i];
      }
}
  return secondlargest;
}
  
}       
       