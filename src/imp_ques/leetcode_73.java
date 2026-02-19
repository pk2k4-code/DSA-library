/*Given an m x n integer matrix 'matrix', if an element is 0, set its entire row and column to 0's.
You must do it in place.

Example:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

*/


package imp_ques;
public class leetcode_73 {
    public void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length*matrix[0].length];
        int[] column = new int[matrix.length*matrix[0].length];
        int a = 0;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    row[a]=i;
                    column[a] = j;
                    a++;
                }
            }
        }
        for(int i = 0; i<a; i++){
            for(int j = 0; j<matrix[0].length; j++){
                matrix[row[i]][j] = 0;
            }
            for(int k = 0; k<matrix.length; k++){
                matrix[k][column[i]] = 0;
            }
        }
    }
}
