package Step2.Sorting1;

public class Sort {
    public static void SelectionSort(int arr[],int n)
    {
        /*
        Select min element and swap it with first index
         */
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i])min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(Integer x:arr)
            System.out.print(x+" ");
        System.out.println();
    }

    static void BubbleSort(int arr[],int n)
    {/*
    swap elments and each time large element comes to end just like a bubble coming out of Ocean
    */
        for(int i=0;i<n-1;i++)
        {

            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(Integer x:arr)
            System.out.print(x+" ");
        System.out.println();

    }
    static void InsertionSort(int arr[],int n)
    {/*Think and Implement
        Pick one from unsorted and insert it in its place in sorted Array
        */
        for(int i=1;i<n;i++)
        {
            int current=arr[i];
            int j=i-1;
            while(j>=0&& arr[j]>current)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }


    public static void main(String[] args) {
        SelectionSort(new int[]{7,6,5,4,3},5);
        BubbleSort(new int[]{7,6,5,4,3},5);
    }
}
