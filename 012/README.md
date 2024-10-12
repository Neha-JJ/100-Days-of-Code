Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.

Comments:

        The logic behind this solution is that when you XOR two same elemets the output will be zero, hence I can easily return the one that is not not zero in the array.

Working: 
      
       Start be iterating through the array nums
       For each element, XOR it with the result so far. If the element is the same then it will become zero
       After the loop, the result will be the one that is not zero, hence return it.

Again there is a hashMao solution for this but I am still not confident with it. 