class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int r1=0;
        ArrayList<Integer> ls = new ArrayList<Integer>();
                for(int i=0;i<matrix.length;i++)
                {int r2=matrix[i][0];
                    int c=0;
                    for(int j=0;j<matrix[0].length;j++)
                    {
                        if(matrix[i][j]<r2)
                         {
                            r2=matrix[i][j];
                            r1=j;
                         }
                     }
                     boolean is=true;
                    for(int k=0;k<matrix.length;k++)
                     {
                        if(matrix[k][r1]>r2)
                      { is=false;
                        break;}
                     }
                     if (is==true)
                     ls.add(r2);
                }
                
                
                return ls; 
    }
}//self