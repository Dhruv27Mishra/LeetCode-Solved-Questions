A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].

 

Example 1:

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.
Example 2:

Input: heights = [5,1,2,3,4]
Output: 5
Explanation:
heights:  [5,1,2,3,4]
expected: [1,2,3,4,5]
All indices do not match.
Example 3:

Input: heights = [1,2,3,4,5]
Output: 0
Explanation:
heights:  [1,2,3,4,5]
expected: [1,2,3,4,5]
All indices match.
 

Constraints:

1 <= heights.length <= 100
1 <= heights[i] <= 100

Welcome, I hope you like this solution 🤗🤗🤗🤗
Here is the approach in one line.

To get the heights in ascending order, we need to sort the array. Once we have the sorted heights, we will compare each index of the sorted heights with the given heights and calculate the mismatches. 😊😊

Step-by-Step Thought Process
Copying the Array 🤨

Create a copy of the original heights array.This copy will be sorted to determine the correct order of heights without altering the original array.

Sorting the Copy:

Sort the copied array to get the expected order of heights.Sorting gives us the order in which the heights should ideally be arranged.

Counting Mismatches:

Compare ↔️ each element in the original array with the corresponding element in the sorted array.Each mismatch between the original and sorted array indicates a student who is not standing in the correct position 🥺.Each mismatch means a student is out of order, which is what we need to determine.