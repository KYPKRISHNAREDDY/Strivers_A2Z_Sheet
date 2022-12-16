package Step1.KnowBasicMath4;
import java.util.Scanner;
public class ReverseNumber {
    static int Reverse(int N)
    {
        int temp=N,sum=0;
        while(N>0)
        {
            int mod=N%10;
            sum=sum*10+mod;
            N=N/10;
        }
        return N;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        System.out.println(Reverse(n));

    }
}
