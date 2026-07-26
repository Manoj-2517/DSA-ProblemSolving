class Solution {
    public boolean isIsomorphic(String s, String t) {
        int hash[] = new int[256];
        boolean isMap[] = new boolean[256];
        for(int i=0;i<s.length();i++){
            if(hash[s.charAt(i)]==0 && isMap[t.charAt(i)]== false)
            {
                hash[s.charAt(i)] = t.charAt(i);
                isMap[t.charAt(i)]=true;
            }
            else {
                if(hash[s.charAt(i)]!=t.charAt(i))
                { 
                    return false;
                }
            }
        }
        return true;
    }
}