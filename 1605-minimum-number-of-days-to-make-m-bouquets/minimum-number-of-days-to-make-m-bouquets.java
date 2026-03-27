//Approach used: Binary Search On Answers
//Time Complexity:O(N*log(max(bloomDay)-min(bloomDay)+1))
//Space Complexity:O(1) no extra space used , but we using the existingg array and it will be O(n).
class Solution {
    public int minimum(int[] bloomDay)
    {
        int mini = bloomDay[0];
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]<mini)
            {
                mini = bloomDay[i];
            }
        }
        return mini;
    }
    public int maximum(int[] bloomDay)
    {
        int maxi = bloomDay[0];
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]>maxi)
            {
                maxi = bloomDay[i];
            }
        }
        return maxi;
    }
    public boolean noofDays(int[] bloomDay,int day,int m,int k)
    {
        int bouquets=0,cnt=0;
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]<=day)
            {
                cnt++;
            }
            else{
                bouquets+=(cnt/k);
                cnt=0;
            }

        }
        bouquets+=(cnt/k);
        if(bouquets>=m)
           return true;
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low=minimum(bloomDay);
        int high = maximum(bloomDay),ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(noofDays(bloomDay,mid,m,k)==true)
            {
                ans=mid;
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}