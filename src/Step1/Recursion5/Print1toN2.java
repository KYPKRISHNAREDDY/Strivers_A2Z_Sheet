package Step1.Recursion5;


public class Print1toN2 {

    static void print(int n,int b)
    {
        if(b>n)return;
        System.out.println(b);
        print(n,++b);
    }
    public static void main(String[] args)
    {
        print(5,1);
    }
}
