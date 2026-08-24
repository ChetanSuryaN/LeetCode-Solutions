class Solution {
    public int longestPalindrome(String[] words) 
    {
        HashMap<String,Integer> map=new HashMap<>();
        boolean hascentre=false;
        for(int i=0;i<words.length;i++)
        {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        int ans=0;
      
       for(String word:map.keySet())
       {
        String reverse=""+word.charAt(1)+word.charAt(0);
         if(word.equals(reverse))
         {
            if(map.get(word)%2==0)
            {
                ans+=map.get(word);
            }
            else 
            {
                ans+=map.get(word)-1;
                hascentre=true;
            }

         } 
         else if(map.get(reverse)!=null)
         {
            ans+=Math.min(map.get(word),map.get(reverse));
         }                
       }
       return hascentre?ans*2+2:ans*2;
        
    }
}