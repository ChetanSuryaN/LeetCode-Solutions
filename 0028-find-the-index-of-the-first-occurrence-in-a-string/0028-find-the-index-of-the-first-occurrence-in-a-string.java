class Solution {
    public int strStr(String haystack, String needle) 
    { 
        int n=haystack.length();
      int left=0,right=0;
     
     if(haystack.equals(needle))
     return 0;
       int k=needle.length();
       for(left=0;left<n-k+1;left++)
       {
        if(haystack.substring(left,left+k).equals(needle))
        return left;
       }
      return -1;
      
     
    }
}