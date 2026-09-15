class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
       Map<Integer, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new
                ));

                int j=0;
                int ans[]=new int[k];
                for(int num:sortedMap.keySet())
                {
                    ans[j]=num;
                    j++;
                    if(j==k)
                    {
                        break;
                    }
                }
                return ans;
    }
}