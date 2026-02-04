/*The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
        Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021       */



// The below code wont work as in rev if it starts from zeroes they will be lost, also we take int here, if
// numbers given are very long it will overflow
package imp_ques;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class leetcode_989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int n = 0;
        for(int i = 0; i<num.length; i++){
            n = n*10 + num[i];
        }
        int nnew = n + k;
        int rev = 0;
        int temp = nnew;
        while(temp>0){
            rev = rev*10 + temp%10;
            temp/=10;
        }
        while(rev>0){
            res.add(rev%10);
            rev/=10;
        }
        return res;
    }
}

// The correct solution will be:
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k = k + num[i];
            }
            result.add(k % 10);
            k = k / 10;
            i--;
        }

        Collections.reverse(result);
        return result;
    }
}