class Solution {
    public String reverseOnlyLetters(String s) 
    {
        char ch[]=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(!Character.isLetter(ch[left]))
            {
                left++;
                
            }
            else if(!Character.isLetter(ch[right]))
            {
                right--;
            }
            else
            {
                char t=ch[left];
                ch[left]=ch[right];
                ch[right]=t;
                left++;
                right--;
            }
            
        }
        s=new String(ch);
        return s;
        
    }
}