public class StaticVariableInNonStaticContext {
    static int counter = 0;

    public void increamentCounter() {
        counter++;
    }
    public static void main(String[] args) {
        StaticVariableInNonStaticContext obj1 = new StaticVariableInNonStaticContext();
        StaticVariableInNonStaticContext obj2 = new StaticVariableInNonStaticContext();

        obj1.increamentCounter();
        obj2.increamentCounter();
        System.out.println("Static variable:"+counter);
    }
}
