class Solution {
    public boolean isIsomorphic(String s, String t)
     {
        
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> map1=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),t.charAt(i));
            }
            else
            {
                if(!map.get(s.charAt(i)).equals(t.charAt(i)))
                {
                    return false;
                }
            }
        }
         for(int i=0;i<t.length();i++)
        {
            if(!map1.containsKey(t.charAt(i)))
            {
                map1.put(t.charAt(i),s.charAt(i));
            }
            else
            {
                if(!map1.get(t.charAt(i)).equals(s.charAt(i)))
                {
                    return false;
                }
            }
        }
        return true;
        
    }
}