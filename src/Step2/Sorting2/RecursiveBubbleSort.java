package Step2.Sorting2;

import java.util.Arrays;

public class RecursiveBubbleSort {
    static void recursiveBubble(int arr[],int n)
    {
        if(n==1) return;

        int count=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1]){
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
                count++;
            }
        }
        if(count==0)return;
        recursiveBubble(arr,n-1);
    }
    public static void main(String[] args) {
        int arr[]=new int[]{4,3,2,1};
        recursiveBubble(arr,arr.length);

        System.out.println(Arrays.toString(arr));
    }
}
