Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.

We count zeros and ones in the array and overwrite the original array with 0s and then with 1s and the remaining is overwritten as 2s.

Approach
Count the occurrences of 0s and 1s, denoted as zeros and ones.
Iterate from the 0th index up to zeros, setting each element to 0.
Iterate from the zeros index up to zeros + ones, assigning each element to 1.
The remaining elements, starting from zeros + ones index, are necessarily 2s, so iterate from this index up to the end of the array, setting each element to 2.
Complexity
Time complexity: O(n)

Space complexity: O(1)

