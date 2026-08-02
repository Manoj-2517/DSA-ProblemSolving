class Solution {
    public int maxDepth(String s) {
        int depth = 0,cnt=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                cnt++;
                depth = Math.max(cnt,depth);
            }
            else if(s.charAt(i)==')')
            {
                cnt--;
                if(cnt<0)
                {
                    return -1;
                }
            }
        }
       return (cnt==0)?depth:-1;
    }
}