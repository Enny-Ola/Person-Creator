package PersonCreator;

public class PersonCreator {
    public static void main(String[] args) {
        Person Person01 = new Person(null, null, 0, 0, 0); // create person01 object
        Person Person02 = new Person(null, null, 0, 0, 0); // create person02 object
// set properties for person01 and print their details
Person01.setFirstName("James");
Person01.setLastName("Peterson");
Person01.setAge(34);
Person01.setHeight(180);
Person01.setWeight(73.5);
System.out.println(Person01.getFirstName() + " " + Person01.getLastName() +
" is " + Person01.getAge() + " years old, " + 
Person01.getHeight() + "cms tall, and weighs " + 
Person01.getWeight() + "lbs.\n");

// set properties for person02 and print their details
Person02.setFirstName("Bob");
Person02.setLastName("Thornley");
Person02.setAge(25);
Person02.setHeight(171);
Person02.setWeight(68.2);
System.out.println(Person02.getFirstName() + " " + Person02.getLastName() +
" is " + Person02.getAge() + " years old, " + 
Person02.getHeight() + "cms tall, and weighs " + 
Person02.getWeight() + "lbs.");
    }   
}

