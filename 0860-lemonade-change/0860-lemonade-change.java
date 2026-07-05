class Solution {
    public boolean lemonadeChange(int[] bills) 
    {
        int sum5=0,sum10=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                sum5+=5;
            }
            if(bills[i]==10)
            {
                sum5-=5;
                sum10+=10;
            }
            if(bills[i]==20)
            {
                if(sum10>=10)
                {
                    sum10-=10;
                    sum5-=5;
                }
                else
                {
                    sum5-=15;
                }
                if(sum5<0)
                {
                    return false;
                }
            }

        }
        return (sum5<0)?false:true;
        
    }
}