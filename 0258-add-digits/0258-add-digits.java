class Solution {
    public int addDigits(int num) {
        int sum=0,d=0;
while(num>=10){sum=0;
for(int i=num;i!=0;i=i/10)
{d=i%10;
    sum=sum+d;
}
num=sum;}
return num;
        
    }
}