public class StaticVariableInNestedClass {
    static class Nested{
        static int NestedValue =100;
    
        static void displayValue(){
            System.out.println("Nested value: " + NestedValue);
        }
    }

    public static void main(String[] args) {
        System.out.println("Ascessing nested value static variables: " +Nested.NestedValue );
        Nested.displayValue();
    }
}
