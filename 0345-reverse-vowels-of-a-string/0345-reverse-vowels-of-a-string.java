class Solution {
    public String reverseVowels(String s) 
    {
        char arr[]=s.toCharArray();
        int left=0,right=s.length()-1;
        while(left<right)
        {
            char c1=arr[left];
            char c2=arr[right];

            if((c1=='A'||c1=='E'||c1=='I'||c1=='O'||c1=='U'||c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')&&(c2=='A'||c2=='E'||c2=='I'||c2=='O'||c2=='U'||c2=='a'||c2=='e'||c2=='i'||c2=='o'||c2=='u'))
            {
                char t=arr[left];
                arr[left]=arr[right];
                arr[right]=t;
                left++;
                right--;
            }
            else if(c1=='A'||c1=='E'||c1=='I'||c1=='O'||c1=='U'||c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')
            {
                right--;
            }
            else if(c2=='A'||c2=='E'||c2=='I'||c2=='O'||c2=='U'||c2=='a'||c2=='e'||c2=='i'||c2=='o'||c2=='u')
            {
                left++;

            }
            else
            {
                left++;
                right--;
            }
        }
        s=new String(arr);
    
        return s;
        
    }
}