package set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * <p>{@link java.util.HashSet} class does not guarantee the constant order of the elements over time.
 * This class permits the null element.
 * The class also offers constant time performance fot the basic operations like add, remove, contains
 * and size.</p>
 * <br>
 * Important features:
 * <ul>
 *  <li>The data structure used by this class is a hash table.</li>
 *  <li>Duplicate values are not allowed.</li>
 *  <li>Objects inserted are not inserted in the same order, they are inserted based on their hash code.</li>
 *  <li>NULL elements are allowed in this class.</li>
 * </ul>
 */
public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> chess = new HashSet<>();
        chess.add("King");
        chess.add("Queen");
        chess.add("Bishops");
        chess.add("Knights");
        chess.add("Rooks");
        chess.add("Pawns");

        System.out.println("King".hashCode());

        System.out.println("Printing chess pieces: " + chess);

        Iterator<String> iterator = chess.iterator();
        System.out.println("\nPrinting using iterator");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nRemoving pieces from iterator...");
        iterator.remove();
        System.out.println(chess);

        System.out.println("\nRemoving pieces from hashtable...");
        System.out.println(chess.remove("Queen"));
        System.out.println(chess);

        System.out.println("\nDoes it contain a king? " + chess.contains("king"));

        System.out.println(chess.remove("Queen"));
        System.out.println(chess.add("King"));
    }

}
