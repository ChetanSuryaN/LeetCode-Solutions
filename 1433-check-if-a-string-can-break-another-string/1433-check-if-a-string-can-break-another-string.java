class Solution {
    public boolean checkIfCanBreak(String s1, String s2) 
    {
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return checker(c1,c2)||checker(c2,c1);
        
    }
    private boolean checker(char c1[],char c2[])
    {
        for(int i=0;i<c1.length;i++)
        {
            if(c1[i]<c2[i])
            {
                return false;
            }
        }
        return true;
    }
}