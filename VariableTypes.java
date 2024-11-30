public class VariableTypes {
    static int staticCounter = 0;
    int instanceCounter = 0;

    public VariableTypes() {
        staticCounter++;
        instanceCounter++;
    }

    public static void main(String[] args) {
        System.out.println("Initial staticCounter:"+staticCounter);

        VariableTypes obj1 = new VariableTypes();
        System.out.println("After Object is created");
        System.out.println("Static Counter:"+staticCounter);
        System.out.println("Instance Counter:"+obj1.instanceCounter);

        VariableTypes obj2 = new VariableTypes();
        System.out.println("After Object is created");
        System.out.println("Static Counter:"+staticCounter);
        System.out.println("Instance Counter:"+obj2.instanceCounter);

    }
}
