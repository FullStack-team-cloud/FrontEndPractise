public class MethodOverride {
    public static void main(String args[]){
        Father obj1 = new Father();     // object created for Father class
        obj1.write();
        Son obj2 = new Son();       //overrides write() in Father class, even though Son extends Father class
        obj2.write();
        Father obj3 = new Son();        //overrides write() here also because Son is subclass of Father class
        obj3.write();
    }
}