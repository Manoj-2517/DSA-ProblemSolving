class Solution {
    public int maxElement(int[][]mat,int n,int m,int col)
    {
        int max = Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<mat.length;i++)
        {
            if(mat[i][col]>max)
            {
                max =mat[i][col];
                index=i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length,m=mat[0].length;
        int low=0,high=m-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            int rowIndex = maxElement(mat,n,m,mid);
            int left = mid-1>=0?mat[rowIndex][mid-1]:Integer.MIN_VALUE;
            int right = mid+1<m?mat[rowIndex][mid+1]:Integer.MIN_VALUE;
            if(mat[rowIndex][mid]>=left && mat[rowIndex][mid]>=right)
            {
                return new int[]{rowIndex,mid};
            }
            else if(mat[rowIndex][mid]<left)
            {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return new int[]{-1,-1};
        
    }
}