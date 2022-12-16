package Step1.Recursion5;

public class PrintName1 {
    static void print(String name,int n)
    {
        if(n<1)return;
        System.out.println(name);
        print(name,n-1);
    }
    public static void main(String[] args) {
        print("Krish",4);
    }
}
