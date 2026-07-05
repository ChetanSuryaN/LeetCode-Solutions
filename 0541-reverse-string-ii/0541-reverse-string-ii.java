class Solution {
    public String reverseStr(String s, int k) 
    {
       int right=Math.min(s.length()-1,k-1);
       int left=0,start=0;
       char arr[]=s.toCharArray();
       for( start=0;start<s.length();start+=2*k)
       {
        left=start;
        right=Math.min(start+k-1,s.length()-1);
       while(left<=right)
       {
        char t=arr[right];
        arr[right]=arr[left];
        arr[left]=t;
        left++;
        right--;
        
       }
    }
       s=new String(arr);
       return s;

    }
}