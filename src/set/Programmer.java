package set;

public class Programmer {

    private String name;
    private short age;
    private Roles role;

    public Programmer() {
        role = Roles.QA;
    }

    public static void main(String[] args) {
        System.out.println(Roles.DEVELOPER);
        System.out.println(Roles.DEVELOPER.getName());
        System.out.println(Roles.DEVELOPER.getOrder());
    }

}
