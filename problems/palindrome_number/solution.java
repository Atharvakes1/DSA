import java.util.Scanner;
class Solution {
    public static boolean isPalindrome(int x) {
        int d=0;
        long rev=0;
        if(x>=0){
        for(int i=x;i!=0;i=i/10)
        {
            d=i%10;
            rev=(rev*10)+d;
        }
        if(rev==x)
        {
            return true;
        }
        else
        {
            return false;
        }}
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which you want to find whether it is palindrome or not");
        int x=sc.nextInt();
        if(isPalindrome(x)==true)
        {
            System.out.println(x+"is Palindrome");
        }
        else
        {
            System.out.println(x+"is not Palindrome");
        }
    }
    }