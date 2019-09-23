package sortedset;

import java.util.TreeSet;
import java.util.SortedSet;

/**
 * <p>{@link TreeSet} is one of the most important implementations of the {@link SortedSet} interface
 * in Java that uses a Tree for storage.</p>
 *
 * <p>Few important features:</p>
 * <ul>
 *     <li>{@link TreeSet} implements the {@link SortedSet} interface so duplicate values are no allowed.</li>
 *     <li>Objects in a {@link TreeSet} are stored in a sorted and ascending order.</li>
 *     <li>Elements are sorted by keys instead of preserving the insertion order.</li>
 *     <li>{@link TreeSet} does not allow inserting heterogeneous objects.</li>
 *     <li>Information is accessed quickly because of its faster access and retrieval time.</li>
 *     <li>{@link TreeSet} is an implementation of a self-balancing binary search tree like Red-Black Tree.</li>
 * </ul>
 */
public class TreeSetDemo {

    public static void main(String[] args) {
        Developer frank = new Developer("Frank", (short) 35, 3_500_000.00f);
        Developer charlie = new Developer("Charlie", (short) 65, 7_300_000.00f);
        Developer ana = new Developer("Ana", (short) 19, 1_000_000.00f);
        Developer natasha = new Developer("Natasha", (short) 18, 10_000_000.00f);
        Developer caroline = new Developer("Caroline", (short) 34, 2_100_000.00f);
        Developer adam = new Developer("Adam", (short) 40, 2_700_000.00f);
        Developer frederick = new Developer("Frederick", (short) 30, 1_900_000.00f);

        TreeSet<Developer> treeSet = new TreeSet<>();
        treeSet.add(frank);
        treeSet.add(charlie);
        treeSet.add(ana);
        treeSet.add(natasha);
        treeSet.add(caroline);
        treeSet.add(adam);
        treeSet.add(frederick);
        System.out.println(treeSet);

        System.out.println("\nPrinting separately...");
        treeSet.forEach(System.out::println);

        TreeSet<Developer> treeByName = new TreeSet<>(new DeveloperComparatorName());
        treeByName.addAll(treeSet);
        System.out.println("\nPrinting treeByName...");
        treeByName.forEach(System.out::println);
    }

}
