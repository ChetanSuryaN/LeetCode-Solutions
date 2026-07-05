class Solution {
    public List<Integer> selfDividingNumbers(int left, int right)
     {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            int temp=i,value=0;
            
            while(temp>0)
            {
                int rem=temp%10;
                if(rem==0)
                {
                value=1;
                break;
                }
                else if(i%rem!=0)
                {
                    value=1;
                    break;
                }
                temp/=10;
            }
            if(value==0)
            {
                list.add(i);

            }

        }
        return list;
        
    }
}