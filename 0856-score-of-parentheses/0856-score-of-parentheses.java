class Solution {
    public int scoreOfParentheses(String s) 
    {
        Stack<Integer> stack=new Stack<>();
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(ans);
                ans=0;
            }
            if(s.charAt(i)==')')
            {
                ans=Math.max(1,2*ans)+stack.pop();
            }
        }
        return ans;
    }
}