class Solution {
    public boolean sumGame(String num) 
    {
        int leftsum=0;
        int rightsum=0;
        int leftq=0;
        int rightq=0;
        int left=0;
        int right=num.length()-1;
        while(left<num.length()/2)
        {
            if(num.charAt(left)=='?')
            {
                leftq++;
            }
            else if(Character.isDigit(num.charAt(left)))
            {
                leftsum+=num.charAt(left)-'0';
            }
             if(num.charAt(right)=='?')
            {
                rightq++;
            }
            else if(Character.isDigit(num.charAt(right)))
            {
                rightsum+=num.charAt(right)-'0';
            }
            left++;
            right--;
        }
        int sumdiff=(leftsum-rightsum);
        int qdiff=-1*(leftq-rightq);
       if(qdiff%2==0)
       {
         if((sumdiff==(qdiff/2)*9))
        {
            return false;
        }
       }
        return true;
        
    }
}