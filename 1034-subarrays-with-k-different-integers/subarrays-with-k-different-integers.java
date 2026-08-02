class Solution {
    public int Atmost(int[] nums,int k)
    {
        HashMap<Integer,Integer>map = new HashMap<>();
        int ans=0,n=nums.length,dc=0,j=0;
        for(int i=0;i<n;i++)
        {
            int ch = nums[i];
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)==1)
               dc++;
            while(dc>k)
            {
                int left = nums[j];
                
                map.put(left,map.get(left)-1);
                if(map.get(left)==0)
                {
                    dc--;
                }
                j++;
            }
            ans = ans+(i-j+1);
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
       return Atmost(nums,k)-Atmost(nums,k-1);
    }
}