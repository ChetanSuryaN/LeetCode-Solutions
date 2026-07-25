class Solution {
    public int maxProduct(int n) 
    {
       String s=String.valueOf(n);
       int max1=-1;
       int max2=-1;
       for(int i=0;i<s.length();i++)
       {
         if(s.charAt(i)-'0'>max1)
         {
            max2=max1;
            max1=s.charAt(i)-'0';
         }
         else if(s.charAt(i)-'0'>max2)
         {
            max2=s.charAt(i)-'0';
         }
       }
       return max1*max2;
        
    }
}