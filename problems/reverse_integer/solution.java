import java.util.Scanner;
class Solution
{
public static int reverse(int n)
{   int d=0;
    long rev=0;
        for(int i=n;i!=0;i=i/10)
        {
            d=i%10;
            rev=(rev*10)+d;
        }
    if(rev>Integer.MAX_VALUE|| rev<Integer.MIN_VALUE)
    {
        return 0;
    }
    return (int)rev;
}
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number to find it's reverse ");
    int n=sc.nextInt();
    System.out.println("Reverse of the "+n+" is "+reverse(n));
}
}