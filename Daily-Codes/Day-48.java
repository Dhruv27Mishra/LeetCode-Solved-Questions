class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> mp=new HashMap<>();
        for(int i=0;i<names.length;i++)
        {
            mp.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] r=new String[heights.length];
        int in =0;
        for(int i=names.length-1;i>=0;i--)
        {
            r[in]=mp.get(heights[i]);
            in++;
        }
        return r;
    }
}//self