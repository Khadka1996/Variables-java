public class InstanceVariableswithDefaultValues {
    String brand;
    int year;
    double price;
    boolean booleanValue;


    public void displayDetails() {
        System.out.println("String: " + brand); 
        System.out.println("Int: " + year);   
        System.out.println("Double: " + price);
        System.out.println("boolean: " + booleanValue); 
    }

    public static void main(String[] args) {
        InstanceVariableswithDefaultValues defualtValues = new InstanceVariableswithDefaultValues();
        defualtValues.displayDetails();
    }
}
