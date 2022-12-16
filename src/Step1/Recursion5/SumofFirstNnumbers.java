package Step1.Recursion5;

public class SumofFirstNnumbers {

   static void sum(int n,int sum)
   {//Parametrized WAY Recursion
       if(n<1){
           System.out.println(sum);return;
       }
       sum(n-1,sum+n);
   }
    static int sum(int n)
    {//Functional Way Recursion

        if(n<1)return 0;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
        sum(5,0);
    }
}
