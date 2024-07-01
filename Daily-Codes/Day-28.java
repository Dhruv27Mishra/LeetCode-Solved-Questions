class Solution {
    public boolean threeConsecutiveOdds(int[] arr)
    {
        int t=0,f=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                f=0;
                continue;
            }
            else
            f++;
            if(f==3)
            {t=1;break;}
        }
        if(t==1)
        return true;
        else return false;
    }
}
//self
