package deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) { // Graphic demonstration first
        Deque<String> deque = new LinkedList<>();
        deque.add("Luz Adriana (Tail)"); // adds to tail
        deque.addFirst("Diana (Head)");
        deque.addLast("Luvier (Tail)");
        deque.push("Roger (Head)");
        deque.offer("Johnatan (Tail)");
        deque.offerFirst("Juan Pablo (Head)");
        deque.offerLast("Marlon (Tail)");
        System.out.println(deque);

        System.out.println("\nStandard Iterator");
        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext())
            System.out.println("\t" + iterator.next());

        System.out.println("\nReverse Order Iterator");
        Iterator<String> reverse = deque.descendingIterator();
        while (reverse.hasNext())
            System.out.println("\t" + reverse.next());

        System.out.println("\nPeek " + deque.peek());
        System.out.println(deque);
        System.out.println("Pop " + deque.pop());
        System.out.println(deque);
        System.out.println("Remove First " + deque.removeFirst());
        System.out.println(deque);
        System.out.println("Remove Last " + deque.removeLast());
        System.out.println(deque);
    }

}
