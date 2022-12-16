package Step1.KnowBasicMath4;
import java.util.Scanner;
public class CountDigits {
    static int count_Digits(int n)
    {
        int count=0;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        System.out.println(count_Digits(n));

    }
}
