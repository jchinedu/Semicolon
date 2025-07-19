public class Kata {
  public static String reverseWords(final String original) {
    String newWord = "";
    String word = "";

    for (int i = 0; i < original.length(); i++) {
      char c = original.charAt(i);

      if (c != ' ') {
        word = c + word;
      } else {
        newWord += word + " ";
        word = "";
      }
    }

    newWord += word;

    return newWord;
  }
}
