public class Rot13 {
    public static String encryptText(String text) {
        StringBuilder result = new StringBuilder();
        
        for (char ch : text.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                char rotated = (char) ((ch - 'a' + 13) % 26 + 'a');
                result.append(rotated);
            } else if (ch >= 'A' && ch <= 'Z') {
                char rotated = (char) ((ch - 'A' + 13) % 26 + 'A');
                result.append(rotated);
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(encryptText("Hello, world"));
    }
}
