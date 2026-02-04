/*  Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the
following things:
Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.

Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).  */

package imp_ques;
import java.util.Arrays;
import java.util.Scanner;
public class leetcode_27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int value = sc.nextInt();
        int k = removeElement(nums, value);
        int[] arr = new int[k];
        for(int j = 0; j<k; j++){
            arr[j] = nums[j];
        }
        System.out.println("After removing the elements the new array is: ");
        System.out.println(Arrays.toString(arr));
    }
        public static int removeElement(int[] nums, int val) {
            int k = 0;
            for(int i = 0; i<nums.length; i++){
                if(nums[i]!=val){
                    nums[k]=nums[i];
                    k++;
                }
            }
            return k;
        }
    }