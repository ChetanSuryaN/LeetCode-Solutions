class Solution {
    public String maxSumOfSquares(int num, int sum) 
    {
        StringBuilder sb=new StringBuilder();
        int j=9;
        if(sum>9*num)
        {
            return "";
        }        
        int x=sum/9;
        for(int i=0;i<x;i++)
        {
            sb.append('9');
        }
        int temp=num-x;
        if(temp==0)
        {
            return sb.toString();
        }
        x=sum%9;
        sb.append(x);
        for(int i=1;i<temp;i++)
        {
            sb.append('0');
        }
        return sb.toString();
    }
}