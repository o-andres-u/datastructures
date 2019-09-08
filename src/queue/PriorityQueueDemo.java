package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        Queue<String> letters = new PriorityQueue<>();
        System.out.println("*** ADDING LETTERS***");
        letters.add("M");
        System.out.println(letters);
        letters.add("Z");
        System.out.println(letters);
        letters.add("A");
        System.out.println(letters);
        letters.add("O");
        System.out.println(letters);
        letters.add("I");
        System.out.println(letters);
        letters.add("E");
        System.out.println(letters);
        letters.add("B");
        System.out.println(letters);
        letters.add("C");
        System.out.println(letters);

        System.out.println("***\nREMOVING LETTERS***");
        System.out.println(letters.poll());
        System.out.println(letters);
        System.out.println(letters.poll());
        System.out.println(letters);
        System.out.println(letters.poll());
        System.out.println(letters);
        System.out.println(letters.poll());
        System.out.println(letters);
        System.out.println(letters.poll());
        System.out.println(letters);
        System.out.println(letters.poll());
        System.out.println(letters);
        System.out.println(letters.poll());
        System.out.println(letters);
        System.out.println(letters.poll());
        System.out.println(letters);
        System.out.println(letters.poll());
        System.out.println(letters);
    }

}
