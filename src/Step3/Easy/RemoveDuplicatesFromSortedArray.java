package Step3.Easy;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicatesFromSortedArray {
    static void removeDuplicates(int arr[])
    {
        //OR You can use HashSet also by iterating once only as set stores only unique elements.
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr2.contains(arr[i]))
                continue;
            else {
                arr2.add(arr[i]);
            }
        }
        for(int i=0;i<arr2.size();i++)
        {
            arr[i]=arr2.get(i);
        }
        for(int i=arr2.size();i<arr.length;i++)
        {
            arr[i]=0;
        }
    }

    static int[] removeDuplicates2(int arr[])
    {
        int i=0;
        int j=i+1;
        while(j<arr.length)
        {
            if(arr[i]!=arr[j]) {
                i++;
                arr[i]=arr[j];
            }
            j++;
        }
        return
    }


    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,5,5,6,6,6,6,6};
        removeDuplicates(arr);
        for(Integer x:arr)
            System.out.println(x);
    }
}
