class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int i = s.length()-1;
        StringBuilder ans = new StringBuilder();
        while(i>=0)
        {
            while(i>=0 && s.charAt(i)==' ')
            {
                i--;
            }
            int j =i;//to track the word ending point from right to left
            while(i>=0 && s.charAt(i)!=' ')
            {
                i--;
            }
            if(j>=0)
            {
                ans.append(s.substring(i+1,j+1));
                ans.append(" ");
            }
        }
        return ans.toString().trim();
    }
}