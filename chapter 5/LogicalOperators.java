public class LogicalOperators {
   public static void main (String[] args) {
    System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                     "conditional AND (&&)", "false && false", (false && false),
                     "false && true", (false && true),
                     "true && false", (true && false),
                     "true && true", (true && true));
  System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                     "conditional OR (|| )", "false ||  false", (false || false),
                     "false || true", (false ||  true),
                     "true ||  false", (true ||  false),
                     "true ||  true", (true ||  true));
  System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                     "Boolean logical AND (&)", "false & false", (false & false),
                     "false & true", (false & true),
                     "true & false", (true & false),
                     "true & true", (true & true));
  System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                     "Boolean logical inclusive OR (|)", 
                     "false | false", (false | false),
                     "false | true", (false | true),
                     "true | false", (true | false),
                     "true | true", (true | true));
 System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                     "Boolean logical exclusive OR (^)", 
                     "false ^ false", (false ^ false),
                     "false ^ true", (false ^ true),
                     "true ^ false", (true ^ false),
                     "true ^ true", (true ^ true));
System.out.printf("%s%n%s: %b%n%s: %b%n", "logical NOT (!)", 
                 "!false",(!false), "!true", (!true));
}
 }
 

