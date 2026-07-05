class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n)
     {
        int left=0;
        int m=flowerbed.length;
        if(m==1&&flowerbed[0]==0)
        {
            return true;
        }
        for(int i=0;i<=m-1;i++)
        {
            if(i==0)
            {
                if(flowerbed[i]==0&&flowerbed[i+1]==0)
                {
                    flowerbed[0]=1;
                    n--;
                }
            }
            else if(i==m-1)
            {
                 if(flowerbed[m-1]==0&&flowerbed[m-2]==0)
                {
                    flowerbed[m-1]=1;
                    n--;
                }


            }
        
            else if(flowerbed[i]==0&&flowerbed[i+1]==0&&flowerbed[i-1]==0)
            {
                flowerbed[i]=1;
                n--;
            }
        }
              
            
               

            
        return(n<=0)?true:false;
        
        
    }
}