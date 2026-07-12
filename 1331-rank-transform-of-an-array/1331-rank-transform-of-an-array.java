class Solution {
    public int[] arrayRankTransform(int[] arr)
    {
        int rank=1;
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            temp[i]=arr[i];
        }
        int ans[]=new int[arr.length];
        Arrays.sort(temp);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(temp[i]))
            {
                map.put(temp[i],rank);
                rank++;
                
            }
            
                
            

        }
        for(int i=0;i<arr.length;i++)
        {
            ans[i]=map.get(arr[i]);
        }
        return ans;
        
        
    }
}