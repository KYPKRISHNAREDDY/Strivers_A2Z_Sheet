package Step3.Easy;

import java.util.Arrays;

class Arrayy
{
    int largestElement(int arr[])
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
            if(arr[i]>max)max=arr[i];
        return max;
    }
    int largestElement2(int arr[])
    {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

}
public class LargestElementinArray {
    public static void main(String[] args) {
        int arr[]=new int[]{1,11,22,33,44,55,55,666,999,9};
        Arrayy obj=new Arrayy();
        System.out.println(obj.largestElement(arr));
        System.out.println(obj.largestElement2(arr));
    }
}
