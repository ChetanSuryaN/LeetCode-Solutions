class Solution {
    public int lengthOfLongestSubstring(String s)
     { 
        int left,right,max=0;
      left=0;right=0;
      
      HashSet<Character> set=new HashSet<>();
      while(right<s.length())
      {
        if(!set.contains(s.charAt(right)))
        {
            set.add(s.charAt(right));
            max=Math.max(max,right-left+1);
            right++;
        }
        else
        {
            set.remove(s.charAt(left));
            left++;
        }


      }
      return max;
        
    }
}