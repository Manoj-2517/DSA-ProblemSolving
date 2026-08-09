class Solution {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s+"#"+rev;
        int n = combined.length();
        int lps[] = new int[n];
        int len=0,i=1;
        while(i<n)
        {
            if(combined.charAt(i)==combined.charAt(len))
            {
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0)
                {
                    len = lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        int longest = lps[n-1];
        String remaining = s.substring(longest);
        String add = new StringBuilder(remaining).reverse().toString();
        return add+s;
    }
}