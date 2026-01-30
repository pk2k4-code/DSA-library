/*You are given a large integer represented as an integer array digits, where each digits[i] is the
ith digit of the integer. The digits are ordered from most significant to least significant in
left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.

Example:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 */

                              //NOT OPTIMIZED


package imp_ques;

public class plusOne_66 {
    public int[] plusOne(int[] digits) {
        int size = 0;
        int count = 0;
        if(digits[digits.length-1]==9){
            for(int i = digits.length-1; i>=0; i--){
                if(digits[i]==9){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count==digits.length){
                size = digits.length+1;
                int[] arr = new int[size];
                arr[0]=1;
                for(int j = 1; j<arr.length; j++){
                    arr[j]=0;
                }
                return arr;
            }
            else if(count<digits.length){
                size = digits.length;
                int[] arr = new int[size];
                digits[digits.length-1-count]++;
                for(int k = digits.length-count; k<digits.length; k++){
                    digits[k]=0;
                }
                for(int j = 0; j<digits.length; j++){
                    arr[j]=digits[j];
                }
                return arr;
            }
        }
        else{
            size = digits.length;
            int[] arr = new int[size];
            for(int i = 0; i<digits.length-1; i++){
                arr[i]=digits[i];
            }
            arr[digits.length-1] = (digits[digits.length-1]+1);
            return arr;
        }

        return digits;
    }
}
