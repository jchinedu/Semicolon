public class SquareDigit {

  public int squareDigits(int n) {
  StringBuilder result = new StringBuilder();
    String numberStr = String.valueOf(n);
    for (char digitChar : numberStr.toCharArray()) {
      int digit = Character.getNumericValue(digitChar);
      int square = digit * digit;
      