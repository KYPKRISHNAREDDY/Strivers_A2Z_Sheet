package Step2.Sorting2;
import java.util.Scanner;

class MergeSort {

    void Merge(int [] arr,int left,int mid,int right)
    {
        int temp[]=new int[arr.length];
        int i=left,j=mid+1,k=left;
        while(i<=mid && j<=right)
        {
            if(arr[i]<arr[j]) {
                temp[k] = arr[i];
                i++;k++;
            }
            else {
                temp[k]=arr[j];
                j++;k++;
            }
        }
        while(i<=mid)
        {
            temp[k]=arr[i];
            i++;k++;
        }
        while(j<=right)
        {
            temp[k]=arr[j];
            j++;k++;
        }
        for(k=left;k<=right;k++)
            arr[k]=temp[k];
    }
    void MergeSort(int arr[],int l,int r)
    {
        if(l<r) {
            int mid = (l + r) / 2;
            MergeSort(arr, l, mid);
            MergeSort(arr, mid + 1, r);
            Merge(arr, l, mid, r);
        }
    }
}

public class MergeSortSolution{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=7;
        int arr[]={9,4,7,6,3,1,5};
        MergeSort obj=new MergeSort();
        obj.MergeSort(arr,0,n-1 );
        System.out.println("After sorting the array:");
        for(Integer x:arr)
            System.out.print(x+" ");
    }
}
