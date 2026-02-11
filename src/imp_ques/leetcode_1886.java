/*Given two n x n binary matrices mat and target, return true if it is possible to make
mat equal to target by rotating mat in 90-degree increments, or false otherwise.

Example 1:
Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.

Example 2:
Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
 */



package imp_ques;
public class leetcode_1886 {
    public boolean findRotation(int[][] mat, int[][] target) {
        int[][] mat2 = new int[mat.length][mat.length];
        for(int i = 0; i<4; i++){
            for(int c = 0; c<mat.length; c++){
                for(int j = 0; j<mat.length; j++){
                    mat2[c][j] = mat[mat.length-1-j][c];
                }
            }
            for(int k = 0; k<mat.length; k++){
                for(int l = 0; l<mat.length; l++){
                    mat[k][l] = mat2[k][l];
                }
            }
            boolean res = true;
            for(int m = 0; m<mat.length; m++){
                for(int n = 0; n<mat.length; n++){
                    if(mat2[m][n] != target[m][n]){
                        res = false;
                        break;
                    }
                }
                if(!res){
                    break;
                }
            }
            if(res){
                return true;
            }
        }
        return false;
    }
}
