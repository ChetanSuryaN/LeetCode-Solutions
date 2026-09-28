class Solution 
{
    List<Integer> list;
    int count=0;
    public List<Integer> lexicalOrder(int n) 
    {
        list=new ArrayList<>();
        for(int i=1;i<10;i++)
        {
            helper(i,n);
        }
        return list;
    }
    private void helper(int i,int n)
    {
        if(i>n)
        {
            return ;
        }
        list.add(i);
       
           
            
            for(int j=0;j<10;j++)
            {
                int temp=i*10+j;
                if(temp<=n)
                {
                    helper(temp,n);
                }
                else
                {
                   break ;
                }
            }
           
        
    }
}