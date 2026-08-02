class Solution {
    public int myAtoi(String s) {
     int n = s.length();
     int sign =1;
    int i=0;
    long result=0;
    while(i<s.length() && s.charAt(i)==' ')
    {
        i++;
    }
    if(i==s.length())
    {
        return 0;
    }
    if(i<s.length() && s.charAt(i)=='-')
    {
        sign =-1;
        i++;
    }
    else if(i<s.length() && s.charAt(i)=='+')
    {
        sign =1;
        i++;
    }
    while(i<s.length() && Character.isDigit(s.charAt(i)))
    {
        int k = s.charAt(i)-'0';
        if(result>Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && k>(sign==1?7:8)))
        {
            return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        result = result*10+k;
        i++;
        if(sign*result>Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        if(sign*result<Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE;
        }
    }
    return (int)(sign*result);

 }
    
}