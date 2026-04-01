class Solution {
    public int painterPlacing(int[] nums,int area)
    {
        int painter=1,painterplacing=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]+painterplacing<=area)
            {
                painterplacing+=nums[i];
            }
            else{
                painter++;
                painterplacing=nums[i];
            }
        }
        return painter;
    }
    public int largestSubArraySumMin(int[] nums,int n,int k)
    {
        int low=nums[0];
        int high=0;
        for(int num:nums)
        {
            low = Math.max(low,num);
            high+=num;
        }
        if(k>n)
        {
            return -1;
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            int painters = painterPlacing(nums,mid);
            if(painters>k)
            {
                low = mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public int splitArray(int[] nums, int k) {
        return largestSubArraySumMin(nums,nums.length,k);
    }
}