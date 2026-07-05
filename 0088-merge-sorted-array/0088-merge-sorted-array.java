class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n)
     {
        int q=m+n;
         
         int i,j;
         for(i=0;i<m+n;i++)
         {
           if(i>=m)
            {
               nums1[i]=nums2[i-m];
            }
         }
         int t;
         for(i=0;i<q-1;i++)
         {
            for(j=0;j<(q-1-i);j++)
            {
                if(nums1[j]>nums1[j+1])
                {
                  t=nums1[j];
                 nums1[j]=nums1[j+1];
                  nums1[j+1]=t;
                }
            }
         }
        
         
        
    }
}