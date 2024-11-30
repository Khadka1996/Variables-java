public class StaticVariableWithStaticMethod {
    static int sharedResource=50;

    public static void updateResource(int value) {
        sharedResource+=value;
    }
    public static void main(String[] args) {
        System.out.println("Initial shared Resoure : " + sharedResource);

        StaticVariableWithStaticMethod.updateResource(20);

        System.out.println("Updated Shared Resource : " + sharedResource);
    }
    
}
