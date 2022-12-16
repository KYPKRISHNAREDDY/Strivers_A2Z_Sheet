package Step2.Sorting2;

import java.util.Arrays;

public class RecursiveInsertion {

    static void insertion(int arr[],int s)
    {
        if(s<arr.length-1) {
            int current = arr[s + 1];
            int i = s;
            while (i >= 0 && arr[i] > current) {
                int temp = arr[i];
                arr[i + 1] = arr[i];
                arr[i] = temp;
                i--;
            }
            arr[i + 1] = current;
            insertion(arr, s + 1);
        }
    }
    public static void main(String[] args) {
        int []arr=new int[]{4,3,2,1};
        insertion(arr,0);
        System.out.println(Arrays.toString(arr));
    }
}
