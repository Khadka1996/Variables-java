public class ClassLevelStaticVariable {
    static int shareCount = 0;

    public ClassLevelStaticVariable() {
        shareCount++;
    }

    public static void main(String[] args) {
        System.out.println("Static Variable : " + shareCount );

        ClassLevelStaticVariable obj1 = new ClassLevelStaticVariable();
        ClassLevelStaticVariable obj2 = new ClassLevelStaticVariable();

        System.out.println("Static Variable after creation of object : " + shareCount );
    }
}
