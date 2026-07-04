class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) 
    {
        Arrays.sort(arr);
        
        int need=1;
        for(int i=0;i<arr.length;i++)
        {
            
           if(arr[i]>=need)
           {
            need++;
           }
        }
       return need-1;
        
        
    }
}