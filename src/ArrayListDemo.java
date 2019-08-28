import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

  public static void main(String[] args) {
    String name = "Luz Adriana";
    String name1 = "Diana";
    String name2 = "Marlon";
    String name3 = "Roger";
    String name4 = "Luvier";
    String name5 = "Johnatan";
    String name6 = "Juan Pablo";
    String name7 = "Erick";
    String name8 = "Oscar";
    String name9 = "Luz Adriana"; // Duplicated
    String name10 = "Diana"; // Duplicated

    List<String> names = new ArrayList<>();
    names.add(name);
    names.add(name1);
    names.add(name2);
    names.add(name3);
    names.add(name4);
    names.add(name5);
    names.add(name6);
    names.add(name7);
    names.add(name8);
    names.add(name9);
    names.add(name10);

    System.out.println(names); // Prints in the order that were added
  }

}
