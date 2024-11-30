public class StaticExample {
   static int x=10;

    public static void main(String[] args) {
    StaticExample t=new StaticExample();
    System.out.println(t.x);
    System.out.println(StaticExample.x); // Non-standard and it is not recommended
    System.out.println(x);
    }
}
