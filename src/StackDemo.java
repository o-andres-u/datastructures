import java.util.Stack;

public class StackDemo {

  public static void main(String[] args) {
    Stack<String> names = new Stack<>();
    names.push("Luz Adriana");
    names.push("Diana");
    names.push("Marlon");
    names.push("Roger");
    names.push("Luvier");
    names.push("Johnatan");
    names.push("Juan Pablo");
    names.push("Erick");
    names.push("Oscar");
    names.push("Luz Adriana");
    names.push("Diana");

    // Deleting elements
    names.pop();
    names.pop();

    System.out.println(names);
  }

}
