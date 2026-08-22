class Solution {
public boolean checkDivisibility(int n) 
    {
    int p=1;
    int sum=0;
    int temp=n;
    while(temp>0)
    {
        sum+=temp%10;
        p*=temp%10;
        temp/=10;
    }
    return n%(p+sum)==0;
        
    }
};