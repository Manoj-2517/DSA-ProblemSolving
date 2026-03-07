//APPROACH USED:Binary Search
//TIME COMPLEXITY:O(logn)
//SPACE COMPLEXITY:O(1) no extra space used
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==1)
          return 0;
        if(nums[0]>nums[1])
           return 0;
        if(nums[n-1]>nums[n-2])
           return n-1;
        int low=1,high=n-2;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            if(nums[mid]>nums[mid-1])//checks if the mid in increasing curve then the peak lies on the right part
            {
                low = mid+1;
            }
            else if(nums[mid]>nums[mid+1])//checks if the mid in decreasing curve then the peak lies on the left part
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}