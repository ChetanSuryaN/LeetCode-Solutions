class Solution {
    public int[][] kClosest(int[][] points, int k) 
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int ans[][]=new int[k][2];
        HashMap<Integer, List<int []>> map=new HashMap<>();
        for(int i=0;i<points.length;i++)
        {
            int distance=points[i][0]*points[i][0]+points[i][1]*points[i][1];
            List<int []> list=map.getOrDefault(distance,new ArrayList<>());
            list.add(new int[]{points[i][0],points[i][1]});
            map.put(distance,list);
            pq.add(distance);
            
        }
        int i=0;
        while(i<k)
        {
            List<int []> l1=map.get(pq.poll());
            for(int j=0;j<l1.size();j++)
            {
                int c[]=l1.get(j);
                ans[i][0]=c[0];
                ans[i][1]=c[1];
                i++;
            }
        }
        return ans;
    }
}