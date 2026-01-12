// Q. Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak"
// are removed, but the "a" can be any char. The "yak" strings will not overlap.
//
//stringYak("yakpak") → "pak"
//stringYak("pakyak") → "pak"
//stringYak("yak123ya") → "123ya"


package imp_ques;
import java.util.*;
public class yak_ques {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = sc.nextLine();
        String word = stringYak(str);
        System.out.println("The modified word is " + word);
    }
    public static String stringYak(String str) {
        String result = "";

        for (int i=0; i<str.length(); i++) {
            // Look for i starting a "yak" -- advance i in that case
            if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
                i =  i + 2;
            } else { // Otherwise do the normal append
                result = result + str.charAt(i);
            }
        }

        return result;
    }
}
