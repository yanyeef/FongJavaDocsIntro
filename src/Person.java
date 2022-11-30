public class Person {
    private String name;
    private int age;
    private String hobby;

    public Person(String n, int a, String h) {
        name = n;
        age = a;
        hobby = h;
    }

    public String toString() {
        return name + " is " + age + " years old " + " and loves " + hobby;
    }

    public String futureAge(int currentYear, int futureYear) {
        int future = age + (futureYear - currentYear);
        return name + " will be " + future + " years old in " + futureYear;
    }
}

