class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        List<Integer> list=new ArrayList<>();
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        if(p.length()>s.length())
        {
            return list;
        }

        for(int i=0;i<p.length();i++)
        {
            arr1[p.charAt(i)-'a']++;
            arr2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr1,arr2))
        {
            list.add(0);
        }
        for(int i=p.length();i<s.length();i++)
        {
            arr2[s.charAt(i-p.length())-'a']--;
            arr2[s.charAt(i)-'a']++;
            if(Arrays.equals(arr1,arr2))
        {
            list.add(i-p.length()+1);
        }            
        }
        return list;
    }
}