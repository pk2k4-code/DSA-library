// Q.Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens"
// yields "kien".
//
//altPairs("kitten") → "kien"
//altPairs("Chocolate") → "Chole"
//altPairs("CodingHorror") → "Congrr"

package imp_ques;
import java.util.*;
public class Altpairs_ques {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = sc.nextLine();
        String word = altPairs(str);
        System.out.println("The modified word is " + word);
    }
    public static String altPairs(String str) {
        String word = "";
        for(int i = 0; i<str.length(); i++){
            if(i==0||i==1||i%4==0||i%4==1){
                word = word + str.substring(i,i+1);
            }
        }
        return word ;
    }
}
