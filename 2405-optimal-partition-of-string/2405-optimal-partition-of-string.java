class Solution {
    public int partitionString(String s) 
    {
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int count=0;
        for(int right=0;right<s.length();right++)
        {
            if(set.contains(s.charAt(right)))
            {
                count++;
                left=right;
                set=new HashSet<>();
                
            }
            set.add(s.charAt(right));
        }
        return count+1;
        
    }
}