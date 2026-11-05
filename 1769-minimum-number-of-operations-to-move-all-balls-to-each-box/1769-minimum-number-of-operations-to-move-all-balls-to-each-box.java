class Solution {
    public int[] minOperations(String s) 
    {
        List<Integer> list=new ArrayList<>();
      
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                list.add(i);
            }
        }
        int ans[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            int c=0;
            for(int j=0;j<list.size();j++)
            {
                c+=Math.abs(list.get(j)-i);
            }
            ans[i]=c;
        }
        return ans;
                
    }
}