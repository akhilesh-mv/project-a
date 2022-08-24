package com.projecta.practice;

/**
 * QUESTION - Find All Numbers Disappeared in an Array
 Given an array nums of n integers where nums[i] is in the range [1, n], print all the integers in the range [1, n] that do not appear in nums.

 Example 1:

 Input: nums = [4,3,2,7,8,2,3,1]
 Output: [5,6]
 Example 2:

 Input: nums = [1,1]
 Output: [2]

 Constraints:

 n == nums.length
 1 <= n <= 105
 1 <= nums[i] <= n
 */
public class MissingElements {

    public static void main(String[] args) {
        int[] input = {1, 1};
        printMissingElements(input);
    }

    private static void printMissingElements(int[] input) {
        for(int i = 0 ; i<input.length;i++){
            int index = Math.abs(input[i]);
            if(input[index - 1] > 0){
                input[index - 1] = - input[index - 1];
            }
        }

        for(int i =0 ; i<input.length;i++){
            if(input[i] > 0){
                System.out.println(i+1);
            }
        }
    }
}
