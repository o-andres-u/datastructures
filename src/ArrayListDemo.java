import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>(){{
      add("Luz Adriana");
      add("Diana");
      add("Marlon");
      add("Roger");
      add("Luvier");
      add("Johnatan");
      add("Juan Pablo");
      add("Erick");
      add("Oscar");
      add("Luz Adriana");
      add("Diana");
    }};
    // Second way to create ArrayList -> new ArrayList with add

    System.out.println(names);

    // Deleting elements
    names.removeAll(Arrays.asList("Luz Adriana"));
    System.out.println(names.contains("Diana"));

    names.remove(0);
    names.remove(0);

    names.add("Andres");
    System.out.println(names);

    names.add(3, "Sebas");
    System.out.println(names); // Prints in the order that were added
  }

}
