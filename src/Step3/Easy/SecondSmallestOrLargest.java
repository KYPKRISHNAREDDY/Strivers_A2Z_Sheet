package Step3.Easy;

class Arrayyy
{
    int secondSmallest(int arr[])
    {
        if(arr.length<2){
            System.out.println("Length of array is too small");return -1;
        }

        int min=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min){min2=min;min=arr[i];}
            else if(arr[i]<min2&&arr[i]!=min){min2=arr[i];}
        }
        return min2;
    }
}

public class SecondSmallestOrLargest {
    public static void main(String[] args) {
        int arr[]={11,22,333,444,555,-11,00};
        Arrayyy obj=new Arrayyy();
        System.out.println(obj.secondSmallest(arr));
    }
}
