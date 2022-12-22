package Step1.Collections;
import java.util.*;
public class HashSet6 {
    /*
  Pros : It takes o(1) for add,remove,contains whereas ArrayList takes O(n)
    Default LoadFactor:0.75

     */
    public static void main(String[] args) {

        HashSet<Integer> hs=new HashSet<>();
        //Can mention capacity and loadingFactor in Constructor
        hs.add(10);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);

        hs.forEach(x-> System.out.print(x+" "));
        System.out.println();

        for(Integer x:hs)
            System.out.print(x+" ");
        System.out.println();

        System.out.println(hs);
    }

}
