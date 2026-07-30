class Solution {
    public int minimumPushes(String word) 
    {
        HashSet<Character> set=new HashSet<>();
        int ans=0;
        int num=0;
        for(int i=0;i<word.length();i++)
        {
            if(!set.contains(word.charAt(i)))
            {
                num++;
                if(num<=8)
                {
                    ans++;
                }
                else if(num<=16)
                {
                    ans+=2;
                }
                else if(num<=24)
                {
                    ans+=3;
                }
                else
                {
                    ans+=4;
                }
                set.add(word.charAt(i));
            }
        }
        return ans;
        
    }
}