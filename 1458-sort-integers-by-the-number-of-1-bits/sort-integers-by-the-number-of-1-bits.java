class Compute{
    public static int Countset(int n)
    {
       int cnt =0;
        while(n>0)
        {
            n = n & (n-1);
            cnt++;
        }
        return cnt;
    }

 static class BitComparator implements Comparator<Integer>{
    public int compare(Integer a, Integer b)
    {
      int BitsA = Countset(a);
      int BitsB = Countset(b);
      if(BitsA == BitsB)
      {
        return a-b;
      }
      return BitsA-BitsB;
    }

}
}
class Solution {
    public int[] sortByBits(int[] arr) {
        Integer temp[] = new Integer[arr.length];
        int n = arr.length;
        for(int i=0;i<arr.length;i++)
        {
            temp[i]=arr[i];
        }
        Arrays.sort(temp,new Compute.BitComparator());
        for(int i=0;i<n;i++)
        {
            arr[i]=temp[i];
        }
       return arr;
    }
}