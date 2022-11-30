/**
 * The Person class represents a Person. A person is a human with a name, age
 * and a hobby
 */
public class Person {
    private String name;
    private int age;
    private String hobby;

    /**
     * Constructor for the Person class. This creates a new instance of a Person given
     * the below parameters.
     *
     * @param n represents the name of the Person
     * @param a represents the age of the Person
     * @param h represents the hobby of the person
     */
    public Person(String n, int a, String h) {
        name = n;
        age = a;
        hobby = h;
    }

    /**
     * toString method for the Person class. This method will return a String
     * showing all the information about the Person in a formatted
     * sentence.
     *
     * @return returns a String in a properly formatted sentence containing all
     * the information about a Person
     */
    public String toString() {
        return name + " is " + age + " years old " + " and loves " + hobby;
    }

    /**
     * The futureAge method will calculate the future age of this person given
     * a current year and future year.
     *
     * @param currentYear an integer representing the current year
     * @param futureYear an integer representing the future year you want to
     *                   calculate the age for
     * @return a String representing a formatted sentence showing the future age
     */
    public String futureAge(int currentYear, int futureYear) {
        int future = age + (futureYear - currentYear);
        return name + " will be " + future + " years old in " + futureYear;
    }
}


