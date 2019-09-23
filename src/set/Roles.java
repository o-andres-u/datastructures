package set;

public enum Roles {

    DEVELOPER("programmer", (short) 5),
    QA("tester", (short) 1),
    AUTOMATION("auto", (short) 3),
    ACCOUNTANT("count", (short) 2),
    RECRUITER("rec", (short) 4),
    SCRUM_MASTER("scrum", (short) 6);

    private String name;
    private short order;

    Roles(String name, short order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public short getOrder() {
        return order;
    }
}
