class Solution {
    public String longestPalindrome(String s) {
        String res="";
        int reslen=0;
        for(int i=0;i<s.length();i++)
        {
            int left = i,right =i;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                    if((right-left+1)>reslen)
                    {
                        res = s.substring(left,right+1);
                        reslen = right-left+1;
                    }
                right++;
                left--;
            }
            int k =i,l=i+1;
            while(k>=0 && l<s.length() && s.charAt(k)==s.charAt(l))
            {
                    if((l-k+1)>reslen)
                    {
                        res = s.substring(k,l+1);
                        reslen = l-k+1;
                    }
                
                k--;
                l++;
            }
        }
        return res;
    }
}