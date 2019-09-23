package sortedset;

public class Developer implements Comparable<Developer> {

    private String name;
    private short age;
    private float salary;

    public Developer(String name, short age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("[name=%s, age=%d, salary=%f]", name, age, salary);
    }

    @Override
    public int compareTo(Developer o) {
        return Short.compare(this.age, o.age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Developer) {
            Developer dev = (Developer) obj;
            return this.name.equals(dev.name) && this.age == dev.age && this.salary == dev.salary;
        } else {
            return false;
        }
    }
    
}
