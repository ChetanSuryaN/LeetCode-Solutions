class Solution {
    public boolean isPalindromic(String s) 
    {
        int ascii=0;
        String str="";
        for(int i=0;i<s.length();i++)
            {
                ascii=(int)s.charAt(i);
                String binary=Integer.toBinaryString(ascii);
                str+="0"+binary;
            }
        int left=0;
        int right=str.length()-1;
        while(left<right)
            {
                if(str.charAt(left)!=str.charAt(right))
                return false;
                left++;
                right--;
            }
        return true;
        
        
        
    }
}