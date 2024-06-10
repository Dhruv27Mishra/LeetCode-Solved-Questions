class Solution {
    public int heightChecker(int[] heights) {
        // Create a copy of the original heights array and sort it
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        
        int count = 0; 
        
        // Compare the original heights array with the sorted one
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count; 
    }
}