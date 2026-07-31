class Solution {
    public int minimumPushes(String word) 
    {
        int arr[]=new int[26];
        for(int i=0;i<word.length();i++)
        {
            arr[word.charAt(i)-'a']++;
        }
        Arrays.sort(arr);
        int c=0;
        for(int i=25;i>=18;i--)
        {
            c+=arr[i];
        }
        for(int i=17;i>=10;i--)
        {
            c+=2*arr[i];
        }
        for(int i=9;i>=2;i--)
        {
            c+=3*arr[i];
        }
        c+=4*arr[1];
        c+=4*arr[0];
        return c;
        
    }
}