class Solution {
    public String longestCommonPrefix(String[] strs) {
        int k = strs.length;
        int n = strs[0].length();
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<k;j++)
            {
                if(i>=strs[j].length())
                {
                    return strs[0].substring(0,i);
                }
                if(strs[j].charAt(i)!=strs[0].charAt(i))
                {
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
        
    }
}