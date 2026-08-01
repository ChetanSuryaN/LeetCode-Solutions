class Solution {
    public int minimizedStringLength(String s)
     {
        HashSet<Character> set=new HashSet<>();
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(i));
                ans++;
            }
        }
        return ans;
        
    }
}