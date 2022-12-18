package Step3.Easy;

public class CheckIfArrayIsSorted {
/*Brute Force
Redundant Method is Take element and compare it with every remaining element
if Current Element is Greater than any other Remaining element
Then array is not sorted
 */
    //Effective:Compare Adjacent Elements
    static boolean checkSorted(int arr[])
    {
        int i=1;
        while(i<arr.length)
        {
            if(arr[i-1]>arr[i])
                return false;
            i++;
        }
        return true;
    }
public static void main(String[] args) {
    int arr[]={1,2,3,6,5,5};
    System.out.println(checkSorted(arr));
}

}
