package homeworkweek7;
/*Write a class with the name Person. The class needs three fields (instance variables) with the names
firstName, lastName of type String and age of type int.
 */

public class Person {
    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    int age() {
        return age;
    }

    void setFirstName(String firstName1) {
        this.firstName = firstName1;

    }

    void setLastName(String lastName1) {
        this.lastName = lastName1;
    }

    void setAge(int age1) {
        if (age1 < 0 || age1 > 100) {
            this.age = 0;
        } else {
            this.age = age1;

        }
    }

    String isTeen() {
        String age2 = (age > 12 && age < 20) ? "true" : "false";
        return age2;

    }

    String getFullName() {

        if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty())
            return firstName;
        else if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else {
            return firstName + " " + lastName;
        }
    }
}