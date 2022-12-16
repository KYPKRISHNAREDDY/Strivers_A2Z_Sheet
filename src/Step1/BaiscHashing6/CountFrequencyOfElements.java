package Step1.BaiscHashing6;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfElements {

    static void countFreq(int arr[])
    {
        boolean visited[]=new boolean[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(visited[i]==true)
                continue;

            visited[i]=true;
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    visited[j]=true;
                    count++;
                }
            }
            System.out.print(arr[i]+" "+ count);
            System.out.println();
        }
    }

    static void  countFreq(int arr[],int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);

        }
        for(Map.Entry<Integer,Integer> ma:map.entrySet()) {
            System.out.print("Key is "+ma.getKey());
            System.out.println(" Value is "+ma.getValue());
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{10,20,20,40,10};
        countFreq(arr,4);
        countFreq(arr);


    }
}
