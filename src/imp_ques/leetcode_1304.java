/*Given an integer n, return any array containing n unique integers such that they add up to 0.

Example 1:
Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

Example 2:
Input: n = 3
Output: [-1,0,1]

Example 3:
Input: n = 1
Output: [0]
*/



//This solution workd but is risky due to the patching of skipped index we do in else block, if someone changes the logic of the array or loop, it may break.

/*class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n%2!=0){
            for(int i = 0; i<n; i++){
                arr[i] = (-n/2) + i;
            }
        }
        else{
            for(int j = 0; j<n; j++){
                if((-n/2) + j == 0){continue;}
                arr[j] = (-n/2) + j;
            }
            arr[n/2] = (-(arr[0]));
        }
        return arr;
    }
}*/


//This is a better approach:
package imp_ques;
public class leetcode_1304 {
    public int[] sumZero(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n / 2; i++) {
            int val = i + 1;

            arr[i] = -val;

            arr[n - 1 - i] = val;
        }

        return arr;
    }
}
