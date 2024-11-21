public class MethodOverLoad {
    public static void main(String agrs[]) {
        MethodHello m = new MethodHello();
        m.hello();
        m.hello(5);         // Same method name, but different parameters - Method overloading
    }
}