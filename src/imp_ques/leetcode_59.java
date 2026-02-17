/*Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

Example:
Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]
 */


package imp_ques;
public class leetcode_59 {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int num = 1;
        int top =0, bottom = n-1;
        int left = 0, right = n-1;
        while(top<=bottom && left<=right){
            for(int j = left; j<=right; j++){
                mat[top][j] = num++;}
            top++;
            for(int j = top; j<=bottom; j++){
                mat[j][right] = num++;}
            right--;
            if(top<=bottom){
                for(int j = right; j>=left; j--){
                    mat[bottom][j] = num++;}
                bottom--;
            }
            if(left<=right){
                for(int j = bottom; j>=top; j--){
                    mat[j][left] = num++;}
                left++;
            }
        }
        return mat;
    }
}
