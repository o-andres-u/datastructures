import java.util.Arrays;
import java.util.List;

public class LinkedListDemo {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Luz Adriana", "Diana", "Marlon", "Roger", "Luvier", "Johnatan", "Juan Pablo", "Erick", "Oscar", "Luz Adriana", "Diana");
    // Second way to create LinkedList -> new LinkedList with add
    // Third way to create LinkedList -> new LinkedList() {{ add("Name"); }};

    System.out.println(names);
  }

}
