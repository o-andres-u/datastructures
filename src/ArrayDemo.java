public class ArrayDemo {

  public static void main(String[] args) {
    String[] names = {"Luz Adriana", "Diana", "Marlon", "Roger", "Luvier", "Johnatan", "Juan Pablo", "Erick", "Oscar", "Luz Adriana", "Diana"};
    // Second way to declare arrays -> new String[size]
    // Third way to declare arrays -> new String[] { ... elements ... }

    // Deleting elements
    names[9] = "";
    names[10] = null;

    for (String name: names) {
      System.out.println(name);
    }

  }

}
