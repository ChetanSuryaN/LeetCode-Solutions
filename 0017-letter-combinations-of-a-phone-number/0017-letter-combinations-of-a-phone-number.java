class Solution {
    public List<String> letterCombinations(String digits) 
    {
        List<String> list=new ArrayList<>();
        HashMap<Integer,String> map=new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        int len=digits.length();
        
        

           String first=(0>=len)?"":map.get(digits.charAt(0)-'0');
           String second=(1>=len)?"":map.get(digits.charAt(1)-'0');
           String third=(2>=len)?"":map.get(digits.charAt(2)-'0');
           String fourth=(3>=len)?"":map.get(digits.charAt(3)-'0');

           int one=first.length();
         int two=second.length();
          int three=third.length();
           int four=fourth.length();
           for(int i=0;i<one;i++)
           {
            char c1=first.charAt(i);
            if(two==0)
            {
                String st=""+c1;
                list.add(st);

            }
            for(int j=0;j<two;j++)
            {
                char c2=second.charAt(j);
                if(three==0)
            {
                String st=""+c1+c2;
                list.add(st);

            }
                for(int k=0;k<three;k++)
                {
                    char c3=third.charAt(k);
                    if(four==0)
                    {
                      String st=""+c1+c2+c3;
                        list.add(st);

                     }
                    for(int l=0;l<four;l++)
                    {
                        char c4=fourth.charAt(l);
                        String st=""+c1+c2+c3+c4;
                        list.add(st);


                    }
                }
            }
           }

           
           return list;


        
    }
}