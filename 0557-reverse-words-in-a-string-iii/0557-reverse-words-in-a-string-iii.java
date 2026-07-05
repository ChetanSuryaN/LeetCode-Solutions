class Solution {
    public String reverseWords(String s) 
    {
        int start=0,left=0,right=s.length()-1;
        char arr[]=s.toCharArray();
        for(start=0;start<s.length();start++)
        {
            if(arr[start]==' ')
            {
                 right=start-1;
                while(left<right)
                {
                    char t=arr[left];
                    arr[left]=arr[right];
                    arr[right]=t;
                    right--;
                    left++;
                }
                left=start+1;
            }

        }
        right=s.length()-1;
        while(left<right)
        {
            char t=arr[left];
                    arr[left]=arr[right];
                    arr[right]=t;
                    right--;
                    left++;

        }

        s=new String(arr);
        return s;

        
    }
}