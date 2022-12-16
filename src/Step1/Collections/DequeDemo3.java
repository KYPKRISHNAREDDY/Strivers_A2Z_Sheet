package Step1.Collections;
import java.util.*;
public class DequeDemo3 {
    public static void main(String[] args) {
        /*
        Deque Contains addFirst,removeFirst,getFirst which throws Exception
        alternatives are offerFirst,pollFirst,peekFirst

        similarly for addLast,.........

        We can make this dequeue act as Stack,Queue which is faster than original Stack
        Most operations almost takes constant time
          */

        ArrayDeque<Integer> dq=new ArrayDeque<>();
        //Lets Use it as Stack

        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        dq.pollLast();
        dq.pollLast();
        dq.forEach(n-> System.out.println(n));

        // Using this as Queue

        ArrayDeque<Integer> dq2=new ArrayDeque<>();
        dq2.offerLast(1);
        dq2.offerLast(2);
        dq2.offerLast(3);
        dq2.offerLast(4);
/*
OfferLast-PollFirst or OfferFirst-PollLast
 */
        dq2.pollFirst();
        dq2.forEach(n-> System.out.println(n));



    }
}
