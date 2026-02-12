/*Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in
its column.

Example 1:
Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.

Example 2:
Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.

Example 3:
Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.
 */

package imp_ques;
import java.util.ArrayList;
import java.util.List;
public class leetcode_1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> alist = new ArrayList<>();
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                boolean res = true;
                for(int k = 0; k<matrix[i].length; k++){
                    if(k==j){continue;}
                    if(matrix[i][j]>matrix[i][k]){
                        res = false;
                        break;
                    }
                }
                if(res){
                    for(int m = 0; m<matrix.length; m++){
                        if(m==i){continue;}
                        if(matrix[i][j]<matrix[m][j]){
                            res = false;
                            break;
                        }
                    }
                }
                if(res){alist.add(matrix[i][j]);}
            }
        }
        return alist;
    }
}
