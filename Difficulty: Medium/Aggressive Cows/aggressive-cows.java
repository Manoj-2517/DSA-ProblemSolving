class Solution {
    public boolean canWePlace(int[] stalls,int dist,int k)
    {
        int cntcows=1,last=stalls[0];
        for(int i=1;i<stalls.length;i++)
        {
            if(stalls[i]-last>=dist)//the difference should be min greater than dist
            {
                cntcows++;
                last = stalls[i];
            }
        }
        if(cntcows>=k)
          return true;
        return false;
    }
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n = stalls.length;
        int low=0,high=stalls[n-1]-stalls[0],ans=-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(canWePlace(stalls,mid,k)==true)
            {
                ans=mid;
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return high;
    }
}