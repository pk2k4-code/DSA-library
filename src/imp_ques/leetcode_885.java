/*You start at the cell (rStart, cStart) of an rows x cols grid facing east. The northwest corner is at the first row and column in the grid, and the southeast corner is at the last row and column.

You will walk in a clockwise spiral shape to visit every position in this grid. Whenever you move outside the grid's boundary, we continue our walk outside the grid (but may return to the grid boundary later.). Eventually, we reach all rows * cols spaces of the grid.
Return an array of coordinates representing the positions of the grid in the order you visited them.

Input: rows = 5, cols = 6, rStart = 1, cStart = 4
Output: [[1,4],[1,5],[2,5],[2,4],[2,3],[1,3],[0,3],[0,4],[0,5],[3,5],[3,4],[3,3],[3,2],[2,2],[1,2],[0,2],[4,5],[4,4],[4,3],[4,2],[4,1],[3,1],[2,1],[1,1],[0,1],[4,0],[3,0],[2,0],[1,0],[0,0]]
 */


package imp_ques;
public class leetcode_885 {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] coor = new int[rows*cols][2];
        int left = 0;
        int bottom = rows-1;
        int top = 0;
        int right = cols-1;
        int count = 1;
        int r = rStart;
        int c = cStart;
        coor[0][0] = rStart;
        coor[0][1] = cStart;
        int a =1;
        int p;

        while(count<(rows*cols)){
            for(int i = 0; i<a; i++){
                if(a%2==0){p=-1;}else{p=1;}
                c=c+p;
                if((r>=top&&r<=bottom)&&(c>=left&&c<=right)){
                    coor[count][0] = r;
                    coor[count][1] = c;
                    count++;
                }
            }
            for(int i = 0; i<a; i++){
                if(a%2==0){p=-1;}else{p=1;}
                r=r+p;
                if((r>=top&&r<=bottom)&&(c>=left&&c<=right)){
                    coor[count][0] = r;
                    coor[count][1] = c;
                    count++;
                }
            }
            a++;
        }
        return coor;
    }
}
