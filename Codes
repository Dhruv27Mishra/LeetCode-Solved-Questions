class Solution {
    public List<String> commonChars(String[] words) {
        int l= words.length;
        List<String> ans= new ArrayList<>();
        int [] min=new int[26];
         for(char c: words[0].toCharArray())
        {
            min[c-'a']++;
        }
        for(int i=1;i<l;i++)
        {
            int[] f=new int[26];
             for(char c: words[i].toCharArray())
             {
                f[c-'a']++;
             }
            for(int j=0;j<26;j++)
            {
                min[j]=Math.min(min[j],f[j]);
            }
        }
        for(int i=0;i<26;i++)
        {
            while(min[i]-- >0)
            ans.add(String.valueOf((char)(i+'a')));
        }
        return ans;
    }
}
