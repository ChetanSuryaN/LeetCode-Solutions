class Solution {
    public String digitSum(String s, int k)
     {
        
        if(s.length()<=k)
        {
            return s;
        }
        String sb=helper(s,k);
        while(sb.length()>k)
        {
            sb=helper(sb,k);
        }
        return sb;
        
    }
    private String helper(String s,int k)
    {
         StringBuilder sb=new StringBuilder();
         int sum=0;
         for(int i=0;i<s.length();i++)
         {
            sum+=(s.charAt(i)-'0');
            if((i+1)%k==0)
            {
                sb.append(sum);
                sum=0;
            }
           
         }
          if(s.length()%k!=0)
            {
                sb.append(sum);
            }
         return String.valueOf(sb);
    }
}