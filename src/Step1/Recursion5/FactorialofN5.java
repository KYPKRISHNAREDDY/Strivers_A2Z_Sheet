package Step1.Recursion5;

public class FactorialofN5 {
    static int fact(int n)
    {
        if(n==1 || n==0)return 1;
        return n*fact(n-1);
    }
    static void fact(int n,int mul)
    {
        if(n==1||n==0){ System.out.println(mul);return;}
        fact(n-1,mul*n);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        fact(5,1);
    }
}
