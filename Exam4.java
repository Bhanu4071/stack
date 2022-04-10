import java.util.Iterator;
import java.util.Stack;

public class Exam4 {
    public static void main(String[]args)
    {
        Stack<Integer> s1=new Stack<Integer>();
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);
        s1.push(7);

        Iterator<Integer> itr=s1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("after removing one element from the stack");
        s1.pop();

        Iterator<Integer> itr2=s1.iterator();
        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
        }
         s1.pop();
        System.out.println("after removing another element from the stack");
        Iterator<Integer> itr4=s1.iterator();
        while(itr4.hasNext())
        {
            System.out.println(itr4.next());
        }
    }
}
