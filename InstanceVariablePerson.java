public class InstanceVariablePerson {

    // Instance variables
    String name1;
    int age1;

    // Constructor to initialize instance variables
 public InstanceVariablePerson(String name, int age) {
        this.name1 = name;
        this.age1 = age;
    }

    // method to display instance variables

    public void displayInstanceVariables() {
        System.out.println("Name: " + name1);
        System.out.println("Age: " + age1);
    }

    public static void main(String[] args) {

          // Creating objects of the InstanceVariablePerson class
        InstanceVariablePerson person1 = new InstanceVariablePerson("Manish",16);
        InstanceVariablePerson person2 = new InstanceVariablePerson("Sandy",16);


          // Accessing instance variables through methods
        person1.displayInstanceVariables();
        person2.displayInstanceVariables();
    }

    
}
