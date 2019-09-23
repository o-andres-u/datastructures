package sortedset;

import java.util.Comparator;

public class DeveloperComparatorName implements Comparator<Developer> {

    @Override
    public int compare(Developer o1, Developer o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
