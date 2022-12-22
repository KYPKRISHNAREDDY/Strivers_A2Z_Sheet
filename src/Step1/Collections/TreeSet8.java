package Step1.Collections;
import java.util.*;

/*
This new Class should implement Comparable coz
this treeset is SOrted Set,SO to sort the Elements it should know how to compare objects
So we should define How to compare to Objects.
 */
class Point implements Comparable
{
    int x;
    int y;
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    public String toString()//Overriding
    {
        return "x="+x+" y="+y;
    }
    public int compareTo(Object o)
    {
        /*
        If P1<p2 then return -1
            p1>p2 then return 1
            p1=p2 then return 0
         */
        Point p=(Point)o;
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else
        {
         if(this.y<p.y)return -1;
         else if(this.y>p.y) return 1;
         return 0;
        }

    }


}

public class TreeSet8 {
    public static void main(String[] args) {
        TreeSet<Point> ts=new TreeSet<>();
        ts.add (new Point(1,1));
        ts.add(new Point(5,5));
        ts.add(new Point(5,2));
        System.out.println(ts);
    }

}
