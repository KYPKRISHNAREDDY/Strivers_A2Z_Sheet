package Step1.Collections;

import java.util.*;

public class TreeSet7 {
    /*
Pros : Guaranteed O(logN) for add,remove,...BasicOperations)
Implements set,SortedSet Interfaces
So Elements will be Sorted here.

     */
    public static void main(String[] args) {

        TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40));
        System.out.println(ts);
        ts.add(25);
        System.out.println(ts.ceiling(55));




        Collection<Integer> ts2=new TreeSet<>(List.of(10,30,50,70,10,40));
        // Here , Similar to OldRemote poiting to New TV.Old remote wont know new Features.
        //Ex:we can't use ceiling method for ts2 here

        SortedSet<Integer> ts3=new TreeSet<>();
        //We can take Reference of any Interface and Use Objects but we can only those methods which are in Reference Variable


    }
}
