package Step1.BaiscHashing6;

import java.util.HashMap;

public class HighestFreqElement {
    static void findfreq(int arr[],int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int Key=Integer.MIN_VALUE;
        int value=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
                if(map.get(arr[i])>value){
                    Key=arr[i];
                    value=map.get(arr[i]);
                }

            }
            else
                map.put(arr[i],1);
        }
        System.out.println("Key "+Key+" Value "+value);
    }

    public static void main(String[] args) {
        int arr[]=new int[]{20,90,60,60,60,90,90,60,90,90};
        findfreq(arr,8);
    }
}
