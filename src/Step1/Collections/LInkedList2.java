package Step1.Collections;

import java.util.LinkedList;
import java.util.*;
public class LInkedList2 {
    public static void main(String[] args) {
        //Can grow dynamically and no need to shift elements
        //while inserting,deleting
        //Default is DLL
        //Extra Methods: addFirst,addLast,RemoveFirst,removeLast
        LinkedList<Integer> al1=new LinkedList<>();
        LinkedList<Integer> al2=new LinkedList<>(List.of(50,60,70,80,90));

        al1.add(100);
        al1.add(0,40);
        al1.addAll(1,al2);
        al1.forEach(n-> System.out.print(n+" "));
        al1.set(3,50);
        System.out.println();

        al1.addFirst(0);
        al1.addLast(200);

        System.out.println(al1.peek());
        System.out.println(al1.peekLast());



    }
}
