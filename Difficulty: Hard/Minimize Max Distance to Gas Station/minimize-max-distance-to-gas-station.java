//Approach used : Binary search .(minimum of max)
//Time Complexity:O(nlogK)
//Space Complexity: O(1) no extra space used
class Solution {
    public int noOfGasStations(int[] stations,double distance)
    {
        int cnt =0;
        for(int i=1;i<stations.length;i++)
        {
            int inBetween = (int)((stations[i]-stations[i-1])/(distance));
            if((stations[i]-stations[i-1])==(inBetween*distance))
            {
                inBetween--;//here the actually the inbetween contains the no of segments , so we need no
                //so we are decrementing it to get the no of gas stations
            }
            cnt+=inBetween;
        }
        return cnt;
    }
    public double minMaxDist(int[] stations, int K) {
        // code here
        double low=0,high=0;
        for(int i=1;i<stations.length;i++)
        {
            high = Math.max(high,(double)(stations[i]-stations[i-1]));
        }
        while(high-low>1e-6)
        {
            double mid = (low+high)/2;
            int cnt = noOfGasStations(stations,mid);
            if(cnt>K)
            {
                low=mid;
            }
            else{
                high = mid;//here we can use the ans variable and store the mid value into the ans 
            }
        }
        return high;//here we can return ans 
    }
}
