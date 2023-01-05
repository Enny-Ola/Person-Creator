package PersonCreator;
// creating person class
public class Person {
        // defining properties 
        private String firstName;
        private String lastName;
        private int age;
        private int height;
        private double weight;
    // creating constructor and using get and set methods for properties  
    public Person(String firstName, String lastName, int age, int height, double weight) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String newFirstName) {
        this.firstName=newFirstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String newLastName) {
        this.lastName=newLastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        this.age=newAge;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int newHeight) {
        this.height=newHeight;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double newWeight) {
        this.weight=newWeight;
    }
}
