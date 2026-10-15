class Solution 
{
    List<String> list;
    public List<String> letterCasePermutation(String s) 
    {
        list=new ArrayList<>();
        helper(s.toCharArray(),0);
        return list;
    }
    private void helper(char arr[],int i)
    {
        if(i>=arr.length)
        {
            String s=new String(arr);
            
                list.add(s);
            
            return ;
        }
        
            if(Character.isDigit(arr[i]))
            {
               // helper(arr,i+1); 
            }
            else
            {
                char c=arr[i];
                char reversedCase = Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);

                char temp=arr[i];
                arr[i]=reversedCase;
                helper(arr,i+1); 
                arr[i]=temp;                
            }
             helper(arr,i+1); 
        

    }
}