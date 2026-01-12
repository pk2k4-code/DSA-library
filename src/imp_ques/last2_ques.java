//Given a string, return the count of the number of times that a substring length 2 appears in the
// string and also as the last 2 chars of the string, so "hixxxhi" yields 1
//(we won't count the end substring).
//
//last2("hixxhi") → 1
//last2("xaxxaxaxx") → 1
//last2("axxxaaxx") → 2

package imp_ques;
import java.util.*;
public class last2_ques {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = sc.nextLine();
        int count = last2(str);
        System.out.println("The number of substrings are: " + count);
        sc.close();
    }
    public static int last2(String str) {
        int count = 0;
        if(str.length()>=4){
            String check = str.substring(str.length()-2);
            for(int i = 0; i<str.length()-2; i++){
                if((str.substring(i, i+2)).equals(check)){
                    count++;
                }
            }
        }
        return count;
    }
}
