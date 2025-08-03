public class PangramChecker {
    public boolean check(String sentence) {
        sentence = sentence.toLowerCase(); 
          boolean[] seen = new boolean[26];
for (int i = 0; i < sentence.length(); i++) {
char c = sentence.charAt(i);
 if (c >= 'a' && c <= 'z') {
 seen[c - 'a'] = true; 
            }
 }
        for (boolean letterSeen : seen) {
if (!letterSeen) {
 return false; 
            }
        }

        return true;
    }
               
       
            
         
               
           

            
        
}

        

   