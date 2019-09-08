package queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {

    public static void main(String[] args) {
        Queue<String> planets = new LinkedList<>();
        // Inner, rocky planets.
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        // Outer, gas giants.
        planets.add("Jupiter");
        planets.add("Saturn");
        // Ice giants.
        planets.offer("Uranus");
        planets.offer("Neptune");
        //planets.add(null); It's allowed
        System.out.println(planets);

        System.out.println("The sun is about to die, then the first planet will be burned. Preparing to destroy: " + planets.peek());
        System.out.println(planets.poll() + " has been terminated.");
        System.out.println("The remaining planets are: " + planets);

        System.out.println("\nThere's a new universal order and " + planets.element() + " will turn into a new ice giant.");
        planets.add(planets.poll());
        System.out.println(planets);

        System.out.println("\nFreezer decided to destroy all rocky planets.");
        System.out.println(planets.poll());
        System.out.println(planets.poll());
        System.out.println(planets);

        System.out.println("\nCell wants to take part and destroy all gas giants.");
        System.out.println(planets.poll());
        System.out.println(planets.poll());
        System.out.println(planets);

        System.out.println("\nFinally, I don't like the ice giants.");
        System.out.println(planets.remove());
        System.out.println(planets.remove());
        System.out.println(planets);

        System.out.println("\nAll planets have gone, except " + planets.peek());
        System.out.println("Killing now " + planets.remove());
        System.out.println(planets);
        System.out.println(planets.size());

        System.out.println("\nI want to see if there are more planets...");
        System.out.println(planets.peek());
        System.out.println("What will happen if a delete an element from an empty queue?");
        System.out.println(planets.poll());

        System.out.println("\nNow, the system will halt if I want to check the head or remove an element from an empty queue.");
        System.out.println(planets.element());
        System.out.println(planets.remove());
    }

}
