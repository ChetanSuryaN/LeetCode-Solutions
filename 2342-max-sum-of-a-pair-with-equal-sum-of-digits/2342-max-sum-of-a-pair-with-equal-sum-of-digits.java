class Solution {
    public int maximumSum(int[] nums) 
    {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int num:nums)
        {
            String s=String.valueOf(num);
            int sum=0;
            for(int j=s.length()-1;j>=0;j--)
            {
                sum+=(s.charAt(j)-'0');
            }
            List<Integer> list=map.getOrDefault(sum,new ArrayList<>());
            list.add(num);
            map.put(sum,list);
        }  
        int maxsum=-1;
        for(int num:map.keySet())
        {
            List<Integer> list=map.get(num);
            list.sort(Comparator.naturalOrder());

            int sum=0;
            if(list.size()>1)
            {
                sum=list.get(list.size()-1)+list.get(list.size()-2);
            maxsum=Math.max(maxsum,sum);
            }
        }  
        return maxsum;            
    }
}