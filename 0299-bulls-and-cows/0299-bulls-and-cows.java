class Solution {
    public String getHint(String secret, String guess) 
    {
        int bull=0,cow=0;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<secret.length();i++)
        {
           
            if(secret.charAt(i)==guess.charAt(i))
            {
                bull++;
            }
            else
            {
                 map1.put(secret.charAt(i),map1.getOrDefault(secret.charAt(i),0)+1);
            map2.put(guess.charAt(i),map2.getOrDefault(guess.charAt(i),0)+1);
            
            
            
            }
        }
        for(char ch: map1.keySet())
        {
            if(map2.get(ch)!=null)
            {
            
                cow+=Math.min(map1.get(ch),map2.get(ch));

            }
           
        }
        String ans=String.valueOf(bull)+"A"+String.valueOf(cow)+"B";
        return ans;

        
    }
}   