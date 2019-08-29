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
    names.push(null);

    System.out.println(names);

    names.pop();
    System.out.println(names);

    names.pop();
    names.pop();
    names.pop();
    names.pop();
    names.pop();
    names.pop();
    System.out.println(names);

    names.clear();
    System.out.println(names);

  }

}
