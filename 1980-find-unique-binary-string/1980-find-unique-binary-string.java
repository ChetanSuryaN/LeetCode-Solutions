class Solution 
{
    String ans="";
    public String findDifferentBinaryString(String[] nums) 
    {
        HashSet<String> set=new HashSet<>();
        for(String s:nums)
        {
            set.add(s);
        }    
        helper(new StringBuilder(),nums.length,set); 
        return ans;   
    }
    private void helper(StringBuilder sb,int len,HashSet<String> set)
    {
        if(sb.length()==len)
        {
            String s=new String(sb);
            if(!set.contains(s))
            {
                ans=s;
                
            }
            return ;
        }
        if(sb.length()>=len)
        {
            return ;
        }
        sb.append('0');
        helper(sb,len,set);
        sb.deleteCharAt(sb.length()-1);
        sb.append('1');
        helper(sb,len,set);
        sb.deleteCharAt(sb.length()-1);
    }
}