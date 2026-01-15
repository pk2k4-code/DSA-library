//Given 2 strings, a and b, return the number of the positions where they contain the same
// length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings
// appear in the same place in both strings.
//
//stringMatch("xxcaazz", "xxbaaz") → 3
//stringMatch("abc", "abc") → 2
//stringMatch("abc", "axc") → 0

package imp_ques;
import java.util.*;
public class StringMatch_ques {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words a and b: ");
        String a = sc.nextLine();
        String b = sc.nextLine();
        int count = stringMatch(a,b);
        System.out.println("The number of substrings are: " + count);
        sc.close();
    }
    public static int stringMatch(String a, String b) {
        int count = 0;
        if(a.length()>=b.length()){
            for(int i = 0; i<b.length()-1; i++){
                if(a.substring(i,i+2).equals(b.substring(i,i+2))){
                    count++;
                }
            }
        }
        else{
            for(int j = 0; j<a.length()-1; j++){
                if(a.substring(j,j+2).equals(b.substring(j,j+2))){
                    count++;
                }
            }
        }
        return count;
    }
}
