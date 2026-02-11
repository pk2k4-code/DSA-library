/*You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and
death years of the ith person.

The population of some year x is the number of people alive during that year. The ith person is counted in
year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted
in the year that they die.
Return the earliest year with the maximum population.

Example:
Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
Output: 1960
Explanation:
The maximum population is 2, and it had happened in years 1960 and 1970.
The earlier year between them is 1960.    */



package imp_ques;

public class leetcode_1854 {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        int max = 0;
        int year = 0;
        for(int[] log : logs){
            for(int i = log[0]; i<log[1]; i++){
                arr[i-1950]++;
            }
        }
        for(int j = 0; j<101; j++){
            if(arr[j]>max){
                max = arr[j];
                year = 1950 + j;
            }
        }
        return year;
    }
}
