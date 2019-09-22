package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * <p>This is an ordered version of {@link java.util.HashSet} that maintains a doubly-linked list across
 * all elements. This class is used to maintain the iteration order.</p>
 *
 * <p>Iterating through a HashSet produces an unpredictable order, while a LinkedHashSet lets us iterate
 * through the elements in the order in which they were inserted.</p>
 */
public class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("King");
        linkedHashSet.add("Queen");
        linkedHashSet.add("Bishops");
        linkedHashSet.add("Knights");
        linkedHashSet.add("Rooks");
        linkedHashSet.add("Pawns");
        System.out.println("Printing chess pieces: " + linkedHashSet);

        Iterator<String> iterator = linkedHashSet.iterator();
        System.out.println("\nPrinting by using iterator...");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nRemoving pieces from iterator...");
        iterator.remove();
        System.out.println(linkedHashSet);

        System.out.println("\nRemoving pieces from hashtable...");
        linkedHashSet.remove("Queen");
        System.out.println(linkedHashSet);

        System.out.println("\nDoes it contain a king? " + linkedHashSet.contains("king"));
    }

}
