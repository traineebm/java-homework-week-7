package week7.java;

public class Person {
    //Declaration of three instance variables
    String firstName;
    String lastName;
    int age;

    //Instance method - with return type no parameters
    public String getFirstName() {
        return firstName;
    }

    //Instance method - with return type no parameters
    public String getLastName() {
        return lastName;
    }

    //Instance method - with return type no parameters
    public int getAge() {
        return age;
    }

    //Instance method - with return type with parameter
    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    //Instance method - with return type with parameter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Instance method
    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if (firstName.isEmpty()) {
            return lastName;
        }
        if (lastName.isEmpty()) {
            return firstName;
        }
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "    ";
        } else {
            return firstName + "  " + lastName;
        }
    }

        public static void main (String [] args){

            Person person = new Person();
            person.setFirstName(""); // firstName is set to empty string
            person.setLastName(""); // lastName is set to empty string
            person.setAge(10);

            System.out.println("fullName = " + person.getFullName());
            System.out.println("teen = " + person.isTeen());

            person.setFirstName("John"); // firstName is set to John
            person.setAge(18);
            System.out.println("fullName = " + person.getFullName());
            System.out.println("teen = " + person.isTeen());

            person.setLastName("Smith"); // lastName is set to Smith
            System.out.println("fullName = " + person.getFullName());


        }

}