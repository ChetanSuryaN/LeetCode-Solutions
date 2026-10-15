class Solution 
{
    List<String> list;
    public List<String> validStrings(int n) 
    {
        list=new ArrayList<>();
        helper(new StringBuilder(),n);
        return list;
    }
    private void helper(StringBuilder sb,int len)
    {
        if(sb.length()==len)
        {
            String s=new String(sb);
            list.add(s);
            return ;
        }
        if(sb.length()==0)
        {
            sb.append('0');
            helper(sb,len);
            sb.deleteCharAt(0);
            sb.append('1');
            helper(sb,len);
            sb.deleteCharAt(0);
        }
        else
        {
            if(sb.charAt(sb.length()-1)!='0')
            {
                sb.append('0');
                helper(sb,len);
                sb.deleteCharAt(sb.length() - 1);
            }
             sb.append('1');
                helper(sb,len);
                sb.deleteCharAt(sb.length()-1);
        }
    }
}