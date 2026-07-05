class Solution {
    public int removeElement(int[] arr, int val) 
    {
        int k=0,i;
        int n=arr.length;
        int[] ans=new int[n];
        if(n>100||val>100||val<0)
        {
            return 0;
        }
        else
        {
            for(i=0;i<n;i++)
            {
                if(val!=arr[i])
                {
                    arr[k]=arr[i];
                    k++;
                
                }
               
        }
        
      return k;
    }
    
}
}