import java.util.LinkedList;

public class LinkedListDemo {

  public static void main(String[] args) {
    LinkedList<String> names = new LinkedList<>();
    names.add("Luz Adriana");
    names.add("Diana");
    names.add("Marlon");
    names.add("Roger");
    names.add("Luvier");
    names.add("Johnatan");
    names.add("Juan Pablo");
    names.add("Erick");
    names.add("Oscar");
    names.add("Luz Adriana");
    names.add("Diana");
    // Second way to create LinkedList -> new LinkedList() {{ add("Name"); }};

    // Deleting elements
    names.remove("Luz Adriana");
    names.remove("Diana");

    // names.remove(0);
    // names.remove(0);

    System.out.println(names);
  }

}
