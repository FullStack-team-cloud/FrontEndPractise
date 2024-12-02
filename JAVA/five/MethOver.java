public class MethOver {
    public static void main(String args[]){
        System.out.println("This is main method print statement");
        System.out.println(MethOver.overloadMethod());
        System.out.println(MethOver.overloadMethod("xyz"));
        System.out.println(MethOver.overloadMethod("abc",20));
    }
    public static String overloadMethod(){
        return "This is overload method without parameters";  
    }
    public static String overloadMethod(String and){
        return "This is overload method with a string";  
    }
    public static String overloadMethod(String and, int a){
        return "This is overload method with a integer";  
    }
}