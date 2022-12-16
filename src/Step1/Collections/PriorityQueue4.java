package Step1.Collections;
import java.util.*;

class MyCom implements Comparator<Integer>
{
    public int compare(Integer o1,Integer o2)
    {
        if(o1<o2)return 1;
        if(o1>o2)return -1;
        return 0;
    }
}
public class PriorityQueue4 {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        /*
        Priority Queue works on the Heap where High Priority will be to Smallest Element
        Insertion Deletion takes O(logn) time beacuse of binaryTree Structure of Heap
         */

        p.add(600);
        p.add(30);
        p.add(40);
        p.offer(50);
        System.out.println(p.peek());

        System.out.println("Before Deletion");
        p.forEach(x-> System.out.println(x));
        p.poll();
        System.out.println("After Deletion");
        p.forEach(x-> System.out.println(x));


        /*
        To change it to MaxHeap
        Write a separate class implementing Comparator
         */

    }
}
