package Step1.Recursion5;

class fibo
{
    void fibonacii(int n)
    {
        int t0=0,t1=1;
        while(n>=0)
        {
            System.out.println(t0);
            int temp=t0;
            t0=t1;
            t1+=temp;
            n--;
        }
    }
    void IterativeFib(int n)
    {
        if(n==0) System.out.println(0);
        else if (n==1) {
            System.out.print(0+" "+1);return;
        }
        else {
            int arr[]=new int[n+1];
            arr[0]=0;arr[1]=1;
            for(int i=2;i<=n;i++)
            {
                arr[i]=arr[i-1]+arr[i-2];
            }
            for(Integer x:arr)
                System.out.print(x+" ");
        }

    }
    int RecursiveFib(int n)
    {
        if(n<=1)return n;
        return RecursiveFib(n-1)+RecursiveFib(n-2);


    }
}
public class FibonacciSeriesUptoNth {
    public static void main(String[] args) {
        fibo obj=new fibo();
        obj.fibonacii(6);
        System.out.println(obj.RecursiveFib(6));

    }
}
