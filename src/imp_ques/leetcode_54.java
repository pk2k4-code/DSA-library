/*Given an m x n matrix, return all elements of the matrix in spiral order.

Example
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
*/


package imp_ques;
import java.util.ArrayList;
import java.util.List;
public class leetcode_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0) return res;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) res.add(matrix[top][j]);
            top++;

            for (int j = top; j <= bottom; j++) res.add(matrix[j][right]);
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) res.add(matrix[bottom][j]);
                bottom--;
            }

            if (left <= right) {
                for (int j = bottom; j >= top; j--) res.add(matrix[j][left]);
                left++;
            }

            //Here we check for these 2 if again coz before this we updated top and right, but we check top<=bottom
            //again coz if this were a single row matrix then the bottom row which is also the top row here would
            //have printed backward
            //And same is the cse for left and right, if there were a single column matr


        }
        return res;
    }
}
