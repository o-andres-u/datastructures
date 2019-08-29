import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Luz Adriana", "Diana", "Marlon", "Roger", "Luvier", "Johnatan", "Juan Pablo", "Erick", "Oscar", "Luz Adriana", "Diana");
    // Second way to create ArrayList -> new ArrayList with add
    // Third way to create ArrayList -> new ArrayList() {{ add("Name"); }};

    System.out.println(names); // Prints in the order that were added
  }

}
