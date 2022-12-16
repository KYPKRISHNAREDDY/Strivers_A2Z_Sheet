package Step1.Collections;
import java.util.*;

public class ListDemo1 {
    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));


        al1.add(10);
        al1.add(0, 5);
        al1.addAll(1, al2);

        System.out.println(al1);

        System.out.println(al1.contains(50));

        System.out.println(al1.equals(al1));
        System.out.println(al1.get(5));
        System.out.println(al1.indexOf(50));
        al1.add(5, 50);
        System.out.println(al1.lastIndexOf(50));
        System.out.println(al1.size());
        al1.set(0, 49);
        System.out.println(al1);
        //Accessing (or) Iterating through List

        for (int i = 0; i < al1.size(); i++)
            System.out.println(al1.get(i));

        for (Integer x : al1)
            System.out.println(x);


//Lambda Expression
        System.out.println("Lambda Expression Iteration");
        al1.forEach((x) -> System.out.println(x));

        System.out.println("Iterator");
        Iterator<Integer> it = al1.iterator();
        while (it.hasNext()) {//Can move in only one Direction coz of hasNext()
            System.out.print(it.next()+" ");
        }


         System.out.println("ListIterator");
        ListIterator<Integer> it2 = al1.listIterator();
        while (it2.hasPrevious())
        {
            System.out.println(it2.previous()+" ");
        }

        //Using ForEach,sending Each item in a List to a menthod
        
        al1.forEach(n->show(n));
    }

    static void show(int n){
        if(n>60)
            System.out.println(n);
    }
}
