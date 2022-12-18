package Step1.Recursion5;
import java.util.*;

class ReverseGivenArr
{
    void reverse(int a[])
    {
        int n=a.length;
        int arr[]=new int [n];
        for(int i=n-1;i>=0;i--) {
            arr[n - i - 1] = a[i];
        }
        for(int i=0;i<n;i++)
            a[i]=arr[i];
    }
    void reverse2(int arr[])
    {
        for (int i=0,j=arr.length-1;i<=j;j--,i++)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

   private void RecursiveReverseArr(int arr[],int left,int right)
    {
        if(left>=right)return;
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        RecursiveReverseArr(arr,left+1,right-1);
    }
    void RecursiveReverse(int arr[])
    {
        RecursiveReverseArr(arr,0,arr.length-1);
    }
    void RecursiveReverseUsingSingleVar(int arr[],int i)
    {
        if(i<arr.length/2) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
            RecursiveReverseUsingSingleVar(arr, ++i);
        }
    }
}

public class ReverseAGivenArray {

    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5,6,7,8};

        ReverseGivenArr obj=new ReverseGivenArr();
        obj.RecursiveReverseUsingSingleVar(a,0);

        for(Integer x:a)
            System.out.print(x+" ");



    }
}
