class Solution {
    public boolean isPalindrome(String s)
     {
        char c;
        int n=s.length();
        int left=0;
        
        int right=n-1;
        String str=s.toLowerCase();
        while(left<right)
        {
            if(!Character.isLetterOrDigit(str.charAt(left)))
            {
                left++;
                continue;
            }
            else if(!Character.isLetterOrDigit(str.charAt(right)))
            {
                right--;
                continue;
            }
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}