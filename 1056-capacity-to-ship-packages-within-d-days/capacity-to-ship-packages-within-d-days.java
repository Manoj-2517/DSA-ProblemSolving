//Approach used:Binary search.
//Time Complexity : O(log(sum(weights)-max(weights)+1)).
//Space Complexity : O(1) no extra space used.
class Solution {
    public int sumofWeights(int[] weights)
    {
        int sum=0;
        for(int i=0;i<weights.length;i++)
        {
            sum+=weights[i];
        }
        return sum;
    }
    public int noofDays(int[] weights,int capacity)
    {
        int noofdays=1,load=0;
        for(int i=0;i<weights.length;i++)
        {
            if(load+weights[i]>capacity)
            {
                noofdays = noofdays+1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return noofdays;
    }
    public int maximum(int[] weights)
    {
        int maxi=weights[0];
        for(int i=0;i<weights.length;i++)
        {
            if(weights[i]>maxi)
            {
                maxi = weights[i];
            }
        }
        return maxi;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=maximum(weights),high=sumofWeights(weights);
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(noofDays(weights,mid)<=days)
            {
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}