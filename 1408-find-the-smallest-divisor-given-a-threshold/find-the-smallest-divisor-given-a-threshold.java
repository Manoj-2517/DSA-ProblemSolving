//Approach used: Binary Search on Answers
//Time Complexity:O(log(max(Nums))*N)
//Space Complexity:O(1) no extra space used.
class Solution {
    public int maximum(int[] nums)
    {
        int maxi =nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>maxi)
            {
                maxi = nums[i];
            }
        }
        return maxi;
    }
    public int sumofele(int[] nums,int div,int k)
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=Math.ceil((double)(nums[i])/(double)(div));
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1,high=maximum(nums),ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(sumofele(nums,mid,threshold)<=threshold)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}