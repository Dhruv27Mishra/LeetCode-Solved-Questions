class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int [][] result= new int[rowSum.length][colSum.length];
        for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result[0].length;j++)
            {
                result[i][j]=Math.min(rowSum[i],colSum[j]);
                rowSum[i]-=result[i][j];
                colSum[j]-=result[i][j];
            }
        }
        return result;
    }
}//self