package list;

public class ArrayDemo {

  public static void main(String[] args) {
    // String[] names = {"Luz Adriana", "Diana", "Marlon", "Roger", "Luvier", "Johnatan", "Juan Pablo", "Erick", "Oscar", "Luz Adriana", "Diana"};

    // Second way to declare arrays -> new String[size]
    //String[] names = new String[6];
    //names[0] = "Roger";
    //names[1] = "Johnatan";
    //names[2] = "Diana";

    // Third way to declare arrays -> new String[] { ... elements ... }
    String[] names = new String[] {"Luz Adriana", "Diana", "Marlon", "Roger", "Luvier", "Johnatan", "Juan Pablo", "Erick", "Oscar", "Luz Adriana", "Diana"};

    for (String name: names) {
      System.out.println(name);
    }
    System.out.println("size " + names.length);

  }

}
