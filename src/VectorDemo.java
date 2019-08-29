import java.util.Vector;

public class VectorDemo {

  public static void main(String[] args) {
    Vector<String> names = new Vector<>();
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

    // Deleting elements
    names.remove("Luz Adriana");
    names.remove("Diana");

    // names.remove(0);
    // names.remove(0);

    System.out.println(names);
  }

}
