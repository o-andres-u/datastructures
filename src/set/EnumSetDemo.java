package set;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * <p>This representation is extremely compact and efficient.
 * Bulk operations (such as containsAll and retainAll) should run very quickly if their argument is also an enum set.</p>
 *
 * <p>The iterator returned by the iterator method traverses the elements in their natural order.</p>
 */
public class EnumSetDemo {

    public static void main(String[] args) {
        EnumSet<Roles> enumSet = EnumSet.allOf(Roles.class);
        System.out.println(enumSet);

        Iterator<Roles> iterator = enumSet.iterator();
        System.out.println("Printing by using iterator...");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
