package list;

import java.util.ArrayList;

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
    ArrayList<String> surnames = new ArrayList<>();
    surnames.add("Usuga");

    System.out.println(names); // Prints in the order that were added
    System.out.println(names.size());

    System.out.println(surnames);
    System.out.println(surnames.size());
  }

}
