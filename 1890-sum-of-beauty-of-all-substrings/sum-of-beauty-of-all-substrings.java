class Solution {
    public int beautySum(String s) {
        
        int beauty=0;
        for(int i=0;i<s.length();i++)
        {
            int freq[] = new int[26];
            for(int j=i;j<s.length();j++)
            {
                int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
                char ch = s.charAt(j);
                freq[ch-'a']++;
            
        
        for(int f : freq)
        {
            if(f>0){
            max = Math.max(f,max);
            min = Math.min(f,min);
           
            }
        }
         beauty= beauty+(max-min);
            }
        }
        return beauty;

    }
}