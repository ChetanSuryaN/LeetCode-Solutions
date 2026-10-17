class Solution {
    public int minSetSize(int[] arr) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
       
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
            
        }     
        for(int num:map.keySet())
        {
            maxHeap.add(map.get(num));
        }   
        int ans=0;
        int sum=0;
        while(!maxHeap.isEmpty()&&sum<arr.length/2)
        {
            sum=sum+maxHeap.poll();
            ans++;
        }
        return ans;
    }
}