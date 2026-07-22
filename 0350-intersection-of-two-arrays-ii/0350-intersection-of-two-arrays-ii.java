class Solution {
    public int[] intersect(int[] nums1, int[] nums2)
    {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++)
        {
            map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
        }

        for(int num:map1.keySet())
        {
            if(map2.containsKey(num))
            {
                for(int i=0;i<Math.min(map1.get(num),map2.get(num));i++)
                {
                    list.add(num);
                }
            }

        }
        int ans[]=new int[list.size()];
        int j=0;
        for(int num:list)
        {
            ans[j]=num;
            j++;
        }
        return ans;
        
        
    }
}