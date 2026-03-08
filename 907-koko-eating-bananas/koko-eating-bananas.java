//APPROACH USED:BINARY SEARCH
//Time Complexity:O(n*log(max(piles))), n for finding the hours and max and the log(max(piles)) for eating bananas.
//Space Complexity:O(1) no extra space used.
class Solution {
    double findHour(int[] arr,int hour)
    {
        double hours=0;
        for(int i=0;i<arr.length;i++)
        {
            hours+=(int)Math.ceil((double)arr[i]/(double)hour);
        }
        return hours;
    }
    int findMax(int[] piles)
    {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            maxi = Math.max(maxi,piles[i]);
        }
        return maxi;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=findMax(piles);
        while(low<=high)
        {
            int mid=(low+high)/2;
            double totalhrs = findHour(piles,mid);
            if(totalhrs<=h)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}