class Solution {
    public int gcdOfOddEvenSums(int n) 
    {
        int oddsum=0;
        int evensum=0;
        for(int i=1;i<=2*n;i++)
        {
            if(i%2==0)
            {
                evensum+=i;
            }
            else
            {
                oddsum+=i;
            }
        }
        while(oddsum!=0)
        {
            if(evensum>oddsum)
            {
                evensum-=oddsum;
            }
            else if(evensum==oddsum)
            {
                return evensum;
            }
            else
            {
                oddsum-=evensum;
            }
        }
        return 0;
        
    }
}