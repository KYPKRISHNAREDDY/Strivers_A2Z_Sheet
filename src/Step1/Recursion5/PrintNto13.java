package Step1.Recursion5;

public class PrintNto13 {
    static void print(int n)
    {
        if(n<1)return;
        System.out.println(n);
        print(n-1);
    }

    public static void main(String[] args) {
        print(5);
    }
}
