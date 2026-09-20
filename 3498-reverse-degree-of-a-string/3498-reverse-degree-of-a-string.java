class Solution {
    public int reverseDegree(String s) 
    {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
           int degree='z'-s.charAt(i);
           degree++;
           ans=ans+(degree*(i+1));
        }
        return ans;
        
    }
}