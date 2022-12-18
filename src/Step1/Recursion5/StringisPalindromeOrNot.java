package Step1.Recursion5;

import java.util.Arrays;

class StringIsPalindrome
{
    public boolean checkPalindrome(String str)
    {
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)!=str.charAt(n-i-1))
                return false;
        }
        return true;
    }

    boolean checkPalindromeUsingRecursion(String str,int i)
    {
        if(i<str.length()/2)
        {
            char l=str.charAt(i);
            char r=str.charAt(str.length()-i-1);
            if(l!=r)return false;
            return checkPalindromeUsingRecursion(str,i+1);
        }
        return true;
    }
    public boolean isPalindrome(String s)
    {
        int left=0,right=s.length()-1;
        while(left<right)
        {
            int l=s.charAt(left);
            int r=s.charAt(right);
            if(!Character.isLetterOrDigit(l))
                left++;
            else if(!Character.isLetterOrDigit(r))
                right--;
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;

    }



}
public class StringisPalindromeOrNot {
    public static void main(String[] args) {
        String str="abcb$a";
        StringIsPalindrome obj=new StringIsPalindrome();
        System.out.println(obj.checkPalindrome(str));
        System.out.println(obj.checkPalindromeUsingRecursion(str, 0));

        System.out.println(obj.isPalindrome(str));

    }
}
