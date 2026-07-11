class Solution {
    public int characterReplacement(String s, int k) 
    {
        HashMap<Character,Integer> map=new HashMap<>();
        int maxfreq=0;
        int left=0;
        for(int right=0;right<s.length();right++)
        {
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            maxfreq=Math.max(maxfreq,map.get(s.charAt(right)));
            while(maxfreq+k+left<right+1)
            {
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
        }
        
        
        return (maxfreq+k>s.length())?s.length():maxfreq+k;
        
    }
}